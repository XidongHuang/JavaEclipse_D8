package tony.java1.exe;

public class TestOrder {
	public static void main(String[] args) {
		Order o1 = new Order(1001, "AA");
		Order o2 = new Order(1001, "AA");
		
		System.out.println(o1.equals(o2));
	}
}

class Order{
	private int orderId;
	private String orderNameString;
	
	public Order(int orderId, String orderNameString) {
		super();
		this.orderId = orderId;
		this.orderNameString = orderNameString;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderNameString() {
		return orderNameString;
	}
	public void setOrderNameString(String orderNameString) {
		this.orderNameString = orderNameString;
	}
	
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		else if(obj instanceof Order){
			Order o = (Order)obj;
			return this.orderId == o.orderId && this.orderNameString == o.orderNameString;
		} else {
			return false;
		}
	}
}