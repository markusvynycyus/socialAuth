package com.venicios.socialAuth.domain.service;

import com.venicios.socialAuth.domain.exception.UserNaoEncontradoException;
import com.venicios.socialAuth.domain.model.User;
import com.venicios.socialAuth.repository.RoleRepository;
import com.venicios.socialAuth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;




    public User buscarOuFalhar(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new UserNaoEncontradoException(userId));
    }



}
