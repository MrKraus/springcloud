package com.lxt.consulconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private LoadBalancerClient loadBalancer;
    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 获取所有服务
     */
    @RequestMapping("/services/{serviceName}")
    public Object services(@PathVariable("serviceName")String serviceName) {
        return discoveryClient.getInstances(serviceName);
    }

    /**
     * 从所有服务中选择一个服务（轮询）
     */
    @RequestMapping("/discover/{serviceName}")
    public Object discover(@PathVariable("serviceName")String serviceName) {
        return loadBalancer.choose(serviceName).getUri().toString();
    }
}
