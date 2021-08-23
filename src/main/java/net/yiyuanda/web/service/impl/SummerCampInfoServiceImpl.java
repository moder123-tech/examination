package net.yiyuanda.web.service.impl;

import net.yiyuanda.web.bean.SummerCampInfo;
import net.yiyuanda.web.mapper.SummerCampInfoMapper;
import net.yiyuanda.web.service.SummerCampInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : wx  //作者
 * @version 1.0 //版本
 * @date: 2021-08-23 21:02 //日期
 */
@Service
public class SummerCampInfoServiceImpl implements SummerCampInfoService {

    @Autowired
    private SummerCampInfoMapper summerCampInfoMapper;
    @Override
    public List<SummerCampInfo> getAllSummerCampInfo() {
        return summerCampInfoMapper.selectList(null);
    }
}
