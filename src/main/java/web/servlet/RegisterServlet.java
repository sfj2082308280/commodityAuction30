package web.servlet;

import Dao.UserDao;
import bean.User;
import service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/registerServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        String idCard=request.getParameter("idCard");
        String phone=request.getParameter("phone");
        String address=request.getParameter("address");
        User user = new User(null,account,password,idCard,phone,address);
        UserService userService = new UserService();
        Integer count=userService.getUserAccountNum(account);
        if(count>0){
            PrintWriter writer = response.getWriter();
            writer.write("<script>");
            writer.write("alert('申请注册的email已经被占用！');");
//            writer.write("window.location.href='WEB-INF/loginAndRegister/register.jsp'");
            writer.write("</script>");
            writer.flush();
            writer.close();
            RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/loginAndRegister/register.jsp");
            dispatcher.forward(request,response);

        }
        else{
            //flag是否注册成功

            boolean flag=userService.saveUser(user);
            if(flag){
                //注册成功就跳转到登录页面 重定向
                response.sendRedirect("loginAndRegister/login.jsp");
            }else {
                //注册失败就返回注册页面 请求转发
                RequestDispatcher dispatcher = request.getRequestDispatcher("loginAndRegister/register.jsp");
                dispatcher.forward(request,response);
            }
        }
    }
}
