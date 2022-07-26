package ch7.polyAnswer.main;

import ch7.polyAnswer.customer.Customer;
import ch7.polyAnswer.product.Book;
import ch7.polyAnswer.product.Computer;
import ch7.polyAnswer.product.Product;
import ch7.polyAnswer.product.SmartPhone;
import ch7.polyAnswer.product.Tv;
// 다형성 활용 -> 메서드 매개변수
public class PolyArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer[] customerArr = new Customer[12];
		
		customerArr[0] = new Customer(10000, 0, "김소진");
		customerArr[1] = new Customer(10000, 0, "손다예");
		customerArr[2] = new Customer(10000, 0, "남기형");
		customerArr[3] = new Customer(10000, 0, "조윤성");
		customerArr[4] = new Customer(10000, 0, "이동현");
		customerArr[5] = new Customer(10000, 0, "박윤미");
		customerArr[6] = new Customer(10000, 0, "오건황");
		customerArr[7] = new Customer(10000, 0, "조현석");
		customerArr[8] = new Customer(10000, 0, "이영빈");
		customerArr[9] = new Customer(10000, 0, "황원준");
		customerArr[10] = new Customer(10000, 0, "안병규");
		customerArr[11] = new Customer(10000, 0, "김태훈");
		
		for(int i=0; i<12; i++) {
			customerArr[i].buy(new Tv());
			System.out.println(customerArr[i]);
		}
		System.out.println();
		for(int i=0; i<12; i++) {
			customerArr[i].buy(new Computer());
			System.out.println(customerArr[i]);
		}
		
		
		

	}

}
