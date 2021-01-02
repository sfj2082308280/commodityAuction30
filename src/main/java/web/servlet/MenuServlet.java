package web.servlet;

import bean.Commodity;
import bean.User;
import service.CommodityService;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/menuServlet")
public class MenuServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ServletContext servletContext = request.getServletContext();
        CommodityService commodityService = new CommodityService();
        User user = (User)servletContext.getAttribute("user");
        int path = Integer.parseInt(request.getParameter("path"));
        if(path==1){

            List<Commodity> commodityLink=commodityService.getAllCommodity();
            servletContext.setAttribute("commodityLink",commodityLink);
            response.sendRedirect("user/function/shop.jsp");
        }else if(path==21){
            response.sendRedirect("user/function/userMsg.jsp");
        }else if(path==22){
            List<Commodity> bidCommodity = commodityService.getBidCommodity(user);
            servletContext.setAttribute("bidCommodity",bidCommodity);
            response.sendRedirect("user/function/my/myBid.jsp");
        }else if(path==23){
            List<Commodity> myCommodity = commodityService.getMyCommodity(user);
            servletContext.setAttribute("myCommodity",myCommodity);
            response.sendRedirect("user/function/my/myCommodity.jsp");
        }else if(path==24){

        }else if(path==3){
            response.sendRedirect("user/function/put.jsp");
        }else if(path==4){
            response.sendRedirect("user/function/matters.jsp");
        }
    }
}
