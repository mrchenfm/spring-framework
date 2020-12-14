package org.springframework.cfm.example.anno.service.impl;

import org.springframework.cfm.example.anno.AppConfig;
import org.springframework.cfm.example.anno.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @version v1.0
 * @ProjectName: spring
 * @ClassName: UserServiceImpl
 * @Description:  {@link AppConfig}这个Config文件才能扫描到这里的类
 * @Author: fangming_chen
 * @Date: 2020/12/12 14:08
 */
@Service
public class UserServiceImpl implements UserService {
	@Override
	public String getUserName() {
		return "小米";
	}
}
