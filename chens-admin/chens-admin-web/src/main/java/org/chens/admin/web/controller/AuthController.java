package org.chens.admin.web.controller;


import org.chens.admin.service.AuthFacade;
import org.chens.core.vo.Result;
import org.chens.framework.auth.vo.AuthRequest;
import org.chens.framework.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 权限控制
 *
 * @author songchunlei@qq.com
 * @create 2018/3/5
 */
@Controller
@RequestMapping("/authController")
public class AuthController extends BaseController {

    @Autowired
    private AuthFacade authFacade;

    @Autowired
    private ISysUserService sysUserService;

    @Autowired
    private ISysTenantService sysTenantService;

    /**
     * 登录
     * @param authRequest
     * @return
     * @throws Exception
     */
    @IgnoreUserToken
    @PostMapping("/login")
    public ResponseEntity<Result> login(@RequestBody AuthRequest authRequest) throws Exception {
        if(authRequest==null){
            throw new BaseException(BaseExceptionEnum.REQUEST_NULL);
        }
        if(StringUtils.isEmpty(authRequest.getUserName()))
        {
            throw new BaseException(BaseExceptionEnum.AUTH_REQUEST_NO_USERNAME);
        }
        if(StringUtils.isEmpty(authRequest.getPassword()))
        {
            throw new BaseException(BaseExceptionEnum.AUTH_REQUEST_NO_PASSWORD);
        }
        if(authRequest!=null)
        {
            //logger.info("login****************");
            return doSuccess(CommonConstants.QUERY_SUCCESS,authService.login(authRequest));
        }
        throw new BaseException(BaseExceptionEnum.AUTH_REQUEST_ERROR);
    }

    /**
     * 退出
     * @return
     */
    @RequestMapping("/logout")
    public ResponseEntity<Result> logout() {
        return doSuccess(CommonConstants.DELETE_SUCCESS,authService.logout());
    }


    /**
     * 注册用户
     * @param sysUser
     * @return
     */
    @IgnoreUserToken
    @PostMapping("registerUser")
    public ResponseEntity<Result> registerUser(@RequestBody @Validated SysUser sysUser) {
        if(sysUser!=null)
        {
            if(StringUtils.isEmpty(sysUser.getPassword()))
            {
                throw new BaseException(BaseExceptionEnum.AUTH_REQUEST_NO_PASSWORD);
            }
            return doSuccess(CommonConstants.SAVE_SUCCESS,sysUserService.insert(sysUser));
        } else {
            throw new BaseException(BaseExceptionEnum.REQUEST_NULL);
        }
    }

    /**
     * 注册租户
     * @param registerTenant
     * @return
     */
    @IgnoreUserToken
    @PostMapping("register")
    public ResponseEntity<Result> register(@RequestBody @Validated RegisterTenant registerTenant) {
        if(registerTenant!=null)
        {

            return doSuccess(CommonConstants.SAVE_SUCCESS,sysTenantService.register(registerTenant));
        } else {
            throw new BaseException(BaseExceptionEnum.REQUEST_NULL);
        }
    }



    /**
     * 解析token
     * @param token
     * @return
     */
    @IgnoreUserToken
    @RequestMapping("/parseToken")
    public ResponseEntity<Result> parseToken(@RequestParam String token) throws Exception {
        return doSuccess(CommonConstants.QUERY_SUCCESS,authService.parseToken(token)) ;
    }

}
