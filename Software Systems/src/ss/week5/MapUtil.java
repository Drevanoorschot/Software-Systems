package ss.week5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapUtil {
	//@ensures \result == (\forall K key, key2; map.containsKey(key) && map.containsKey(key2); map.get(key) != map.get(key2) ==> key != key2);
	//@pure
	public static <K, V> boolean isOneOnOne(Map<K, V> map) {
		ArrayList<V> list = new ArrayList<>(map.values());
		Set<V> set = new HashSet<>(map.values());
		return !(set.size() < list.size());

	}
	//@ensures \result == (\forall V value; range.contains(value); map.containsValue(value)); 
	public static <K, V> boolean isSurjectiveOnRange(Map<K, V> map, Set<V> range) {
		for (Object o : range) {
			if (!(map.containsValue(o))) {
				return false;
			}
		}
		return true;
	}
	
	  //@ensures (\forall V value; map.containsValue(value); \result.containsKey(value));
	  //@ensures (\forall K key; map.containsKey(key); \result.containsValue(key));
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
	//@ensures (\forall V value; map.containsValue(value); \result.containsKey(value));
	//@ensures (\forall K key; map.containsKey(key); \result.containsValue(key));
	public static <K, V> Map<V, K> inverseBijection(Map<K, V> map) {
		Set<V> valSet  = new HashSet<>(map.values());
		Map<V, K> rev = new HashMap<V, K>();
		if (isSurjectiveOnRange(map, valSet) && isOneOnOne(map)) {
			for (Map.Entry<K, V> entry : map.entrySet()) {
				rev.put(entry.getValue(), entry.getKey());
			}
		}
		return rev;
	}
	//@ensures \result == (\forall V value; f.containsValue(value); g.containsKey(value));
	public static <K, V, W> boolean compatible(Map<K, V> f, Map<V, W> g) {
		Set<V> valSet = new HashSet<>(f.values());
		Set<V> keySet = new HashSet<>(g.keySet());
		for (V value : valSet) {
			if (!(keySet.contains(value))) {
				return false;
			}
		}
		return true;
	}
	//@ensures (\forall K key; f.containsKey(key); \result.containsKey(key));
	//@ensures (\forall V value; g.containsValue(value); \result.containsValue(value));
	public static <K, V, W> Map<K, W> compose(Map<K, V> f, Map<V, W> g) {
		if (!(compatible(f, g))) {
			return null;
		}
		Set<K> keySet = new HashSet<>(f.keySet());
		Map<K, W> res = new HashMap<>();
		for (K key : keySet) {
			res.put(key, g.get(f.get(key)));
		}
		return res;
	}
}
