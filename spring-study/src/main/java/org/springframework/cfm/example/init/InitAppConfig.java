package org.springframework.cfm.example.init;

import org.springframework.cfm.example.init.bean.Account;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @version v1.0
 * @ProjectName: spring
 * @ClassName: InitAppConfig
 * @Description: TODO(一句话描述该类的功能)
 * @Author: fangming_chen
 * @Date: 2020/12/12 22:05
 */
@Configuration
@ComponentScan("org.springframework.cfm.example.init")
public class InitAppConfig {

	@Bean(initMethod = "init",destroyMethod = "destroy")
	public Account account(){
		return new Account();
	}
}
