package org.springframework.cfm.example.aop.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @version v1.0
 * @ProjectName: spring
 * @ClassName: Calculator
 * @Description: TODO(一句话描述该类的功能)
 * @Author: fangming_chen
 * @Date: 2020/12/13 17:15
 */
@Component
@Slf4j
public class Calculator {
	public int calculator(int a,int b){
		log.info("计算开始，params={}、{}",a,b);
		return a/b;
	}
}
