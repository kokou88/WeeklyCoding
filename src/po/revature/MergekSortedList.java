package po.revature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergekSortedList {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		LinkedList list3 = new LinkedList();
		
		list1.add(9);
		list1.add(5);
		list1.add(2);
		
		list2.add(3);
		list2.add(2);
		list2.add(7);
		
		list3.add(5);
		list3.add(9);
		
		LinkedList[] lList = {list1, list2, list3};
		
		System.out.println(mergeLinkedLists(lList));
	}
	
	
	static LinkedList<Integer> mergeLinkedLists(LinkedList<Integer>[] arry) {
		List<Integer> newList = new ArrayList<>();
		for (int i = 0; i < arry.length; i++) {
			for(int j = 0; j < arry[i].size(); j++) {
				newList.add((int)arry[i].get(j));
			}
		}
		Collections.sort(newList);
		LinkedList<Integer> newLink = new LinkedList<>();
		for(int i = 0; i < newList.size(); i++) {
			newLink.add(newList.get(i));
		}
		return newLink;
	}

}