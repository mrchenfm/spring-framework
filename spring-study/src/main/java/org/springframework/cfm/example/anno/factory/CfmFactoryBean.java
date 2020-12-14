package org.springframework.cfm.example.anno.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.cfm.example.anno.bean.MonkeyInfo;

/**
 * @version v1.0
 * @ProjectName: spring
 * @ClassName: CfmBeanFactory
 * @Description: TODO(一句话描述该类的功能)
 * @Author: fangming_chen
 * @Date: 2020/12/12 17:12
 */
public class CfmFactoryBean implements FactoryBean<MonkeyInfo> {

	@Override
	public boolean isSingleton() {
		return true;
	}

	@Override
	public MonkeyInfo getObject() throws Exception {
		return new MonkeyInfo();
	}

	@Override
	public Class<?> getObjectType() {
		return MonkeyInfo.class;
	}
}
