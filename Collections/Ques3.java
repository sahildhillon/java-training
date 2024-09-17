package assignmentList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls  = new ArrayList<String>();
		ls.add("Banana");
		ls.add("Apple");
		ls.add("Apple");
		ls.add("Apple");
		ls.add("Banana");
		ls.add("Orange");
		ls.add("Banana");
		ls.add("Orange");
		ls.add("Mango");
		ls.add("Apple");
		ls.add("Pineapple");
		
		
		
		Collections.sort(ls);
		
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		
		for(String x:ls) {
			if(hm.containsKey(x)) {
				hm.put(x, hm.get(x)+1);
			}
			else {
				hm.put(x, 1);
			}
			
		}
		
		
		
		System.out.println(hm);
		List<StringFreq> sortedFreqList = new ArrayList<>();
//		for(int i=0;i<hm.size();i++) {
//			
//		}
		for(String x:hm.keySet()) {
			sortedFreqList.add(new StringFreq(hm.get(x), x));
		}
		
		Collections.sort(sortedFreqList);
		int N=3;
		for(int i=0;i<N;i++) {
			System.out.println(sortedFreqList.get(i).getName());
		}
		System.out.println(sortedFreqList);
		
//		Collections.sort(sortedFreqList,(x,y)->{
//			
//		});
		
		
		
		//System.out.println(ls);
	}

}
