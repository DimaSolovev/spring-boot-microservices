package com.dima.mobileappws.userservice;

import com.dima.mobileappws.ui.model.request.UserDetailsRequestModel;
import com.dima.mobileappws.ui.model.response.UserRest;

public interface UserService {
    UserRest createUser(UserDetailsRequestModel userDetails);
}