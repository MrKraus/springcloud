package com.lxt.serviceprovider1.controller;

import com.fasterxml.jackson.core.filter.TokenFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘小通
 * @Copy Right Information: 中科软科技股份有限公司
 * @Project: GTS4
 * @CreateDate: 2018/12/16 12:51
 * @history Sr Date Modified By Why & What is modified
 * 1.2018/12/16 刘小通 & new
 */
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        logger.info("request two name is "+name);
        try{
            Thread.sleep(1000000);
        }catch ( Exception e){
            logger.error(" hello two error",e);
        }
        return "hello "+name+"，this is two messge";
    }
}
