package net.yiyuanda.web.service.impl;

import net.yiyuanda.web.bean.BigData;

import net.yiyuanda.web.mapper.BigDataMapper;
import net.yiyuanda.web.service.BigDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : wx  //作者
 * @version 1.0 //版本
 * @date: 2021-08-23 21:01 //日期
 */
@Service
public class BigDataServiceImpl implements BigDataService {

    @Autowired
    private BigDataMapper bigDataMapper;
    @Override
    public List<BigData> getAllBigData() {
        return bigDataMapper.selectList(null);
    }
}
