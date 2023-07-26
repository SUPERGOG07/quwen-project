package com.quwen.springboot.controller;

import com.quwen.springboot.common.Result;
import com.quwen.springboot.model.entity.Test;
import com.quwen.springboot.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    public static final Logger logger = LoggerFactory.getLogger(TestController.class);

    TestService testService;

    @Autowired
    public TestController(TestService testService){
        this.testService = testService;
    }

    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }

    @GetMapping("/test1/{str}")
    public Result test1(@PathVariable("str") String str){
        Result result = new Result();
        result.success();
        result.putItem("str",str);
        return result;
    }

    @GetMapping("/ex")
    public Result ex(){
        throw new RuntimeException("测试用");
    }

    @GetMapping("/test2/{str}")
    public Result test2(@PathVariable("str") String str){
        Result result = new Result();

        Test test = new Test();
        test.setTest(str);

        testService.save(test);

        result.putItem("test",test);
        return result.success();
    }
}
