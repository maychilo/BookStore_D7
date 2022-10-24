package bookstore_hw;

public class BookStoreDataSource {
	public static Book[] books = { new Book(1, "Friends Fur", "123456", 1), new Book(2, "Weirdo", "9781742837581", 1),
			new Book(3, "The World", "9781742837581", 2) };

	public static Author[] authors = { new Author(1, "An Do"), new Author(2, "David Walliams") };

	public static Type[] types = { new Type(1, "Fiction"), new Type(2, "Education"), new Type(3, "Fun"),
			new Type(3, "Children"), new Type(4, "Si-fi") };

	public static Location[] locations = { new Location(1, "Kogaran"), new Location(2, "Miranda") };

	public static Customer[] customers = { new Customer(1, "Chloe"), new Customer(2, "Olive"),
			new Customer(3, "Chichi") };

	public static BookTypeProfile[] booktypes = { new BookTypeProfile(1, 1), new BookTypeProfile(1, 2),
			new BookTypeProfile(2, 1), new BookTypeProfile(2, 3), new BookTypeProfile(2, 3),new BookTypeProfile(3, 4) };

	public static Status[] status = { new Status(1, "borrow"), new Status(2, "returned") };

	public static BorrowBookItem[] borrowBookItems = { new BorrowBookItem(1, 1, "12/02/2022", 1),
			new BorrowBookItem(2, 1, "12/02/2022", 1), new BorrowBookItem(3, 2, "16/02/2022", 1),
			new BorrowBookItem(1, 1, "17/02/2022", 2), new BorrowBookItem(2, 3, "17/02/2022", 1),
			new BorrowBookItem(3, 3, "17/02/2022", 1) };

}
