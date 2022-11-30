package com.jct.springboot.service.impl;

import com.jct.springboot.entity.Article;
import com.jct.springboot.mapper.ArticleMapper;
import com.jct.springboot.service.IArticleService;
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
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
