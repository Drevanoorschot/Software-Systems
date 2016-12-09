package ss.week4;

import java.util.*;

public class MergeSort {
	public static <Elem extends Comparable<Elem>> void mergesort(List<Elem> list) {
		System.out.println(list);
		if (list.size() <= 1) {
			return;
		} else {
			int mid = list.size() / 2;
			int last = list.size();
			mergesort(list.subList(0, mid));
			mergesort(list.subList(mid, last));
			ArrayList<Elem> results = new ArrayList<Elem>();
			int fi = 0;
			int si = 0;
			int fstSize = list.subList(0, mid).size();
			int sndSize = list.subList(mid, last).size();
			while (0 <= fi && fi < fstSize &&
					0 <= si && si < sndSize) {
				System.out.println(results);
				if (list.subList(0, mid).get(fi).compareTo(list.subList(mid, last).get(si)) < 0) {
					results.add(list.subList(0, mid).get(fi));
					fi++;
				} else {
					results.add(list.subList(mid, last).get(si));
					si++;
				}
			}
			if (0 <= fi && fi < fstSize) {
				results.addAll(list.subList(fi, mid));
			} else {
				results.addAll(list.subList(si + mid, last));
			}
			//System.out.println(results);
			for (int i = 0; i < results.size(); i++) {
				list.set(i,(Elem) results.get(i));
			}
		}
	}
}

