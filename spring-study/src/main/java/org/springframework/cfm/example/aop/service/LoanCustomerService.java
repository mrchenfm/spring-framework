package org.springframework.cfm.example.aop.service;

import org.springframework.cfm.example.aop.bean.LoanCustomer;

/**
 * @version v1.0
 * @ProjectName: spring
 * @ClassName: LoanCustomerService
 * @Description: TODO(一句话描述该类的功能)
 * @Author: fangming_chen
 * @Date: 2020/12/13 15:38
 */
public interface LoanCustomerService {

	/**
	 *
	 * @param customerName
	 * @return
	 */
	LoanCustomer getByCustomerName(String customerName);
}
