package bookstore_hw;

import java.util.ArrayList;
import java.util.List;

public class BookStoreService {
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
