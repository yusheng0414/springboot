package com.jct.springboot.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jct.springboot.entity.Course;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 涛哥哥
 * @since
 */
public interface ICourseService extends IService<Course> {

    Page<Course> findPage(Page<Course> page, String name);

    void setStudentCourse(Integer courseId, Integer studentId);
}
