package com.github.https.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 创建时间为 14:04-2019-03-21
 * 项目名称 SpringBootHttps
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@RestController
public class HttpsController {

    @GetMapping("/")
    public String hello(){
        return "Hello world!";
    }


}
