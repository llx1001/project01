package www.huihex.web;

import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import www.huihex.pojo.User;


/*
 * @author llx
 * @date 2020/6/4-14:08
 */
@Namespace("/")
@ParentPackage("struts-default")
public class LoginAction implements ModelDriven<User> {
    private User user = new User();

    @Override
    public User getModel() {
        return user;
    }

    @Action(value="login",results={@Result( name = "success",type = "redirect",location = "/success.jsp"),
            @Result(name ="failer", type ="redirect",location = "/failer.jsp")})
    // 登录操作
    public String login() {

        // 1.获取请求参数
        // System.out.println(username + " " + password);
        // System.out.println("loginAction....login....");

        // 2.判断
        if ("tom".equals(user.getUsername()) && "123".equals(user.getPassword())) {
            // 正确
            return "success";
        } else {
            // 错误
            return "failer";
        }
    }



}
