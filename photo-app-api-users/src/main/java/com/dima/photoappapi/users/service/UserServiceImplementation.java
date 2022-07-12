package com.dima.photoappapi.users.service;

import com.dima.photoappapi.users.data.UserEntity;
import com.dima.photoappapi.users.data.UsersRepository;
import com.dima.photoappapi.users.shared.UserDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImplementation implements UserService{

    private final UsersRepository usersRepository;

    public UserServiceImplementation(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public UserDto createUser(UserDto userDetails) {
        userDetails.setUserId(UUID.randomUUID().toString());
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserEntity userEntity = modelMapper.map(userDetails, UserEntity.class);
        userEntity.setEncryptedPassword("test");
        usersRepository.save(userEntity);
        return null;
    }
}
