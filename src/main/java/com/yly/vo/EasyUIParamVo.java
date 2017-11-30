/******************************************************************
 *
 *
 *    Package:     com.suncity.baijiabang.admin.vo
 *
 *    Filename:    EasyUIParamVo.java
 *
 *    Description: easyUI参数vo类
 *
 *    Copyright:   Copyright (c) 2017
 *
 *    Company:     BJB
 *
 *    @author:     anngiu1
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年8月24日 上午1:03:14
 *
 *    Revision:
 *
 *    2017年8月24日 上午1:03:14
 *        - first revision
 *
 *****************************************************************/
package com.yly.vo;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName EasyUIParamVo
 * @Description easyUI参数vo类
 * @author anngiu
 * @Date 2017年8月24日 上午1:03:14
 * @version 1.0.0
 */
public class EasyUIParamVo {

    private int total;// 总记录数
    private int page = 1;// 当前页
    private int rows = 20;// 每页记录数
    private String sort;// 排序字段名称
    private String order;// 排序方式
    private String flag;// 标记
    private String search;// 搜索

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        Map<String, Object> map = new HashMap<>();
        map.put("total", total);
        map.put("page", page);
        map.put("rows", rows);
        map.put("sort", sort);
        map.put("order", order);
        map.put("flag", flag);
        map.put("search", search);
        return map.toString();
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

}
