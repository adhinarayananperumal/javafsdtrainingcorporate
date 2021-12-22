package neobank.loanbanking.controller;

public class Loan {

	private String loanId;
	private int amt;
	private int tenuer;

	public String getLoanId() {
		return loanId;
	}

	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	public int getTenuer() {
		return tenuer;
	}

	public void setTenuer(int tenuer) {
		this.tenuer = tenuer;
	}

}
