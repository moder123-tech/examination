package net.yiyuanda.web.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import net.yiyuanda.web.bean.*;
import net.yiyuanda.web.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : wx  //作者
 * @version 1.0 //版本
 * @date: 2021-08-23 20:56 //日期
 */
@RestController
@Slf4j
@CrossOrigin
@RequestMapping("/info")
public class InformationController {

    @Autowired
    private AboutUsService aboutUsService;

    @Autowired
    private AdmissionListInfoService admissionListInfoService;

    @Autowired
    private BaoYanDryGoodService baoYanDryGoodService;

    @Autowired
    private BaoYanStoryService baoYanStoryService;

    @Autowired
    private BigDataService bigDataService;

    @Autowired
    private CoachService coachService;

    @Autowired
    private PrePushInfoService prePushInfoService;

    @Autowired
    private RealExperienceService realExperienceService;

    @Autowired
    private SummerCampInfoService summerCampInfoService;

    @Autowired
    private TemplateService templateService;

    @ApiOperation(value = "查询所有关于我们", notes = "查询所有关于我们")
    @GetMapping(value = "/about_us")
    public List<AboutUs> getAllAboutUs() {
        List<AboutUs> allAboutUs = aboutUsService.getAllAboutUs();
        return allAboutUs;
    }

    @ApiOperation(value = "查询所有录取名单信息", notes = "查询录取名单信息")
    @GetMapping(value = "/admission_list_info")
    public List<AdmissionListInfo> getAllAdmissionListInfo() {
        List<AdmissionListInfo> allAdmissionListInfo = admissionListInfoService.getAllAdmissionListInfo();
        return allAdmissionListInfo;
    }

    @ApiOperation(value = "查询所有保研干货", notes = "查询所有保研干货")
    @GetMapping(value = "/bao_yan_dry_good")
    public List<BaoYanDryGood> getAllBaoYanDryGood() {
        List<BaoYanDryGood> allBaoYanDryGood = baoYanDryGoodService.getAllBaoYanDryGood();
        return allBaoYanDryGood;
    }

    @ApiOperation(value = "查询所有保研故事", notes = "查询所有保研故事")
    @GetMapping(value = "/bao_yan_story")
    public List<BaoYanStory> getAllBaoYanStory() {
        List<BaoYanStory> allBaoYanStory = baoYanStoryService.getAllBaoYanStory();
        return allBaoYanStory;
    }

    @ApiOperation(value = "查询所有大数据", notes = "查询所有大数据")
    @GetMapping(value = "/big_data")
    public List<BigData> getAllBigData() {
        List<BigData> allBigData = bigDataService.getAllBigData();
        return allBigData;
    }

    @ApiOperation(value = "查询所有辅导服务", notes = "查询所有辅导服务")
    @GetMapping(value = "/coach")
    public List<Coach> getAllCoach() {
        List<Coach> allCoach = coachService.getAllCoach();
        return allCoach;
    }

    @ApiOperation(value = "查询所有预推免信息", notes = "查询所有预推免信息")
    @GetMapping(value = "/pre_push_info")
    public List<PrePushInfo> getAllPrePushInfo() {
        List<PrePushInfo> allPrePushInfo = prePushInfoService.getAllPrePushInfo();
        return allPrePushInfo;
    }

    @ApiOperation(value = "查询所有真题经验", notes = "查询所有真题经验")
    @GetMapping(value = "/real_experience")
    public List<RealExperience> getAllRealExperience() {
        List<RealExperience> allRealExperience = realExperienceService.getAllRealExperience();
        return allRealExperience;
    }

    @ApiOperation(value = "查询所有夏令营信息", notes = "查询所有夏令营信息")
    @GetMapping(value = "/summer_camp_info")
    public List<SummerCampInfo> getAllSummerCampInfo() {
        List<SummerCampInfo> allSummerCampInfo = summerCampInfoService.getAllSummerCampInfo();
        return allSummerCampInfo;
    }

    @ApiOperation(value = "查询所有保研文书模板", notes = "查询所有保研文书模板")
    @GetMapping(value = "/template")
    public List<Template> getAllTemplate() {
        List<Template> allTemplate = templateService.getAllTemplate();
        return allTemplate;
    }
}
