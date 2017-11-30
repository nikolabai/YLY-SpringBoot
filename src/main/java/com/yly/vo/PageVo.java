package com.yly.vo;

/**
 * @author yuanhongqiu
 * @Description 分页VO
 * @date 2017年07月13日 上午11:19
 **/
public class PageVo {
    /**
     * 当前页数
     */
    private int page;

    /**
     * 每页条数
     */
    private int rows;

    /**
     * 总条数
     */
	private long count = 0;
    
    /**
     * 排序规则
     * 形式：_pt.*  以逗号 , 隔开   * 为 查询结果集的 as 之后的名
     */
    private String orderColumn;

    public PageVo() {
        this(1, 10);
    }
    public PageVo(String orderColumn) {
        this(1, 10,orderColumn);
    }

    /**
     * @param page
     *            当前页数
     * @param rows
     *            每页条数
     */
    public PageVo(int page, int rows) {
        this.page = page;
        this.rows = rows;
    }

	/**
	 * @author sunxiaoming
	 * @param page 当前页数
	 * @param rows 每页条数
	 * @param orderColumn
	 */
    public PageVo(int page, int rows,String orderColumn) {
        this.page = page;
        this.rows = rows;
        this.orderColumn = orderColumn;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

	public long setCount(long count) {
        return this.count = count;
    }

	public long getCount() {
        return count;
    }

    public int getOffset() {
        return (page - 1) * rows;
    }

    public int getLimit() {
        return rows;
    }

	public String getOrderColumn() {
		return orderColumn;
	}

	public void setOrderColumn(String orderColumn) {
		this.orderColumn = orderColumn;
	}
    
}
