package com.yjs.cloud.learning.learn.common.controller;

import com.yjs.cloud.learning.learn.common.loginuser.LoginUserHolder;
import com.yjs.cloud.learning.learn.common.loginuser.dto.UserDTO;
import com.yjs.cloud.learning.learn.common.web.GlobalException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 公共Controller
 *
 * @author Andrew.xiao
 * @since 2019/6/10
 */
@Component
public class BaseController {

    @Resource
    private LoginUserHolder loginUserHolder;

    public UserDTO getUser() {
        return loginUserHolder.getCurrentUser();
    }

    public Long getLoginUserId() {
        Long id = getUser().getId();
        if (id == null) {
            throw new GlobalException("用户未登录");
        }
        return id;
    }

    public Long getDepartmentId() {
        UserDTO user = getUser();
        Long id = user.getId();
        if (id == null) {
            throw new GlobalException("用户未登录");
        }
        return user.getDepartmentId();
    }

}
