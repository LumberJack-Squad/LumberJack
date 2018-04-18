package lumberjack;

public class Bill {
	
	private double billSize;
	private double leftToPay;
	
	public Bill(double billSize) {
		this.billSize = billSize;
		leftToPay=billSize;
	}
	
	public double getBillSize() {
		return billSize;
	}
	public void setBillSize(double billSize) {
		this.billSize = billSize;
	}
	public double getLeftToPay() {
		return leftToPay;
	}
	public void setLeftToPay(double leftToPay) {
		this.leftToPay = leftToPay;
	}
	
	/*public boolean payBill(User payee, double Amount)
	{
		if(payee.getUserMoney()>Amount)
		{
			
		}
	}*/

}
