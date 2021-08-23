package net.yiyuanda.web.service.impl;

import net.yiyuanda.web.bean.Coach;
import net.yiyuanda.web.mapper.CoachMapper;
import net.yiyuanda.web.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : wx  //作者
 * @version 1.0 //版本
 * @date: 2021-08-23 21:01 //日期
 */
@Service
public class CoachServiceImpl implements CoachService {


    @Autowired
    private CoachMapper coachMapper;
    @Override
    public List<Coach> getAllCoach() {
        return coachMapper.selectList(null);
    }
}
