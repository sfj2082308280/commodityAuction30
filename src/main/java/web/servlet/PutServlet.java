package web.servlet;

import bean.Commodity;
import bean.User;
import service.CommodityService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
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
import java.util.LinkedList;
import java.util.List;

@WebServlet(urlPatterns = "/putServlet")
@MultipartConfig
public class PutServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        this.requestDateObj(request);
        ServletContext servletContext = request.getServletContext();
        CommodityService commodityService = new CommodityService();
        List<Commodity> commodityLink=commodityService.getAllCommodity();
        servletContext.setAttribute("commodityLink",commodityLink);
        response.sendRedirect("user/function/shop.jsp");
//        Double deposit = (Double)request.getParameter("deposit");
//        String
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/put.jsp");
        dispatcher.forward(request,response);*/
    }
    //获得页面数据
    private void requestDateObj(HttpServletRequest request) {
        //获取页面参数
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String name = request.getParameter("name");
        String introduce = request.getParameter("introduce");
        Double price = Double.parseDouble(request.getParameter("price"));
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String startTimeStr=request.getParameter("startTime");
        Date startTime=null;
        String endTimeStr=request.getParameter("endTime");
        Date endTime=null;
        try {
            startTime=sdf.parse(startTimeStr);
            endTime=sdf.parse(endTimeStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            Part part = request.getPart("photo");
            String fileName=part.getSubmittedFileName();
            String dir=this.getServletContext().getRealPath("/img");
            File photoDir = new File(dir);
            if(!photoDir.exists()){
                photoDir.mkdirs();
            }
            //上传到服务器文件路径 imgDir+'/'+fileName
            part.write(dir+"/"+fileName);
            User user = (User) request.getServletContext().getAttribute("user");
            Commodity commodity= new Commodity(null, null,user.getUser_id(),name,introduce,null,price,startTime,endTime,fileName,0);
            CommodityService commodityService = new CommodityService();
            commodityService.saveCommodity(commodity);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
        //从ServletContext中取出登录用户

    }
}
