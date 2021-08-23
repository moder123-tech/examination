package net.yiyuanda.web.service.impl;

import net.yiyuanda.web.bean.BaoYanDryGood;
import net.yiyuanda.web.mapper.BaoYanDryGoodMapper;
import net.yiyuanda.web.service.BaoYanDryGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : wx  //作者
 * @version 1.0 //版本
 * @date: 2021-08-23 20:59 //日期
 */
@Service
public class BaoYanDryGoodServiceImpl implements BaoYanDryGoodService {

    @Autowired
    private BaoYanDryGoodMapper baoYanDryGoodMapper;

    @Override
    public List<BaoYanDryGood> getAllBaoYanDryGood() {
        return baoYanDryGoodMapper.selectList(null);
    }
}
