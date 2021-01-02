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

        if(type.equals("account")){
            UserService userService = new UserService();
            User user=userService.getUserByEmailAndPassword(account,password);
            ServletContext servletContext = request.getServletContext();
            servletContext.setAttribute("user",user);
            if(user!=null){
                CommodityService commodityService = new CommodityService();
                List<Commodity> commodityLink=commodityService.getAllCommodity();
                servletContext.setAttribute("commodityLink",commodityLink);
                response.sendRedirect("user/function/shop.jsp");
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
        }else if(type.equals("administrator")){
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
