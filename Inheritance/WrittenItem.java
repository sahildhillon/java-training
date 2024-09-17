package assignment_inheritance_3;

public class WrittenItem extends Item{
	private String author;
	private int noOfPages;
	public WrittenItem(String title, int uin, int noOfCopies) {
		super(title, uin, noOfCopies);
		// TODO Auto-generated constructor stub
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	
}
