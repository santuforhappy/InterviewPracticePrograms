package samplepackage;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void hashMapex(AbstractMap<Integer, String> map){
		int[] integerArray = {1,-2,3,-4,-5,6};
		for(int x: integerArray){
			map.put(x, Integer.toString(x));
		}
		for(Integer x: map.keySet()){
			System.out.print(map.get(x)+" ");
		}
		System.out.println();
		for(Map.Entry<Integer, String> m:map.entrySet()){
			System.out.print(m.getKey() +" "+m.getValue());
		}
	}
	public static void main(String[] args) {
		
		 HashMap<Integer, String> map = new HashMap<Integer, String>();
		 hashMapex(map);
	}

}
