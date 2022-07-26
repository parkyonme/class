package ch7.polyAnswer.main;

import ch7.polyAnswer.customer.Customer;
import ch7.polyAnswer.product.Book;
import ch7.polyAnswer.product.Computer;
import ch7.polyAnswer.product.Product;
import ch7.polyAnswer.product.SmartPhone;
import ch7.polyAnswer.product.Tv;
// 다형성 활용 -> 메서드 매개변수
public class PolyArgumentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer ksj = new Customer();
		Customer sdy = new Customer();
		Customer ngh = new Customer();
		ksj.name = "김소진";
		sdy.name = "손다예";
		ngh.name = "남기형";
		
		Customer jys = new Customer();
		Customer ldh = new Customer();
		Customer pym = new Customer();
		jys.name = "조윤성";
		ldh.name = "이동현";
		pym.name = "박윤미";
		
		Customer ogh = new Customer();
		Customer jhs = new Customer();
		Customer lyb = new Customer();
		ogh.name = "오건황";
		jhs.name = "조현석";
		lyb.name = "이영빈";
		
		Customer hwj = new Customer();
		Customer abg = new Customer();
		Customer kth = new Customer();
		hwj.name = "황원준";
		abg.name = "안병규";
		kth.name = "김태훈";

		
		ksj.buy(new Tv());
		sdy.buy(new Tv());
		ngh.buy(new Tv());
		System.out.println(ksj);
		System.out.println(sdy);
		System.out.println(ngh);
		System.out.println();
		jys.buy(new Computer());
		ldh.buy(new Computer());
		pym.buy(new Computer());
		System.out.println(jys);
		System.out.println(ldh);
		System.out.println(pym);
		System.out.println();
		ogh.buy(new SmartPhone());
		jhs.buy(new SmartPhone());
		lyb.buy(new SmartPhone());
		System.out.println(ogh);
		System.out.println(jhs);
		System.out.println(lyb);
		System.out.println();
		hwj.buy(new Book());
		abg.buy(new Book());
		kth.buy(new Book());
		System.out.println(hwj);
		System.out.println(abg);
		System.out.println(kth);

	}

}
