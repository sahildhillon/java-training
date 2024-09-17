package assignmentList;

public class StringFreq implements Comparable<StringFreq>{
	private int freq;
	private String name;
	public StringFreq(int freq, String name) {
		super();
		this.freq = freq;
		this.name = name;
	}
	public int getFreq() {
		return freq;
	}
	public void setFreq(int freq) {
		this.freq = freq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(StringFreq o) {
		// TODO Auto-generated method stub
		return o.freq-this.freq;
		
	}
	@Override
	public String toString() {
		return "StringFreq [freq=" + freq + ", name=" + name + "]";
	}
	
	
	
	
}
