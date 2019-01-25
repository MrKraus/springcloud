package com.lxt.serviceconsumer.controller;

import com.lxt.serviceconsumer.dao.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘小通
 * @Copy Right Information: 中科软科技股份有限公司
 * @Project: GTS4
 * @CreateDate: 2018/12/16 15:10
 * @history Sr Date Modified By Why & What is modified
 * 1.2018/12/16 刘小通 & new
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
