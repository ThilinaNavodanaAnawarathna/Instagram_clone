package com.ijse.instergram_clone.service;

import com.ijse.instergram_clone.bean.ResponceBean;
import com.ijse.instergram_clone.bean.UserRequestBean;

public interface UserService {
    public ResponceBean signIn(UserRequestBean userRequestBean) throws Exception;
    public ResponceBean createUser(UserRequestBean userRequestBean) throws Exception;
}
