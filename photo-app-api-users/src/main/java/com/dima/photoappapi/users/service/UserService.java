package com.dima.photoappapi.users.service;

import com.dima.photoappapi.users.shared.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDetails);
}
