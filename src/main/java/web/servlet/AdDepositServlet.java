package web.servlet;

import bean.Deposit;
import bean.User;
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

@WebServlet(urlPatterns = "/adDepositServlet")
public class AdDepositServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String run = request.getParameter("run");
        ServletContext servletContext = request.getServletContext();
        Integer deposit_id = Integer.parseInt(request.getParameter("deposit_id"));
        if(run.equals("add")){

        }else if(run.equals("re")){
            DepositService depositService = new DepositService();
            depositService.delDeposit(deposit_id);
            List<Deposit> depositList = depositService.getAllDeposit();
            servletContext.setAttribute("depositList",depositList);
            response.sendRedirect("ad/adDeposit.jsp");
        }else if(run.equals("del")){
            DepositService depositService = new DepositService();
            depositService.delDeposit(deposit_id);
            List<Deposit> depositList = depositService.getAllDeposit();
            servletContext.setAttribute("depositList",depositList);
            response.sendRedirect("ad/adDeposit.jsp");
        }
    }
}
