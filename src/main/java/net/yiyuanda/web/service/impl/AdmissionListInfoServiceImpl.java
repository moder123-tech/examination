package net.yiyuanda.web.service.impl;

import net.yiyuanda.web.bean.AdmissionListInfo;
import net.yiyuanda.web.mapper.AdmissionListInfoMapper;
import net.yiyuanda.web.service.AdmissionListInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : wx  //作者
 * @version 1.0 //版本
 * @date: 2021-08-23 20:59 //日期
 */
@Service
public class AdmissionListInfoServiceImpl implements AdmissionListInfoService {

    @Autowired
    private AdmissionListInfoMapper admissionListInfoMapper;

    @Override
    public List<AdmissionListInfo> getAllAdmissionListInfo() {
        return admissionListInfoMapper.selectList(null);
    }
}
