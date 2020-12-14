package org.springframework.cfm.example.aop.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cfm.example.aop.bean.LoanCustomer;
import org.springframework.cfm.example.aop.service.LoanCustomerService;
import org.springframework.stereotype.Service;

/**
 * @version v1.0
 * @ProjectName: spring
 * @ClassName: LoanCustomerServiceImpl
 * @Description: TODO(一句话描述该类的功能)
 * @Author: fangming_chen
 * @Date: 2020/12/13 15:39
 */
@Service
@Slf4j
public class LoanCustomerServiceImpl implements LoanCustomerService {
	@Override
	public LoanCustomer getByCustomerName(String customerName) {

		LoanCustomer loanCustomer = new LoanCustomer(customerName,"2020202011121364568","789456123001");
		log.info("loanCustomer:{}",loanCustomer);

		return loanCustomer;
	}
}
