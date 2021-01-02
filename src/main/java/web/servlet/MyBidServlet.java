package web.servlet;

import bean.Bid;
import bean.Commodity;
import bean.User;
import service.BidService;
import service.CommodityService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/myBidServlet")
public class MyBidServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        ServletContext servletContext = request.getServletContext();
//        User user = (User)servletContext.getAttribute("user");
//        CommodityService commodityService = new CommodityService();
//        List<Commodity> bidCommodity = commodityService.getBidCommodity(user);
//        servletContext.setAttribute("bidCommodity",bidCommodity);
//        response.sendRedirect("user/function/my/myBid.jsp");
    }
}
