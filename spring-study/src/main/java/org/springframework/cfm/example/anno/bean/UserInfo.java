package org.springframework.cfm.example.anno.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version v1.0
 * @ProjectName: spring
 * @ClassName: UserInfo
 * @Description: TODO(一句话描述该类的功能)
 * @Author: fangming_chen
 * @Date: 2020/12/12 15:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

	private String userName;

	private Integer age;

	private String phone;

	private String password;
}
