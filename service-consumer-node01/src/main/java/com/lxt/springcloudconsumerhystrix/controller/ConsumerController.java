package com.lxt.springcloudconsumerhystrix.controller;

import com.lxt.springcloudconsumerhystrix.dao.HelloRemote;
import com.lxt.springcloudconsumerhystrix.dao.UserDao;
import com.lxt.springcloudconsumerhystrix.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.logging.Logger;

/**
 * @author 刘小通
 * @Copy Right Information: 中科软科技股份有限公司
 * @Project: GTS4
 * @CreateDate: 2018/12/16 15:10
 * @history Sr Date Modified By Why & What is modified
 * 1.2018/12/16 刘小通 & new
 */
@RestController
public class ConsumerController {

//    Logger logger = Logger.getLogger("ConsumerController");
    @Autowired
    private HelloRemote helloRemote;
    @Autowired
    private UserDao userDao;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }




    @RequestMapping("/findById/{id}")
    public User findById(@PathVariable("id") String id) {


        //不建议姿势
        try {
            User user1 = userDao.findById(1L).get();
        }catch (Exception e){
            //实体不存在，捕获异常
        }

        //相对费劲姿势
        Optional<User> user2 = userDao.findById(1L);
        if(user2.isPresent()){
            //实体存在
        }else{
            //实体不存在
        }

        //建议姿势，存在返回实体，不存在不抛异常，返回null
        User user3 = userDao.findById(1L).orElse(null);



        return null;
    }
}
