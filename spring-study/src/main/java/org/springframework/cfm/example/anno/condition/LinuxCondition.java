package org.springframework.cfm.example.anno.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @version v1.0
 * @ProjectName: spring
 * @ClassName: LinuxCondition
 * @Description: TODO(一句话描述该类的功能)
 * @Author: fangming_chen
 * @Date: 2020/12/12 16:05
 */
public class LinuxCondition implements Condition {

	private final String LINNUX = "Linux";

	private final String OS_TYPE_KEY = "os.name";
	/**
	 * ConditionContext:判断条件可以使用的上下文（环境）
	 * AnnotatedTypeMetadata ： 注解信息
	 * @param context the condition context
	 * @param metadata the metadata of the {@link org.springframework.core.type.AnnotationMetadata class}
	 * or {@link org.springframework.core.type.MethodMetadata method} being checked
	 * @return
	 */
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

		//获取IOC容器正在使用的BeanFactory
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		//获取当前环境的操作系统
		Environment environment = context.getEnvironment();

		/**
		 * 是否是Windows系统
		 */
		if((environment.getProperty(OS_TYPE_KEY)).contains(LINNUX)){
			return true;
		}
		return false;
	}
}
