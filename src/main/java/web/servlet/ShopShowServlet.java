package web.servlet;

import bean.Bid;
import bean.Commodity;
import bean.Deposit;
import bean.User;
import service.BidService;
import service.CommodityService;
import service.DepositService;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/shopShowServlet")
public class ShopShowServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ServletContext servletContext = request.getServletContext();
        User user = (User) servletContext.getAttribute("user");
        Double price = Double.parseDouble(request.getParameter("price"));
        Integer commodity_id = Integer.parseInt(request.getParameter("commodity_id"));
        String deposit = request.getParameter("deposit");
        String name=request.getParameter("name");
        CommodityService commodityService = new CommodityService();

        Commodity commodity = commodityService.getSingleCommodity(commodity_id);
        if(user.getUser_id().equals(commodity.getSeller_id())){
            PrintWriter writer = response.getWriter();
            writer.write("<script>");
            writer.write("alert('无法竞拍自己的商品！');");
            writer.write("window.location.href='user/function/shop.jsp'");
            writer.write("</script>");
            writer.flush();
            writer.close();
        }else if("deposit".equals(deposit)){
            commodityService.updateAddPrice(commodity_id,user.getUser_id(),price);
            List<Commodity> commodityLink=commodityService.getAllCommodity();
            Commodity commodity1 = commodityService.getSingleCommodity(commodity_id);
            DepositService depositService = new DepositService();
            Deposit singleDeposit = depositService.getSingleDeposit(commodity_id);
            if(singleDeposit!=null){
                depositService.delDeposit(singleDeposit.getDeposit_id());
            }
            Deposit deposit1 = new Deposit(null,commodity_id,user.getUser_id(),commodity1.getCommodity_deposit());
            depositService.saveDeposit(deposit1);
            servletContext.setAttribute("commodityLink",commodityLink);
            response.sendRedirect("user/function/shop.jsp");
        }
        else{
            PrintWriter writer = response.getWriter();
            writer.write("<script>");
            writer.write("alert('请交付押金！');");
            writer.write("window.location.href='user/function/shop.jsp'");
            writer.write("</script>");
            writer.flush();
            writer.close();
        }

    }
}
