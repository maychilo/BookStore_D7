package bookstore_hw;

public class BookTypeProfile {
	private int bookId;
	private int typeId;

	public BookTypeProfile() {
	}

	public BookTypeProfile(int bookId, int typeId) {
		super();
		this.bookId = bookId;
		this.typeId = typeId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

}
