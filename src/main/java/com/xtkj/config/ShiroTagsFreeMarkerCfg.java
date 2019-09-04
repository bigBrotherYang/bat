package com.xtkj.config;


import com.jagregory.shiro.freemarker.ShiroTags;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModelException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Component
public class ShiroTagsFreeMarkerCfg {

    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;

    @PostConstruct
    public void setSharedVariable() throws TemplateModelException {
        freeMarkerConfigurer.getConfiguration().setSharedVariable("shiro", new ShiroTags());
    }

//    @Bean
//    public FreeMarkerConfigurer freeMarkerConfigurer() throws IOException, TemplateException {
//        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
//        freeMarkerConfigurer.setTemplateLoaderPath("classpath:templates/");
//        freemarker.template.Configuration configuration = freeMarkerConfigurer.createConfiguration();
//        configuration.setDefaultEncoding("UTF-8");
//        //这里可以添加其他共享变量 比如sso登录地址
//        configuration.setSharedVariable("shiro", new ShiroTags());
//        freeMarkerConfigurer.setConfiguration(configuration);
//        return freeMarkerConfigurer;
//    }
}
