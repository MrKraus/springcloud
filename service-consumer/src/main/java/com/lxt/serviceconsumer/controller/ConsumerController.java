package com.lxt.serviceconsumer.controller;

import com.lxt.serviceconsumer.dao.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxt
 * @Copy Right Information: lxt
 * @Project: spring cloud
 * @CreateDate: 2018/12/16 15:10
 * @history Sr Date Modified By Why & What is modified
 * 1.2018/12/16 lxt & new
 */
@RestController
public class ConsumerController {
    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }
    @RequestMapping("/test")
    public String test() {
        return "test success!";
    }
}
