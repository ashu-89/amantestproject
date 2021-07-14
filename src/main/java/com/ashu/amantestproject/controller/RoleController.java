package com.ashu.amantestproject.controller;

import com.ashu.amantestproject.entity.RoleEntity;
import com.ashu.amantestproject.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    RoleService roleService;

    @RequestMapping(path = "/roles", method = RequestMethod.GET)
    public List<RoleEntity> getAllRoles(){
        return roleService.getAllRoles();
    }

}
