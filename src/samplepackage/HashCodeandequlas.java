package samplepackage;

import java.util.HashMap;
import java.util.Map;

public class HashCodeandequlas {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);
		
		Map<Employee, String> map = new HashMap<Employee,String>();
		map.put(emp1, "Jack");
		map.put(emp2, "Jack");
		System.out.println(map.size());
		
		Integer i = new Integer(1);
		Integer i1 = new Integer(1);
		Map<Integer, String> map1 = new HashMap<Integer,String>();
		map1.put(i, "One");
		map1.put(i1, "One");
		System.out.println(map1.size());
		
		Map<String, String> map2 = new HashMap<String,String>();
		map2.put("Temp", "Jack");
		map2.put("Temp", "Jack");
		System.out.println(map2.size());
	}

}

class Employee
{
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		if (id != other.id)
//			return false;
//		return true;
//	}
	int id;
	public Employee(int id ){
		this.id = id;
	}
}