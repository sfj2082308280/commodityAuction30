package web.servlet;

import Dao.UserDao;
import bean.Administrator;
import bean.Commodity;
import bean.User;
import service.AdService;
import service.CommodityService;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

@WebServlet(urlPatterns = "/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        String type=request.getParameter("type");
        //判断是否用户登录
        if(type.equals("account")){
            //得到用户对象
            UserService userService = new UserService();
            User user=userService.getUserByEmailAndPassword(account,password);
            //将用户对象存储到作用域中
            ServletContext servletContext = request.getServletContext();
            servletContext.setAttribute("user",user);
            //判断数据库是否有此用户
            if(user!=null){
                //取出所有认证的商品
                CommodityService commodityService = new CommodityService();
                List<Commodity> commodityLink=commodityService.getAllCommodity();
                //将所有认证的商品存入作用域中
                servletContext.setAttribute("commodityLink",commodityLink);
                response.sendRedirect("user/function/shop.jsp");
            }
            //密码或账号输入错误,弹出提示信息
            else{
                PrintWriter writer = response.getWriter();
                writer.write("<script>");
                writer.write("alert('密码或账号不对！');");
                writer.write("window.location.href='loginAndRegister/login.jsp'");
                writer.write("</script>");
                writer.flush();
                writer.close();
            }
        }
        //如果是管理员登录
        else if(type.equals("administrator")){
            //获取管理员对象
            AdService adService = new AdService();
            Administrator adUser = adService.getAdUserByEmailAndPassword(account, password);
            if(adUser!=null){
                ServletContext servletContext = request.getServletContext();
                servletContext.setAttribute("adUser",adUser);
                UserService userService = new UserService();
                List<User> userList = userService.getAllUser();
                servletContext.setAttribute("userList",userList);
                response.sendRedirect("ad/adAccount.jsp");
            }
            else{
                PrintWriter writer = response.getWriter();
                writer.write("<script>");
                writer.write("alert('密码或账号不对！');");
                writer.write("window.location.href='loginAndRegister/login.jsp'");
                writer.write("</script>");
                writer.flush();
                writer.close();
            }


        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
