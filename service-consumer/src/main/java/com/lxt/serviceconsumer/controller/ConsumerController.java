package com.lxt.serviceconsumer.controller;

import com.lxt.serviceconsumer.dao.fegin.HelloFegin;
import com.lxt.serviceconsumer.dao.ribbon.HelloRest;
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
    private HelloFegin helloFegin;
    @Autowired
    private HelloRest helloRest;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
//        return helloRest.hello(name);
        return helloFegin.hello(name);
    }
    @RequestMapping("/test")
    public String test() {
        return "test success!";
    }
}
