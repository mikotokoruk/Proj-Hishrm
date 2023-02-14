package com.example.authority.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * @program: authority
 * @ClassName Reloadmessageconfig springsecurity中文
 * @description:
 * @author: 哔哩哔哩 菜鸟程序员小胖 微信navicat15获取源码
 * @create: 2023-02-04 19:57
 * @Version 1.0
 **/

@Configuration
public class ReloadMessageConfig {
    @Bean
    public ReloadableResourceBundleMessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        // 指定类路径的时候，不需要添加文件后缀[.properties]
        messageSource.setBasename("classpath:org/springframework/security/messages_zh_CN");
        return messageSource;
    }
}
