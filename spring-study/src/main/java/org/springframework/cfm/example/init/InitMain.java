package org.springframework.cfm.example.init;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cfm.example.anno.bean.UserInfo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @version v1.0
 * @ProjectName: spring
 * @ClassName: InitMain
 * @Description: TODO(一句话描述该类的功能)
 * @Author: fangming_chen
 * @Date: 2020/12/12 22:17
 */
@Slf4j
public class InitMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(InitAppConfig.class);
		String[] names = ac.getBeanDefinitionNames();
		StringBuilder sb = new StringBuilder();
		for (String name : names){
			sb.append(name+"->");
		}
		log.info("容器创建完毕，beans={}", sb.toString());
	}
}
