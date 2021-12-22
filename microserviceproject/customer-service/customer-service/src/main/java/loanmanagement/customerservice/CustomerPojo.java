package loanmanagement.customerservice;

import loanmanagement.customerservice.pojo.AccountPojo;

public class CustomerPojo {

	private String customerName;
	private int age;
	private String accountNo;

	private AccountPojo accountPojo;

	public AccountPojo getAccountPojo() {
		return accountPojo;
	}

	public void setAccountPojo(AccountPojo accountPojo) {
		this.accountPojo = accountPojo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

}
