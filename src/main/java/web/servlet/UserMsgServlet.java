package web.servlet;

import bean.User;
import service.UserService;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/userMsgServlet")
public class UserMsgServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        String IDcard = request.getParameter("IDcard");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        ServletContext servletContext = request.getServletContext();
        User user = (User)servletContext.getAttribute("user");
        user.setUser_account(account);
        user.setUser_password(password);
        user.setUser_idCard(IDcard);
        user.setUser_phone(phone);
        user.setUser_address(address);
        UserService userService = new UserService();
        userService.updateUser(user);
        servletContext.setAttribute("user",user);
        response.sendRedirect("user/function/shop.jsp");
    }
}
