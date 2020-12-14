package org.springframework.cfm.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cfm.example.aop.AopAppConfig;
import org.springframework.cfm.example.aop.handler.Calculator;
import org.springframework.cfm.example.aop.service.LoanCustomerService;
import org.springframework.cfm.example.aop.service.impl.LoanCustomerServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @version v1.0
 * @ProjectName: spring
 * @ClassName: AopMainTest
 * @Description: TODO(一句话描述该类的功能)
 * @Author: fangming_chen
 * @Date: 2020/12/13 15:45
 */
@Slf4j
public class AopMainTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AopAppConfig.class);
		LoanCustomerService loanCustomerService = (LoanCustomerService) ac.getBean("loanCustomerServiceImpl");
		loanCustomerService.getByCustomerName("送记忆");
		Calculator bean = ac.getBean(Calculator.class);
		bean.calculator(3,4);
		log.info("aop测试容器启动成功");
		ac.close();

	}
}
