package ss.week4;

import java.util.*;

public class MergeSort {
	public static <Elem extends Comparable<Elem>> void mergesort(List<Elem> list) {
		if (list.size() <= 1) {
			return;
		} else {
			int mid = list.size() / 2;
			mergesort(list.subList(0, mid));
			mergesort(list.subList(mid, list.size()-1));
			
		}
	}

	
	/*
	public int compare(Integer e1, Integer e2) {
		if (e2 > e1) {
			return 1;
		} else {
			return 0;
		}
	}
	*/
	public void split() {
		if 
	}
	
}
