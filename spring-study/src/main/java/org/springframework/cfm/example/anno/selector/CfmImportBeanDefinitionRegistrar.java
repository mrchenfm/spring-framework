package org.springframework.cfm.example.anno.selector;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.cfm.example.anno.bean.CatInfo;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @version v1.0
 * @ProjectName: spring
 * @ClassName: CfmImportBeanDefinitionRegister
 * @Description: TODO(一句话描述该类的功能)
 * @Author: fangming_chen
 * @Date: 2020/12/12 16:53
 */
public class CfmImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	/**
	 * AnnotationMetadata：当前类的注解信息
	 * BeanDefinitionRegistry：BeanDefinition注册信息
	 * @param importingClassMetadata annotation metadata of the importing class
	 * @param registry current bean definition registry
	 *                 把所有需要注册到容器的bean进行注册
	 */
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

		boolean userInfo = registry.containsBeanDefinition("userInfo");
		boolean definition = registry.containsBeanDefinition("org.springframework.cfm.example.register.bean.DogInfo");

		if(userInfo && definition){
			registry.registerBeanDefinition("catInfo",new RootBeanDefinition(CatInfo.class));
		}

	}
}
