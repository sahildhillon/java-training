package assignment_inheritance_3;

public abstract class Item {
	private String title;
	private int uin;
	private int noOfCopies;

	

	public Item(String title, int uin, int noOfCopies) {
		super();
		this.title = title;
		this.uin = uin;
		this.noOfCopies = noOfCopies;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getUin() {
		return uin;
	}

	public void setUin(int uin) {
		this.uin = uin;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (uin != other.uin)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Item [title=" + title + ", uin=" + uin + ", noOfCopies=" + noOfCopies + "]";
	}

	public void print() {
		System.out.println("Title: " + title);
		System.out.println("Unique Identifier Number: " + uin);
		System.out.println("No. of Copies: " + noOfCopies);
	}

	public void checkIn() {
		System.out.println("Check in.");
	}

	public void checkOut() {
		System.out.println("Check out.");
	}
	
	public void addItem(String title, int uin, int noOfCopies) {
		this.title = title;
		this.uin = uin;
		this.noOfCopies = noOfCopies;
	}

}
