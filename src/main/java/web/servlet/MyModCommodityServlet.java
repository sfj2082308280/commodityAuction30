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
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet(urlPatterns = "/myModCommodityServlet")
public class MyModCommodityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        this.requestDateObj(request);
        response.sendRedirect("user/function/my/myCommodity.jsp");
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
        String startTimeStr = request.getParameter("startTime");
        String endTimeStr = request.getParameter("endTime");
        Date endTime=null;
        Date startTime=null;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try {
            endTime=sdf.parse(endTimeStr);
            startTime=sdf.parse(startTimeStr);
            Commodity myModCommodity = (Commodity)servletContext.getAttribute("myModCommodity");
            myModCommodity.setCommodity_name(name);
            myModCommodity.setCommodity_introduce(introduce);
            myModCommodity.setCommodity_endTime(endTime);
            myModCommodity.setCommodity_startTime(startTime);
            CommodityService commodityService = new CommodityService();
            commodityService.updateCommodity(myModCommodity);
            servletContext.setAttribute("myModCommodity",myModCommodity);
            User user = (User)servletContext.getAttribute("user");
            List<Commodity> myCommodity = commodityService.getMyCommodity(user);
            servletContext.setAttribute("myCommodity",myCommodity);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
