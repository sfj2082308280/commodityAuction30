package web.servlet;

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
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet(urlPatterns = "/modCommodityServlet")
public class ModCommodityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
    private void requestDateObj(HttpServletRequest request) {
        //获取页面参数
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        ServletContext servletContext = request.getServletContext();
        String name = request.getParameter("name");
        String introduce = request.getParameter("introduce");
        Double price = Double.parseDouble(request.getParameter("price"));
        String startTimeStr = request.getParameter("startTime");
        String endTimeStr = request.getParameter("endTime");
        String ident = request.getParameter("ident");
        Date startTime=null;
        Date endTime=null;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        if(price<=0){
            price=0.0;
        }
        try {
            startTime=sdf.parse(startTimeStr);
            endTime=sdf.parse(endTimeStr);
//            String dir=this.getServletContext().getRealPath("/user/function/img");
//            File photoDir = new File(dir);
//            if(!photoDir.exists()){
//                photoDir.mkdirs();
//            }
//            //上传到服务器文件路径 imgDir+'/'+fileName
            Commodity modCommodity = (Commodity)servletContext.getAttribute("modCommodity");
            modCommodity.setCommodity_name(name);
            modCommodity.setCommodity_introduce(introduce);
            modCommodity.setCommodity_price(price);
            modCommodity.setCommodity_startTime(startTime);
            modCommodity.setCommodity_endTime(endTime);

            if(ident.equals("notIdent")){
                modCommodity.setCommodity_ident(0);
                modCommodity.setBuyer_id(null);
                DepositService depositService = new DepositService();
                Deposit singleDeposit = depositService.getSingleDeposit(modCommodity.getCommodity_id());
                depositService.delDeposit(singleDeposit.getDeposit_id());
            }
            CommodityService commodityService = new CommodityService();
            commodityService.updateCommodity(modCommodity);
            servletContext.setAttribute("modCommodity",modCommodity);
            List<Commodity> commodityLink=commodityService.getAllCommodity();
            servletContext.setAttribute("commodityLink",commodityLink);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        this.requestDateObj(request);

        response.sendRedirect("ad/adCommodity.jsp");
    }
}
