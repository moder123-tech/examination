package net.yiyuanda.web.service.impl;

import net.yiyuanda.web.bean.RealExperience;
import net.yiyuanda.web.mapper.RealExperienceMapper;
import net.yiyuanda.web.service.RealExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : wx  //作者
 * @version 1.0 //版本
 * @date: 2021-08-23 21:02 //日期
 */
@Service
public class RealExperienceServiceImpl implements RealExperienceService {

    @Autowired
    private RealExperienceMapper realExperienceMapper;
    @Override
    public List<RealExperience> getAllRealExperience() {
        return realExperienceMapper.selectList(null);
    }
}
