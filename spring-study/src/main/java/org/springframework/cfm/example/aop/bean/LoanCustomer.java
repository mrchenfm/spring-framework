package org.springframework.cfm.example.aop.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version v1.0
 * @ProjectName: spring
 * @ClassName: LoanCustomer
 * @Description: TODO(一句话描述该类的功能)
 * @Author: fangming_chen
 * @Date: 2020/12/13 15:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanCustomer {


	private String customerName;

	private String cardId;

	private String bankCard;

}
