- 单注册中心切换到多注册中心注意事项

    注释以下两个配置：
        eureka.instance.hostname=eureka1
        #是否将自己注册到Eureka Server，默认为true
        #eureka.client.register-with-eureka=false
        #是否从Eureka Server获取注册信息，默认为true
        #eureka.client.fetch-registry=false