package com.example.authority.controller.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: authority
 * @ClassName CodeDto
 * @description:
 * @author: 哔哩哔哩 菜鸟程序员小胖 微信navicat15获取源码
 * @create: 2023-02-05 13:29
 * @Version 1.0
 **/
@Data
public class CodeDto {
    /**
     * vue创建时需要的数据dto
     */
//    private DomanDto domanDto;
    List<DomanDto> domanins = new ArrayList<>();
    /**
     * 表格名称
     */
    private String table;
    /**
     * 表格备注
     */
    private String remark;
    /**
     * sql语句
     */
    private String sql;
}