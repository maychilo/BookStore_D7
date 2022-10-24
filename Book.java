package bookstore_hw;

public class Book {
	private int id;
	private String title;
	private String ISBN;
	private int authorId;

	public Book() {
	}

	public Book(int id, String title, String iSBN, int authorId) {
		super();
		this.id = id;
		this.title = title;
		ISBN = iSBN;
		this.authorId = authorId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title= title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

}
