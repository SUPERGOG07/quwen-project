package com.quwen.springboot.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.ZoneId;
import java.time.ZonedDateTime;


@Component
public class CustomMetaObjectHandler implements MetaObjectHandler {

    public static final Logger logger = LoggerFactory.getLogger(CustomMetaObjectHandler.class);

    @Override
    public void insertFill(MetaObject metaObject) {
        logger.info("start insert fill ....");
        this.strictInsertFill(metaObject, "createDate", ZonedDateTime.class, ZonedDateTime.now(ZoneId.of("Asia/Shanghai")));
        this.strictInsertFill(metaObject, "updateDate", ZonedDateTime.class, ZonedDateTime.now(ZoneId.of("Asia/Shanghai")));
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        logger.info("start update fill ....");
        this.strictUpdateFill(metaObject, "updateDate", ZonedDateTime.class, ZonedDateTime.now(ZoneId.of("Asia/Shanghai")));
    }
}
