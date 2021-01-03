package web.servlet;

import bean.Commodity;
import service.CommodityService;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/identCommodityServlet")
public class IdentCommodityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String run = request.getParameter("run");
        ServletContext servletContext = request.getServletContext();
        Integer commodity_id = Integer.parseInt(request.getParameter("commodity_id"));
        if(run.equals("ident")){
            CommodityService commodityService = new CommodityService();
            commodityService.updateIdentCommodity(commodity_id);
            List<Commodity> commodityLink = commodityService.getAllCommodity();
            servletContext.setAttribute("commodityLink",commodityLink);
            List<Commodity> identCommodityList = commodityService.getIdentCommodity(0);
            servletContext.setAttribute("identCommodityList",identCommodityList);
            response.sendRedirect("ad/adIdentCommodity.jsp");
        }else if(run.equals("del")){
            CommodityService commodityService = new CommodityService();
            commodityService.delCommodity(commodity_id);
            List<Commodity> identCommodityList = commodityService.getIdentCommodity(0);
            servletContext.setAttribute("identCommodityList",identCommodityList);
            response.sendRedirect("ad/adIdentCommodity.jsp");
        }
    }
}
