package com.lxt.serviceconsumer.dao;

import com.lxt.serviceconsumer.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 刘小通
 * @Copy Right Information: 中科软科技股份有限公司
 * @Project: GTS4
 * @CreateDate: 2018/12/16 15:09
 * @history Sr Date Modified By Why & What is modified
 * 1.2018/12/16 刘小通 & new
 */
@FeignClient(name= "spring-cloud-provider",fallback = HelloRemoteHystrix.class)
public interface HelloRemote{
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}

