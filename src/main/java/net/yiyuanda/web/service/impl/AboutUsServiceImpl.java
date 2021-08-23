package net.yiyuanda.web.service.impl;

import net.yiyuanda.web.bean.AboutUs;
import net.yiyuanda.web.mapper.AboutUsMapper;
import net.yiyuanda.web.service.AboutUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : wx  //作者
 * @version 1.0 //版本
 * @date: 2021-08-23 20:58 //日期
 */
@Service
public class AboutUsServiceImpl implements AboutUsService {


    @Autowired
    private AboutUsMapper aboutUsMapper;

    @Override
    public List<AboutUs> getAllAboutUs() {
        return aboutUsMapper.selectList(null);
    }
}
