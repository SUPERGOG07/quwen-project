package com.quwen.springboot.model.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;
import java.time.ZonedDateTime;

public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private String id;

    @TableField(fill = FieldFill.INSERT)
    private ZonedDateTime createDate;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private ZonedDateTime updateDate;

    @TableLogic
    private int delFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss 'GMT'xxx",
            timezone = "GMT+8"
    )
    public ZonedDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(ZonedDateTime createDate) {
        this.createDate = createDate;
    }

    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss 'GMT'xxx",
            timezone = "GMT+8"
    )
    public ZonedDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(ZonedDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public int getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(int delFlag) {
        this.delFlag = delFlag;
    }

    public String toString(){
        return ReflectionToStringBuilder.toString(this);
    }
}
