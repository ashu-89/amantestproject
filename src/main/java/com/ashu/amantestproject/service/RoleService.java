package com.ashu.amantestproject.service;

import com.ashu.amantestproject.entity.RoleEntity;
import com.ashu.amantestproject.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    RoleRepository roleRepository;

    public List<RoleEntity> getAllRoles(){
        List<RoleEntity> roles = (List<RoleEntity>) roleRepository.findAll();
        return roles;
    }
}
