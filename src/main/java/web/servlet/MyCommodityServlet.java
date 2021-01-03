package web.servlet;

import bean.Commodity;
import bean.Deposit;
import bean.User;
import service.CommodityService;
import service.DepositService;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/myCommodityServlet")
public class MyCommodityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer commodity_id = Integer.parseInt(request.getParameter("commodity_id"));
        CommodityService commodityService = new CommodityService();
        String modOrDel = request.getParameter("modOrDel");
        if(modOrDel.equals("del")){
            commodityService.delCommodity(commodity_id);
            ServletContext servletContext = request.getServletContext();
            DepositService depositService = new DepositService();
            Deposit singleDeposit = depositService.getSingleDeposit(commodity_id);
            depositService.delDeposit(singleDeposit.getDeposit_id());
            User user = (User)servletContext.getAttribute("user");
            List<Commodity> myCommodity = commodityService.getMyCommodity(user);
            servletContext.setAttribute("myCommodity",myCommodity);
            response.sendRedirect("user/function/my/myCommodity.jsp");
        }else if(modOrDel.equals("mod")){
            Commodity myModCommodity = commodityService.getSingleCommodity(commodity_id);
            ServletContext servletContext = request.getServletContext();
            servletContext.setAttribute("myModCommodity",myModCommodity);
            response.sendRedirect("user/function/my/myModCommodity.jsp");
//            ServletContext servletContext = request.getServletContext();
//            User user = (User)servletContext.getAttribute("user");
//            List<Commodity> myCommodity = commodityService.getMyCommodity(user);
//            servletContext.setAttribute("myCommodity",myCommodity);
//            response.sendRedirect("user/function/my/myCommodity.jsp");
        }

    }
}
