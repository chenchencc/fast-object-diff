package com.fastobject.diff.model;



import com.fastobject.diff.DiffLog;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by colinsu
 *
 * @date 2019/9/6.
 */
public class BeanA {


    @DiffLog(name = "测试a")
    private String a;

    @DiffLog(name = "测试b", ignore = true)
    private String b;

    @DiffLog(name = "BList集合")
    private List<BeanB> bList;

    @DiffLog(name = "开始时间",dateFormat = "yyyy-dd-MM hh:mm:ss")
    private Date start;

    @DiffLog(name = "价格")
    private BigDecimal price;

    public BeanA(String a, String b, List<BeanB> bList) {
        this.a = a;
        this.b = b;
        this.bList = bList;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public List<BeanB> getbList() {
        return bList;
    }

    public void setbList(List<BeanB> bList) {
        this.bList = bList;
    }


}
