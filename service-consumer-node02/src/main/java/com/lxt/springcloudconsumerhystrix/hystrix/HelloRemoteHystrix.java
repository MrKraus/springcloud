package com.lxt.springcloudconsumerhystrix.hystrix;

import com.lxt.springcloudconsumerhystrix.dao.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 刘小通
 * @Copy Right Information: 中科软科技股份有限公司
 * @Project: GTS4
 * @CreateDate: 2018/12/16 15:58
 * @history Sr Date Modified By Why & What is modified
 * 1.2018/12/16 刘小通 & new
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello2(@RequestParam(value = "name") String name) {
        return "hello" +name+", this messge send failed ";
    }
}
