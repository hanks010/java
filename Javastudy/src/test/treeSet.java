package test;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(39);
		treeSet.add(35);
		treeSet.add(98);
		
		for(int name:treeSet) {
			System.out.print(name+" ");
		}
		
	}//main

}
