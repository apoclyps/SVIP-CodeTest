package uk.co.kyleharrison.codetest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;

public class Intersects {

	private int[] x = { 1, 2, 3, 4, 5 };
	private int[] y = { 2, 5 };
	private int[] joinedList;
	private Map<Integer, Integer> hashMap;
	private ArrayList<Integer> duplicateList;

	public Intersects() {
		super();
		this.hashMap = new HashMap<Integer, Integer>();
		this.duplicateList = new ArrayList<Integer>();
	}

	public Intersects(int[] x, int[] y) {
		super();
		this.x = x;
		this.y = y;
		this.hashMap = new HashMap<Integer, Integer>();
		this.setNewList(joinLists());
		this.duplicateList = new ArrayList<Integer>();
	}

	public int[] getX() {
		return x;
	}

	public void setX(int[] x) {
		this.x = x;
	}

	public int[] getY() {
		return y;
	}

	public void setY(int[] y) {
		this.y = y;
	}

	public Map<Integer, Integer> getHashMap() {
		return hashMap;
	}

	public void setHashMap(Map<Integer, Integer> hashMap) {
		this.hashMap = hashMap;
	}

	public int[] getNewList() {
		return joinedList;
	}

	public void setNewList(int[] newList) {
		this.joinedList = newList;
	}

	public void addListsToHashMap() {
		for (int x : joinedList) {
			if (hashMap.get(x) != null)
				hashMap.put(x, ((int) hashMap.get(x) + 1));
			else
				hashMap.put(x, 1);
		}
	}

	public int[] joinLists() {
		return ArrayUtils.addAll(this.x, this.y);
	}

	public void printJoinedList() {
		System.out.println("Printing values of Joined List");
		for (int i = 0; i < this.joinedList.length; i++) {
			System.out.println("Element " + i + " : " + this.joinedList[i]);
		}
	}

	public void printExpectedResults() {
		System.out.println("List x Size : " + x.length + "\n"
				+ "List y Size : " + y.length);
		System.out.println("Expected Size : " + (x.length + y.length));
		System.out.println("Actual Size : " + this.joinedList.length);
	}

	public ArrayList<Integer> getDuplicateKeys() {
		int duplicateKeysCount=0;
		for(int key : this.hashMap.keySet()){
			if(this.hashMap.get(key)>=2){
				this.duplicateList.add(key);
				duplicateKeysCount++;
			}
		}
		System.out.println("Found "+duplicateKeysCount+" Duplicate Keys");
		return this.duplicateList;
	}

	public ArrayList<Integer> getDuplicateList() {
		return duplicateList;
	}

	public void setDuplicateList(ArrayList<Integer> duplicateList) {
		this.duplicateList = duplicateList;
	}
}
