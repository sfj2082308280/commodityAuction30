package web.servlet;

import bean.Commodity;
import bean.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/shopServlet")
public class ShopServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ServletContext servletContext = request.getServletContext();
        String path = request.getParameter("path");
        String name=request.getParameter("name");
        String price=request.getParameter("price");
        String commodity_deposit=request.getParameter("commodity_deposit");
        Integer commodity_id = Integer.parseInt(request.getParameter("commodity_id"));
//        HttpSession session request.getSession();
        HttpSession session = request.getSession();
        session.setAttribute("commodity_deposit",commodity_deposit);
        session.setAttribute("commodity_id",commodity_id);
        session.setAttribute("name",name);
        session.setAttribute("path",path);
        session.setAttribute("price",price);
//        request.getRequestDispatcher("user/function/shopShow.jsp").forward(request, response);
        response.sendRedirect("user/function/shopShow.jsp");

    }
}
