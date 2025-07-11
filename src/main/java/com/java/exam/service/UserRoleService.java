package com.java.exam.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.java.exam.entity.UserRole;

import java.util.List;

public interface UserRoleService extends IService<UserRole> {

    String getMenuInfo(Integer roleId);

    List<UserRole> getUserRole();
}
