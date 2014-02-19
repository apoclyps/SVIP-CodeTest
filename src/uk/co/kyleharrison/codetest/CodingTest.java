package uk.co.kyleharrison.codetest;

public class CodingTest {

	public static void main(String [] arguments){
		int [] x = {1,2,3,4,5};
		int [] y = {2,5};
	
		Intersects hm = new Intersects(x,y);
		hm.printExpectedResults();
		hm.printJoinedList();
		hm.addListsToHashMap();
		System.out.println("Unique Keys : " +hm.getHashMap().keySet());
		System.out.println("Duplicate Keys : "+hm.getDuplicateKeys().toString());
	}
}
