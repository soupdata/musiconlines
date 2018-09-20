import com.online.dao.Users;
import com.online.dao.UsersOperation;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletTest")
public class ServletTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("servlet action");
        String loginName= request.getParameter("username");
        String loginPassword = request.getParameter("passwd");
//        String loginName ="zqr";
//        String loginPassword ="123";
        System.out.println(loginName);
        System.out.println(loginPassword);
        //boolean flag=false;
        Users users=new UsersOperation();
        boolean flag=users.LoginuserCounter(loginName,loginPassword);
        JSONObject jsondata=new JSONObject();
        try {
            jsondata.put("flag",flag);
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");

            response.getWriter().println("true");

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置网页响应类型
//        response.setContentType("text/html");
//        //实现具体操作
//        PrintWriter out = response.getWriter();
//        out.println("This is a new servlet page");
        doPost(request,response);
    }
}
