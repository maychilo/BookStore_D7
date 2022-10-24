package bookstore_hw;

public class BorrowBookItem {
	private int bookId;
	private int customerId;
	private String date;
	private int statusId;

	public BorrowBookItem() {

	}

	public BorrowBookItem( int bookId, int customerId, String date, int statusId) {
		super();
		this.bookId = bookId;
		this.customerId = customerId;
		this.date = date;
		this.statusId = statusId;
	}

	

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	

}
