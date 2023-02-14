package com.example.authority.common;

import com.alibaba.fastjson.JSON;
import com.example.authority.utils.RedisUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @program: authority
 * @ClassName AopAspect
 * @description:
 * @author: 哔哩哔哩 菜鸟程序员小胖 微信navicat15获取源码
 * @create: 2023-02-06 21:51
 * @Version 2.0
 **/
@Slf4j
@Aspect
@Component
public class AopAspect {
    @Resource
    RedisUtils redisUtils;

    @Before("@annotation(com.example.authority.common.ClearMenu)")
    public void ClearMenuRedis(JoinPoint point) {

        redisUtils.del(Constant.MENU_PREFIX);
        redisUtils.del(Constant.AUTHORITY);
        log.info("缓存清除成功");
    }


}
