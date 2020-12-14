package org.springframework.cfm.example.anno.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cfm.example.anno.config.Cap1AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @version v1.0
 * @ProjectName: spring
 * @ClassName: Cap1ManTest
 * @Description: TODO(一句话描述该类的功能)
 * @Author: fangming_chen
 * @Date: 2020/12/12 16:20
 */
@Slf4j
public class Cap1ManTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Cap1AppConfig.class);

		Object cfmFactoryBean = ac.getBean("cfmFactoryBean");
		Object cfmFactoryBean1 = ac.getBean("cfmFactoryBean");

		log.info("cfmFactoryBean={}",cfmFactoryBean);
		log.info("cfmFactoryBean1={}",cfmFactoryBean1);

		String[] names = ac.getBeanDefinitionNames();
		StringBuilder sb = new StringBuilder();
		for (String name : names){
			sb.append("->"+name+"\n");
		}
		log.info("容器创建完毕，beans={}", sb.toString());
	}
}
