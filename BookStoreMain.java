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
	

	public static String getAuthorNameById(int id, Author[] authors) {
		for (Author author : authors) {
			if (author.getId() == id) {
				return author.getName();
			}
		}
		return null;
	}

	public static String getCustomerNameById(int id, Customer[] customers) {
		for (Customer customer : customers) {
			if (customer.getId() == id) {
				return customer.getName();
			}
		}
		return null;
	}

	public static String getBookTilteById(int id, Book[] books) {
		for (Book book : books) {
			if (book.getId() == id) {
				return book.getTitle();
			}
		}
		return null;
	}

	public static String getStatusById(int id, Status[] statuses) {
		for (Status status : statuses) {
			if (status.getId() == id) {
				return status.getName();
			}
		}
		return null;

	}

	public static List<BookTypeProfile> getBookTypeByBookId(int bookId, Book[] books, BookTypeProfile[] bookTypes) {
		List<BookTypeProfile> list = new ArrayList<BookTypeProfile>();
		for (BookTypeProfile bookType : bookTypes) {
			if (bookType.getBookId() == bookId) {
				list.add(bookType);
			}
		}
		return list;

	}

	public static String getTypeById(int id, Type[] types) {
		for (Type type : types) {
			if (type.getId() == id) {
				return type.getName();
			}
		}
		return null;
	}
}
