package web.filter;//package web.filter;
//
//import bean.Commodity;
//import bean.User;
//import service.UserService;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import java.io.IOException;
//import java.util.LinkedList;
//import java.util.List;
//
//@WebFilter(urlPatterns = "/shop.jsp")
//public class MainFilter implements Filter {
//    List<Commodity> commodityLink=new LinkedList<>();
//    public void destroy() {
//        this.commodityLink=null;
//    }
//
//    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
//        req.setCharacterEncoding("UTF-8");
//        resp.setContentType("text/html;charset=UTF-8");
//        ServletContext servletContext = req.getServletContext();
//        User user =(User)servletContext.getAttribute("user");
//        UserService userService = new UserService();
//        this.commodityLink = userService.getCommodity(user);
//        servletContext.setAttribute("CommodityLink",this.commodityLink);
//        for(Commodity commodity:this.commodityLink){
//            System.out.println(commodity);
//        }
//        chain.doFilter(req, resp);
//    }
//
//    public void init(FilterConfig config) throws ServletException {
//
//
//    }
//
//}
