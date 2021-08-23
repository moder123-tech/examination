package net.yiyuanda.web.service.impl;

import net.yiyuanda.web.bean.BaoYanStory;
import net.yiyuanda.web.mapper.BaoYanStoryMapper;
import net.yiyuanda.web.service.BaoYanStoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : wx  //作者
 * @version 1.0 //版本
 * @date: 2021-08-23 21:00 //日期
 */
@Service
public class BaoYanStoryServiceImpl implements BaoYanStoryService {

    @Autowired
    private BaoYanStoryMapper baoYanStoryMapper;
    @Override
    public List<BaoYanStory> getAllBaoYanStory() {
        return baoYanStoryMapper.selectList(null);
    }
}
