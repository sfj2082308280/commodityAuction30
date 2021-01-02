package web.servlet;

import bean.Commodity;
import bean.User;
import service.CommodityService;
import service.UserService;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/adCommodityServlet")
public class AdCommodityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String run = request.getParameter("run");
        ServletContext servletContext = request.getServletContext();
        Integer commodity_id = Integer.parseInt(request.getParameter("commodity_id"));
        if(run.equals("add")){

        }else if(run.equals("mod")){
            CommodityService commodityService = new CommodityService();
            Commodity modCommodity = commodityService.getSingleCommodity(commodity_id);
            servletContext.setAttribute("modCommodity",modCommodity);
            response.sendRedirect("ad/modCommodity.jsp");
        }else if(run.equals("del")){
            CommodityService commodityService = new CommodityService();
            commodityService.delCommodity(commodity_id);
            List<Commodity> commodityLink = commodityService.getAllCommodity();
            servletContext.setAttribute("commodityLink",commodityLink);
            response.sendRedirect("ad/adCommodity.jsp");
        }
    }
}
