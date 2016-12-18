package ss.week5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapUtil {
	//@ensures \result == true ==> set.size() == list.size();
	//@ensures \result == false ==> set.size() < list.size();
	public static <K, V> boolean isOneOnOne(Map<K, V> map) {
		ArrayList<V> list = new ArrayList<>(map.values());
		Set<V> set = new HashSet<>(map.values());
		return !(set.size() < list.size());

	}
	//@ensures \result == true ==> (for o : range) (map.containsValue(o);
	public static <K, V> boolean isSurjectiveOnRange(Map<K, V> map, Set<V> range) {
		for (Object o : range) {
			if (!(map.containsValue(o))) {
				return false;
			}
		}
		return true;
	}
	//@ensures
	public static <K, V> Map<V, Set<K>> inverse(Map<K, V> map) {
		Map<V, Set<K>> rev = new HashMap<V, Set<K>>();
		for (Map.Entry<K, V> entry : map.entrySet()) {
			if (!(rev.containsKey(entry.getValue()))) {
				rev.put(entry.getValue(), new HashSet<K>());
			}
			rev.get(entry.getValue()).add(entry.getKey());
		}
		return rev;
			
	}

	public static <K, V> Map<V, K> inverseBijection(Map<K, V> map) {
		Map.Entry<K, V> entry = map.entrySet();
		Set<V> valSet = map.entrySet().
		if (isSurjectiveOnRange(map, ) && isOneOnOne(map)) {
			
		}
		return null;
	}

	public static <K, V, W> boolean compatible(Map<K, V> f, Map<V, W> g) {
		// TODO: implement, see exercise P-5.4
		return false;
	}

	public static <K, V, W> Map<K, W> compose(Map<K, V> f, Map<V, W> g) {
		// TODO: implement, see exercise P-5.5
		return null;
	}
}
