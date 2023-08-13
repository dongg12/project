package com.wd.admin.controller;

import api.CommonResult;
import com.wd.admin.mq.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class NacosValueDemoController {
    @Autowired
    private KafkaProducer kafkaProducer;

    @Value("${user.id}")
    private String id;
    @Value("${user.name}")
    private String name;
    @Value("${user.age}")
    private String age;

    /**
     * 测试
     *
     * @return CommonResult
     */
    @PostMapping("/")
    public CommonResult<String> test() {
        System.out.println(id + name + age);
        return CommonResult.success();
    }

    /**
     * kafka测试
     *
     * @return commonResult
     */
    @PostMapping("/kafka")
    public CommonResult<String> kafkaTest() {
        kafkaProducer.sendMessage("my_topic", "wangdong");
        return CommonResult.success();
    }
}
