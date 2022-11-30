package com.jct.springboot.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jct.springboot.controller.dto.UserDTO;
import com.jct.springboot.controller.dto.UserPasswordDTO;
import com.jct.springboot.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 涛哥哥
 * @since
 */
public interface IUserService extends IService<User> {

    UserDTO login(UserDTO userDTO);

    User register(UserDTO userDTO);

    void updatePassword(UserPasswordDTO userPasswordDTO);

    Page<User> findPage(Page<User> objectPage, String username, String email, String address);
}
