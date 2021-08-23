package net.yiyuanda.web.service.impl;

import net.yiyuanda.web.bean.Template;
import net.yiyuanda.web.mapper.TemplateMapper;
import net.yiyuanda.web.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : wx  //作者
 * @version 1.0 //版本
 * @date: 2021-08-23 21:03 //日期
 */
@Service
public class TemplateServiceImpl implements TemplateService {

    @Autowired
    private TemplateMapper templateMapper;
    @Override
    public List<Template> getAllTemplate() {
        return templateMapper.selectList(null);
    }
}
