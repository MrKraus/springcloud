package com.lxt.serviceconsumer.hystrix;

import com.lxt.serviceconsumer.dao.fegin.HelloFegin;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lxt
 * @Copy Right Information: lxt
 * @Project: spring cloud
 * @CreateDate: 2018/12/16 15:58
 * @history Sr Date Modified By Why & What is modified
 * 1.2018/12/16 lxt & new
 */
@Component
public class HelloFeginHystrix implements HelloFegin {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " +name+", this messge send failed ";
    }
}
