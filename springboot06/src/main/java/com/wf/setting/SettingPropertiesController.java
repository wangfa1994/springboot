package com.wf.setting;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangfa
 * @Date: 2018/11/10 14:55
 * @Description: 常规属性
 */
@RestController
public class SettingPropertiesController {

    private static final Logger logger = LoggerFactory.getLogger(SettingPropertiesController.class);

    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;
    /**
     *
     * @Author: wangfa
     * @Date: 2018/11/10 下午3:49
     * @Description: 普通话属性配置
     */
    @RequestMapping("/settingProperties")
    public String setting01(){
        logger.info("hhh{}",age);
        return "setting properties name is "+name+" and age is "+age;
    }




    @Autowired
    private StudentBean studentBean;

    /**
     *
     * @Author: wangfa
     * @Date: 2018/11/10 下午3:49
     * @Description: bean 属性配置
     */
    @RequestMapping("/settingBean")
    public String settingBean(){
        return "setting bean student name is "+studentBean.getName()+" age "+studentBean.getAge();
    }




    @Value("${profile}")
    private String profile;

    /**
     *
     * @Author: wangfa
     * @Date: 2018/11/10 下午3:49
     * @Description: 切换不同的环境配置
     */
    @RequestMapping("/settingProfile")
    public String settingProfile(){
        return "setting properties profile is "+profile;
    }

}
