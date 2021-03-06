package web.servlet;

import bean.Administrator;
import bean.Commodity;
import bean.Deposit;
import bean.User;
import service.CommodityService;
import service.DepositService;
import service.UserService;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/adMenuServlet")
public class AdMenuServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        ServletContext servletContext = request.getServletContext();
        UserService userService = new UserService();
        int path = Integer.parseInt(request.getParameter("path"));
        if(path==1){
            List<User> userList = userService.getAllUser();
            servletContext.setAttribute("userList",userList);
            response.sendRedirect("ad/adAccount.jsp");
        }else if(path==2){
            CommodityService commodityService = new CommodityService();
            List<Commodity> commodityLink=commodityService.getAllCommodity();
            servletContext.setAttribute("commodityLink",commodityLink);
            response.sendRedirect("ad/adCommodity.jsp");
        }else if(path==3){
            CommodityService commodityService = new CommodityService();
            List<Commodity> identCommodityList = commodityService.getIdentCommodity(0);
            servletContext.setAttribute("identCommodityList",identCommodityList);
            response.sendRedirect("ad/adIdentCommodity.jsp");
        }else if(path==4){
            Administrator adUser = null;
            servletContext.setAttribute("adUser",adUser);
            response.sendRedirect("loginAndRegister/login.jsp");
        }
        else if(path==5){
            DepositService depositService = new DepositService();
            List<Deposit> depositList = depositService.getAllDeposit();
            servletContext.setAttribute("depositList",depositList);
            response.sendRedirect("ad/adDeposit.jsp");
        }
    }
}
