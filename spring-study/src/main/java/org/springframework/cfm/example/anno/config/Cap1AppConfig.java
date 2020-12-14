package org.springframework.cfm.example.anno.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cfm.example.anno.bean.DogInfo;
import org.springframework.cfm.example.anno.bean.UserInfo;
import org.springframework.cfm.example.anno.factory.CfmFactoryBean;
import org.springframework.cfm.example.anno.selector.CfmImportBeanDefinitionRegistrar;
import org.springframework.cfm.example.anno.selector.CfmImportSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @version v1.0
 * @ProjectName: spring
 * @ClassName: Cap1AppConfig
 * @Description: TODO(一句话描述该类的功能)
 * @Author: fangming_chen
 * @Date: 2020/12/12 16:19
 */
@Configuration()
@Slf4j
@Import({DogInfo.class, CfmImportSelector.class, CfmImportBeanDefinitionRegistrar.class})
public class Cap1AppConfig {

	/**
	 * 给容器注册组件的方式
	 * 1、@Bean：【导入第三方的类或者包的组件】，比如UserInfo是第三方的的类，需要在Spring容器中使用
	 * 2、包扫描+组件的标志注解（@{@link org.springframework.stereotype.Component},@{@link org.springframework.stereotype.Controller}
	 *    ,@{@link org.springframework.context.annotation.ComponentScan}）,一般针对我们自己写的类
	 * 3、@Import：【快速给spring容器导入一个组件】
	 * 		（1）、@Import：容器会自动注册这个组件，bean的Id为全类名
	 * 		（2）、ImportSelector：是一个接口，返回需要倒入容器的全类名数组
	 * 		（3）、ImportDefinitionRegistrar：可以手动添加组件到容器，所有的bean的注册都可以使用BeanDefinitionRegistry
	 * 				写一个类实现	ImportDefinitionRegistrar接口即可
	 * 4、使用Spring提供的FactoryBean进行注册
 * @return
	 */
	@Bean("userInfo")
	public UserInfo getA(){
		UserInfo userInfo = new UserInfo("AAA", 12, "17746624210", "123456");
		log.info("容器添加的User-AAA:{}",userInfo.toString());
		return userInfo;
	}

	@Bean
	public CfmFactoryBean cfmFactoryBean(){
		return new CfmFactoryBean();
	}
}
