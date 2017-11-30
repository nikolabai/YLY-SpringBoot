/******************************************************************
 *
 *
 *    Package:     com.suncity.baijiabang.admin.vo
 *
 *    Filename:    EasyUIReturnVo.java
 *
 *    Description: EasyUI返回接受的Vo
 *
 *    Copyright:   Copyright (c) 2017
 *
 *    Company:     BJB
 *
 *    @author:     anngiu1
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年8月24日 上午1:21:08
 *
 *    Revision:
 *
 *    2017年8月24日 上午1:21:08
 *        - first revision
 *
 *****************************************************************/
package com.yly.vo;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName EasyUIReturnVo
 * @Description EasyUI返回接受的Vo
 * @author anngiu
 * @Date 2017年8月24日 上午1:21:08
 * @version 1.0.0
 */
public class EasyUIReturnVo<T> implements Serializable {

    private static final long serialVersionUID = -7250257009183639633L;
    private Long total;// 总条数
    private List<T> rows;// 数据

    public EasyUIReturnVo() {
        this.total = 0L;
        this.rows = Collections.emptyList();
    }

    public EasyUIReturnVo(Number total, List<T> rows) {
        this.total = total == null ? 0 : total.longValue();
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
