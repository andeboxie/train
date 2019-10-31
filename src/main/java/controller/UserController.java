package controller;

import entity.UserInfo;
import enums.RCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;
import util.ResponseResult;

import javax.servlet.http.HttpServletRequest;

@Controller("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登录接口
     * @param userInfo 用户信息
     * @param request 请求
     * @return
     */
    @PostMapping("/login")
    @ResponseBody
    public ResponseResult login(UserInfo userInfo, HttpServletRequest request){
        UserInfo userInfo1 = userService.selectByUserAccount(userInfo);//查询用户是否存在
        if(userInfo1 == null)return ResponseResult.error(RCode.LOGIN_ERROR);//用户不存在通知前端跳转注册
        if(userInfo1.getUserPwd() == null || userInfo1.getUserPwd().equals(userInfo.getUserPwd())){//判断用户密码是否正确
            request.getSession().setAttribute("user",userInfo1);//向缓存中加入登录信息
            return ResponseResult.success();//通知前端登录成功跳转页面
        }
        return ResponseResult.error(RCode.LOGIN_ERROR);
    }

    /**
     * 退出登录
     * @param request
     * @return
     */
    @GetMapping("/logout")
    @ResponseBody
    public ResponseResult logout(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        Object user = request.getSession().getAttribute("user");
        if(user!=null){
            logout(request);
        }
        return ResponseResult.success();
    }

    /**
     * 注册用户
     * @param userInfo 要注册的用户信息
     * @return
     */
    @PostMapping("/register")
    @ResponseBody
    public ResponseResult register(UserInfo userInfo){
        UserInfo userInfo1 = userService.selectByUserAccount(userInfo);//查询用户名是否存在
        if(userInfo1 == null){
            String userPwd = userInfo1.getUserPwd();
            if(userPwd == null || userPwd.length()<6){//判断密码是否正确
                return ResponseResult.error(RCode.INCORRECT_PASSWORD_FORMAT);
            }
            try {
                Integer row = userService.insert(userInfo);//注册用户
                return ResponseResult.success();//通知前端成功跳转登录页面
            }catch (Exception e){
                return ResponseResult.error(RCode.UNKNOWN_ERROR);
            }
        }else{
            return ResponseResult.error(RCode.ACCOUNT_EXIST);
        }
    }
}
