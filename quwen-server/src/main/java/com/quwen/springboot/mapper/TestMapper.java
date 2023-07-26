package com.quwen.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.quwen.springboot.model.entity.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper extends BaseMapper<Test> {
}
