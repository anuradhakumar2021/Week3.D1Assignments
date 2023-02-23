package Week3.d1assignment;

public class AxisBank1 extends BankInfo1 {
	public void deposit(int a){
		System.out.println("AxisBank Deposit amount - " + a);
	}
	public static void main(String[] args) {
		
		AxisBank1 objB1 =new AxisBank1();
		objB1.deposit(50000);
		objB1.fixed(100000);
		objB1.savings(500000);
	
	}

}
