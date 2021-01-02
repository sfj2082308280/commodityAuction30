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
import java.util.List;

@WebServlet(urlPatterns = "/modAccountServlet")
public class ModAccountServlet extends HttpServlet {
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
        User modUser = (User)servletContext.getAttribute("modUser");
        modUser.setUser_account(account);
        modUser.setUser_password(password);
        modUser.setUser_idCard(IDcard);
        modUser.setUser_phone(phone);
        modUser.setUser_address(address);
        UserService userService = new UserService();
        userService.updateUser(modUser);
        servletContext.setAttribute("modUser",modUser);
        List<User> userList = userService.getAllUser();
        servletContext.setAttribute("userList",userList);
        response.sendRedirect("ad/adAccount.jsp");
    }
}
