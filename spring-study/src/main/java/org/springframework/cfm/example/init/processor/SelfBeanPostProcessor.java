package org.springframework.cfm.example.init.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @version v1.0
 * @ProjectName: spring
 * @ClassName: DataSource
 * @Description: TODO(一句话描述该类的功能)
 * @Author: fangming_chen
 * @Date: 2020/12/12 22:06
 */
@Slf4j
@Component
public class SelfBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		log.info("postProcessBeforeInitialization===beanName:{}======bean:{}",beanName,bean);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		log.info("postProcessAfterInitialization===beanName:{}======bean:{}",beanName,bean);
		return bean;
	}
}

