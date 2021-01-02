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
            writer.write("window.location.href='loginAndRegister/register.jsp'");
            writer.write("</script>");
            writer.flush();
            writer.close();
//            response.sendRedirect("loginAndRegister/register.jsp");

        }
        else{

            if(account!=null){
                userService.saveUser(user);
                response.sendRedirect("loginAndRegister/login.jsp");
            }else {
                response.sendRedirect("loginAndRegister/login.jsp");
            }
        }
    }
}
