package org.springframework.cfm.example.init.bean;

import lombok.extern.slf4j.Slf4j;

/**
 * @version v1.0
 * @ProjectName: spring
 * @ClassName: Account
 * @Description: TODO(一句话描述该类的功能)
 * @Author: fangming_chen
 * @Date: 2020/12/12 22:17
 */
@Slf4j
public class Account {

	public Account(){
		log.info("======Account无参构造方法调用=======");
	}

	public void init(){
		log.info("======Account无init方法调用=======");
	}

	public void destroy(){
		log.info("======Account无参destroy方法调用=======");
	}
}
