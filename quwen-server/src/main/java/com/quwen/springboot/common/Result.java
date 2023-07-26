package com.quwen.springboot.common;

import com.google.gson.JsonObject;

import java.io.Serializable;
import java.time.ZonedDateTime;

public class Result implements Serializable {

    public static final long serialVersionUID = 1L;

    private Integer msgCode;

    private String errMsg;

    private ZonedDateTime receiptDateTime;

    private ZonedDateTime returnDateTime;

    private Boolean success;

    private JsonObject item;


    public Result() {
        this.msgCode = 0;
        this.errMsg = "";
        this.receiptDateTime = ZonedDateTime.now();
        this.success = true;
        this.item = new JsonObject();
    }

    public Result success(){
        this.receiptDateTime = ZonedDateTime.now();
        return this;
    }

    public Result success(String key, Object value){
        this.receiptDateTime = ZonedDateTime.now();
        if (null != key && null != value) {
            this.item.addProperty(key, value.toString());
        }
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

    public JsonObject getItem() {
        return item;
    }

    public void setItem(JsonObject item) {
        this.item = item;
    }
}
