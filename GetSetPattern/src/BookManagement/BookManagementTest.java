package BookManagement;

import people.Human;

public class BookManagementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookManagement bookManagement = new BookManagement();

		bookManagement.setTitle("총,균,쇠");
		bookManagement.setWriter("재레드 다이아몬드");
		bookManagement.setPublisher("문학사상");
		bookManagement.setPrice(25200);
		bookManagement.setPublicationDate("2005.12.19");
		
		String title = "";
		String writer = "";
		String publisher = "";
		int price = 0;
		String publicationDate = "";

		title = bookManagement.getTitle();
		writer = bookManagement.getWriter();
		publisher = bookManagement.getPublisher();
		price = bookManagement.getPrice();
		publicationDate = bookManagement.getPublicationDate();
		
		System.out.println(title);
		System.out.println(writer);
		System.out.println(publisher);
		System.out.println(price);
		System.out.println(publicationDate);
		
	}

}
