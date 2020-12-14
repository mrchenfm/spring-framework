package org.springframework.cfm.example.anno.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cfm.example.anno.AppConfig;
import org.springframework.cfm.example.anno.bean.UserInfo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @version v1.0
 * @ProjectName: spring
 * @ClassName: MainTest
 * @Description: TODO(一句话描述该类的功能)
 * @Author: fangming_chen
 * @Date: 2020/12/12 14:07
 */
@Slf4j
public class MainTest {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		String[] names = ac.getBeanNamesForType(UserInfo.class);
		StringBuilder sb = new StringBuilder();
		for (String name : names){
			sb.append(name+"->");
		}
		log.info("容器创建完毕，beans={}", sb.toString());
	}
}
