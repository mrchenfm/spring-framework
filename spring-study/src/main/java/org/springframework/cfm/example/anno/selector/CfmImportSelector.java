package org.springframework.cfm.example.anno.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @version v1.0
 * @ProjectName: spring
 * @ClassName: CfmImportSelector
 * @Description: TODO(一句话描述该类的功能)
 * @Author: fangming_chen
 * @Date: 2020/12/12 16:44
 */
public class CfmImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"org.springframework.cfm.example.anno.service.impl.UserServiceImpl"};
	}
}
