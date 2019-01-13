package com.lxt.springcloudconsumerhystrix.dao;

import com.lxt.springcloudconsumerhystrix.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 刘小通
 * @Copy Right Information: 中科软科技股份有限公司
 * @Project: GTS4
 * @CreateDate: 2019/1/13 18:24
 * @history Sr Date Modified By Why & What is modified
 * 1.2019/1/13 刘小通 & new
 */
public interface UserDao extends JpaRepository<User,Long> {
}
