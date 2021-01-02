package web.servlet;

import Dao.UserDao;
import bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(urlPatterns = "/registerAjaxServlet")
public class RegisterAjaxServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        //获取前台提交的email和密码
        String account = request.getParameter("account");
        String type=request.getParameter("type");
        UserDao userDao = new UserDao();
        if("accountAjaxValidate".equals(type)){
            Integer count = userDao.getUserAccountNum(account);
            if(count>0){
                //数据库中已经由相同email的用户
                //通过response对象给客户端一个错误提示
                out.print("账号已被注册！");
//            PrintWriter writer = response.getWriter();
//            writer.write("<script>");
//            writer.write("alert('申请注册的email已经被占用！');");
//            writer.write("window.location.href='register.jsp'");
//            writer.write("</script>");
//            writer.flush();
//            writer.close();
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
