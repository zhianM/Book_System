package cn.mzan.entity;

public class Book {
	
	private Integer book_id;
	private String name;
	private Integer number;
	private String detail;
	
	public Book() {
		
	}
	public Book(Integer book_id, String name, Integer number, String detail) {
		super();
		this.book_id = book_id;
		this.name = name;
		this.number = number;
		this.detail = detail;
	}
	/**
	 * @return the book_id
	 */
	public Integer getBook_id() {
		return book_id;
	}
	/**
	 * @param book_id the book_id to set
	 */
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the number
	 */
	public Integer getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(Integer number) {
		this.number = number;
	}
	/**
	 * @return the detail
	 */
	public String getDetail() {
		return detail;
	}
	/**
	 * @param detail the detail to set
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", name=" + name + ", number=" + number + ", detail=" + detail + "]";
	}
	
	
	
}
