package bookstore_hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookStoreMain {

	public static void main(String[] args) {
		System.out.println(
				"-------------------------------------------Borrows List-----------------------------------------------");

		System.out.println("\n");
		System.out.println("Book Title" + "\tCustomer" + "\t Borrow Date"+"  \tType");

		for (BorrowBookItem borrowBookitem : BookStoreDataSource.borrowBookItems) {
			if (borrowBookitem.getStatusId() == 1) {

				System.out.print(getBookTilteById(borrowBookitem.getBookId(), BookStoreDataSource.books) + "    " + "\t"
						+ getCustomerNameById(borrowBookitem.getCustomerId(), BookStoreDataSource.customers)
						+ "\t         " + borrowBookitem.getDate());
				List<BookTypeProfile> typeList = getBookTypeByBookId(borrowBookitem.getBookId(), BookStoreDataSource.books,
						BookStoreDataSource.booktypes);

				System.out.print("\t");

				for (BookTypeProfile bookType : typeList) {
					System.out.print(getTypeById(bookType.getTypeId(), BookStoreDataSource.types)+" | ");}
				    System.out.println("\n");
			}
		}

		System.out.println(
				"------------------------------------------------------------------------------------------------------");

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter book Id:");
		int bookId = sc.nextInt();

		for (Book b : BookStoreDataSource.books) {
			if (b.getId() == bookId) {
				System.out.println("Book title: " + b.getTitle());
				System.out.println("Book ISBN: " + b.getISBN());
				System.out.println("Book Auhtor " + getAuthorNameById(b.getAuthorId(), BookStoreDataSource.authors));

			}
		}
		List<BookTypeProfile> typeList = getBookTypeByBookId(bookId, BookStoreDataSource.books,
				BookStoreDataSource.booktypes);

		System.out.print("Type :\t");

		for (BookTypeProfile bookType : typeList) {
			System.out.print(getTypeById(bookType.getTypeId(), BookStoreDataSource.types)+" | ");}
		    System.out.println("\n");
			for (BorrowBookItem borrowBookitem : BookStoreDataSource.borrowBookItems) {

				if (borrowBookitem.getBookId() == bookId) {

					System.out.println(
							"Status:" + getStatusById(borrowBookitem.getStatusId(), BookStoreDataSource.status) + " by "
									+ getCustomerNameById(borrowBookitem.getCustomerId(), BookStoreDataSource.customers)
									+ " on " + borrowBookitem.getDate());
				}

			}

			sc.close();
		}
}
