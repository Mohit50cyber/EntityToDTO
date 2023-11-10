package com.javaguide.UserDTO.service;

import com.javaguide.UserDTO.dto.UserLocationDto;
import com.javaguide.UserDTO.model.User;
import com.javaguide.UserDTO.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserLocationDto> getAllUserLocation(){
        return userRepository.findAll()
                .stream().map(this::convertEntityToDTO)
                .collect(Collectors.toList());
    }

    public UserLocationDto convertEntityToDTO(User user){

        UserLocationDto userLocationDto = new UserLocationDto();
        userLocationDto.setUserId(user.getId());
        userLocationDto.setEmail(user.getEmail());
        userLocationDto.setPlace(user.getLocation().getPlace());
        userLocationDto.setLongitude(user.getLocation().getLongitude());
        userLocationDto.setLatitude(user.getLocation().getLatitude());
        return userLocationDto;
    }
}
