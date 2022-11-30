package com.jct.springboot.service;

import com.jct.springboot.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 涛哥哥
 * @since
 */
public interface IMenuService extends IService<Menu> {

    List<Menu> findMenus(String name);
}
