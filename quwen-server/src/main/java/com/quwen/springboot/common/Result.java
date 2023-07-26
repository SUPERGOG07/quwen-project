package com.quwen.springboot.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.gson.JsonObject;
import com.quwen.springboot.util.GsonUtil;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

public class Result implements Serializable {

    public static final long serialVersionUID = 1L;

    private Integer msgCode;

    private String errMsg;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss 'GMT'xxx", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss 'GMT'xxx")
    private ZonedDateTime receiptDateTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss 'GMT'xxx", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss 'GMT'xxx")
    private ZonedDateTime returnDateTime;

    private Boolean success;

    private Map<String,Object> item;


    public Result() {
        this.receiptDateTime = ZonedDateTime.now();
        this.item = new HashMap<>();
    }

    public Result putItem(String key,Object value){
        this.item.put(key,value);
        return this;
    }

    public Result error(int msgCode,String errMsg){
        this.msgCode = msgCode;
        this.errMsg = errMsg;
        this.returnDateTime = ZonedDateTime.now();
        this.success = false;
        return this;
    }

    public Result error(ErrorEnum errorEnum){
        this.msgCode = errorEnum.getMsgCode();
        this.errMsg = errorEnum.getErrMsg();
        this.returnDateTime = ZonedDateTime.now();
        this.success = false;
        return this;
    }

    public Result success(){
        this.error(ErrorEnum.SUCCESS);
        this.success = true;
        return this;
    }




    public Integer getMsgCode() {
        return msgCode;
    }

    public void setMsgCode(Integer msgCode) {
        this.msgCode = msgCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public ZonedDateTime getReceiptDateTime() {
        return receiptDateTime;
    }

    public void setReceiptDateTime(ZonedDateTime receiptDateTime) {
        this.receiptDateTime = receiptDateTime;
    }

    public ZonedDateTime getReturnDateTime() {
        return returnDateTime;
    }

    public void setReturnDateTime(ZonedDateTime returnDateTime) {
        this.returnDateTime = returnDateTime;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Map<String, Object> getItem() {
        return item;
    }

    public void setItem(Map<String, Object> item) {
        this.item = item;
    }
}
