package com.lxt.serviceconsumer.dao.fegin;

import com.lxt.serviceconsumer.hystrix.HelloFeginHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lxt
 * @Copy Right Information: lxt
 * @Project: spring cloud
 * @CreateDate: 2018/12/16 15:09
 * @history Sr Date Modified By Why & What is modified
 * 1.2018/12/16 lxt & new
 */
// name:配置服务提供者名称，用于从注册中心获取服务提供者信息
@FeignClient(name= "spring-cloud-provider",fallback = HelloFeginHystrix.class)
public interface HelloFegin {
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);

}

