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

@WebServlet(urlPatterns = "/adAccountServlet")
public class AdAccountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String run = request.getParameter("run");
        ServletContext servletContext = request.getServletContext();
        Integer user_id = Integer.parseInt(request.getParameter("user_id"));
        if(run.equals("mod")){
            UserService userService = new UserService();
            User modUser = userService.getSingleUser(user_id);
            servletContext.setAttribute("modUser",modUser);
            response.sendRedirect("ad/modAccount.jsp");
        }else if(run.equals("del")){
            UserService userService = new UserService();
            userService.delUser(user_id);
            List<User> userList = userService.getAllUser();
            servletContext.setAttribute("userList",userList);
            response.sendRedirect("ad/adAccount.jsp");
        }
    }
}
