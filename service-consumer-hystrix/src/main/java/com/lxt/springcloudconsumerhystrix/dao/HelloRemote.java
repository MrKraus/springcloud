package com.lxt.springcloudconsumerhystrix.dao;

import com.lxt.springcloudconsumerhystrix.hystrix.HelloRemoteHystrix;
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
@FeignClient(name= "spring-cloud-provider",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}

