package com.lxt.serviceconsumer.dao.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Component
public class HelloRest {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    public String hello(String name){
          // RestTemplate 第一种方式实现负载均衡=>loadBalancerClient
//        ServiceInstance serviceInstance = loadBalancerClient.choose("spring-cloud-provider");
//        String url = String.format("http://%s:%s",serviceInstance.getHost(),serviceInstance.getPort()+"/foo?foo="+name);
//        String response = restTemplate.getForObject(url,String.class);


        // RestTemplate 第二种方式实现负载均衡=>@LoadBalanced
        String response = restTemplate.getForObject("http://spring-cloud-provider/foo?foo="+name,String.class);
        return response;
    }


    @Bean
    @LoadBalanced // 第二种方式
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


}

