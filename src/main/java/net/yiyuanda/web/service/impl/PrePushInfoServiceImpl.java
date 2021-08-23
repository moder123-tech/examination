package net.yiyuanda.web.service.impl;

import net.yiyuanda.web.bean.PrePushInfo;
import net.yiyuanda.web.mapper.PrePushInfoMapper;
import net.yiyuanda.web.service.PrePushInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : wx  //作者
 * @version 1.0 //版本
 * @date: 2021-08-23 21:01 //日期
 */
@Service
public class PrePushInfoServiceImpl implements PrePushInfoService {

    @Autowired
    private PrePushInfoMapper prePushInfoMapper;
    @Override
    public List<PrePushInfo> getAllPrePushInfo() {
        return prePushInfoMapper.selectList(null);
    }
}
