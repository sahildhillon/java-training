package assignment_inheritance_3;

public class Video extends MediaItem{
	private String director;
	private String genre;
	private int yearReleased;
	public Video(String title, int uin, int noOfCopies) {
		super(title, uin, noOfCopies);
		// TODO Auto-generated constructor stub
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYearReleased() {
		return yearReleased;
	}
	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}
	
}
