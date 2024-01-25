//package com.web.user.controller.pc;
//
//import com.web.user.controller.base.BaseController;
//import com.web.user.system.dto.LoginBody;
//import com.web.user.system.service.UserBodyService;
//import com.web.user.system.vo.AjaxResult;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("")
//@Api(value = "/pc", tags = {"用户登录"})
//public class SysUserLoginController extends BaseController {
//
//    @Autowired
//    private UserBodyService userBodyService;
//
//
//    @ApiOperation(value = "用户登录", notes = "用户登录", httpMethod = "POST", response = String.class)
//    @PostMapping("/login")
//    public AjaxResult login(@RequestBody LoginBody loginBody) {
//        String token = userBodyService.selectUserBodyByUserName(loginBody);
//        if (token == null) {
//            return AjaxResult.error("账号或密码错误!");
//        } else {
//            AjaxResult result = AjaxResult.success("登录成功!");
//            result.put("token",token);
//            return result;
//        }
//    }
//}
