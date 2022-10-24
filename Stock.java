package bookstore_hw;

public class Stock {
	private int id;
	private int bookId;
	private int locationId;
	private int quantity;

	public Stock() {
	}

	public Stock(int id, int bookId, int locationId, int quantity) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.locationId = locationId;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
