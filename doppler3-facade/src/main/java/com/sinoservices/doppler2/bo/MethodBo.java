package com.sinoservices.doppler2.bo;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/1/20.
 */
public class MethodBo implements Serializable {

    private long reqNum; //当前小时的请求量
    private String date; //日期，到小时 yyyy-MM-dd HH

    public MethodBo(String date,long reqNum){
        this.date = date;
        this.reqNum = reqNum;
    }

    public long getReqNum() {
        return reqNum;
    }

    public void setReqNum(long reqNum) {
        this.reqNum = reqNum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
