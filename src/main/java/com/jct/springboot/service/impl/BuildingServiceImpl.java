package com.jct.springboot.service.impl;

import com.jct.springboot.entity.Building;
import com.jct.springboot.mapper.BuildingMapper;
import com.jct.springboot.service.IBuildingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 涛哥哥
 * @since
 */
@Service
public class BuildingServiceImpl extends ServiceImpl<BuildingMapper, Building> implements IBuildingService {

}
