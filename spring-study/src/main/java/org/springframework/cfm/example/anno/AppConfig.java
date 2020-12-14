package org.springframework.cfm.example.anno;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cfm.example.anno.bean.UserInfo;
import org.springframework.cfm.example.anno.condition.LinuxCondition;
import org.springframework.cfm.example.anno.condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @version v1.0
 * @ProjectName: spring
 * @ClassName: AppConfig
 * @Description: TODO(一句话描述该类的功能)
 * @Author: fangming_chen
 * @Date: 2020/12/12 13:24
 */
@Configuration
@ComponentScan("org.springframework.cfm.example")
@Slf4j
public class AppConfig {

	@Conditional(LinuxCondition.class)
	@Bean("userA")
	public UserInfo getA(){
		UserInfo userInfo = new UserInfo("AAA", 12, "17746624210", "123456");
		log.info("容器添加的User-AAA:{}",userInfo.toString());
		return userInfo;
	}

	@Conditional(WindowsCondition.class)
	@Bean("userB")
	public UserInfo getB(){
		UserInfo userInfo = new UserInfo("BBB", 13, "17746624212", "123456");
		log.info("容器添加的User-BBB:{}",userInfo.toString());
		return userInfo;
	}

	@Conditional(WindowsCondition.class)
	@Bean("userC")
	public UserInfo getC(){
		UserInfo userInfo = new UserInfo("CCC", 14, "17746624211", "123456");
		log.info("容器添加的User-CCC:{}",userInfo.toString());
		return userInfo;
	}

}
