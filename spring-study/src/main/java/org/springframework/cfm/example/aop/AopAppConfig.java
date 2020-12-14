package org.springframework.cfm.example.aop;

import org.springframework.cfm.example.aop.aspects.LogAspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @version v1.0
 * @ProjectName: spring
 * @ClassName: AopAppConfig
 * @Description: TODO(一句话描述该类的功能)
 * @Author: fangming_chen
 * @Date: 2020/12/13 15:44
 */
@Configuration
@ComponentScan("org.springframework.cfm.example.aop.*")
@EnableAspectJAutoProxy
public class AopAppConfig {

	@Bean
	public LogAspects logAspects(){
		return new LogAspects();
	}
}
