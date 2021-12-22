package abcretailonline.order.pojo;

public class OrderPojo {

	private String orderId;
	private String orderName;
	private PaymentPojo paymentPojo;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public PaymentPojo getPaymentPojo() {
		return paymentPojo;
	}

	public void setPaymentPojo(PaymentPojo paymentPojo) {
		this.paymentPojo = paymentPojo;
	}

}
