package com.example.authority.common;

import javax.security.sasl.AuthenticationException;

/**
 * @program: authority
 * @ClassName CaptchaException
 * @description:
 * @author: 哔哩哔哩 菜鸟程序员小胖 微信navicat15获取源码
 * @create: 2023-02-01 16:10
 * @Version 2.0
 **/
public class CaptchaException extends AuthenticationException {

    public CaptchaException(String msg) {
        super(msg);
    }
}