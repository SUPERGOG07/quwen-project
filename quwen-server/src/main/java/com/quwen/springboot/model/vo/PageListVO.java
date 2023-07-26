package com.quwen.springboot.model.vo;

import java.util.List;

public class PageListVO<T> {

    /**
     * 全部数量
     */
    private Integer total;

    /**
     * 当前页码
     */
    private Integer page;

    /**
     * 当前页数量
     */
    private Integer num;

    /**
     * 每页数量上限
     */
    private Integer size;

    /**
     * 总页数
     */
    private Integer totalPage;

    /**
     * 是否是第一页
     */
    private Boolean checkFirst;

    /**
     * 是否是最后一页
     */
    private Boolean checkLast;

    /**
     * 列表数据
     */
    private List<T> list;

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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public boolean isCheckFirst() {
        return checkFirst;
    }

    public void setCheckFirst(boolean checkFirst) {
        this.checkFirst = checkFirst;
    }

    public boolean isCheckLast() {
        return checkLast;
    }

    public void setCheckLast(boolean checkLast) {
        this.checkLast = checkLast;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
