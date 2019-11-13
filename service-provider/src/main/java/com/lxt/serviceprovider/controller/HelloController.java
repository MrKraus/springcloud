package com.lxt.serviceprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxt
 * @Copy Right Information: lxt
 * @Project: spring cloud
 * @CreateDate: 2018/12/16 12:51
 * @history Sr Date Modified By Why & What is modified
 * 1.2018/12/16 lxt & new
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index(String name) {
        return "hello "+name+"，this is first messge";
    }
    @RequestMapping(value = "/foo")
    public String foo(String foo) {
        return "hello "+foo+"，this is first messge";
    }
}
