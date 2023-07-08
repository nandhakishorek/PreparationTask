package basic2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		ArrayList<Employee> emps = new ArrayList<>();
		Employee e1 = new Employee("Nandha", "male", "javadeveloper", 1132, 25000, 'K');
		Employee e2 = new Employee("Kishore", "male", "pythondeveloper", 1120, 30000, 'K');
		Employee e3 = new Employee("Lokesh", "male", "Tester", 1112, 35000, 'P');
		Employee e4 = new Employee("Murali", "male", "System Engineer", 1153, 26000, 'P');
		Employee e5 = new Employee("Harini", "female", "support engineer", 1167, 28000, 'A');
		Employee e6 = new Employee("Viji", "female", "javadeveloper", 1144, 20000, 'S');
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		emps.add(e6);
		// filter
		List<Employee> fil = emps.stream().filter(z -> z.getGender().equalsIgnoreCase("male"))
				.collect(Collectors.toList());
		fil.forEach(a -> System.out.println(a));

		System.out.println();
		// map
		List<String> map = emps.stream().map(z -> z.getName()).collect(Collectors.toList());
		map.forEach(a -> System.out.println(a));

		System.out.println();
		// count
		long count = emps.stream().filter(z -> z.getSalary() >= 30000).count();
		System.out.println(count);

		System.out.println();
		// distinct
		List<String> dis = emps.stream().map(z -> z.getRole()).distinct().collect(Collectors.toList());
		dis.forEach(a -> System.out.println(a));

		System.out.println();
		// sorted ascending
		List<String> sortAsc = emps.stream().map(z -> z.getName()).sorted().collect(Collectors.toList());
		sortAsc.forEach(a -> System.out.println(a));

		System.out.println();
		// sorted descending comparator or collection can be used
		List<String> sortDsc = emps.stream().map(z -> z.getName()).sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		sortDsc.forEach(a -> System.out.println(a));

		System.out.println();
		// limit
		List<Employee> limit = emps.stream().limit(3).collect(Collectors.toList());
		limit.forEach(a -> System.out.println(a));

		System.out.println();
		// anymatch
		boolean b = emps.stream().map(c -> c.getName()).anyMatch(c -> c.equalsIgnoreCase("Nandha"));
		System.out.println(b);

		System.out.println();
		// max
		Employee max = emps.stream().max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(max);

		System.out.println();
		// min
		Employee min = emps.stream().min(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(min);

		System.out.println();
		// summingint
		int f = emps.stream().collect(Collectors.summingInt(Employee::getSalary));
		System.out.println(f);

		System.out.println();
		// Second max salary
		int s = emps.stream().map(z -> z.getSalary()).sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		System.out.println(s);
	   
		//toMap
		System.out.println();
		Map<Integer,Employee> list1= emps.stream().collect(Collectors.toMap(x->x.getId(), y->y));
		list1.keySet().forEach(x->System.out.println(x));
		
		
		//toSet
		System.out.println();
		Set<Employee> list2=emps.stream().collect(Collectors.toSet());
		list2.forEach(x->System.out.println(x));
		
		System.out.println();
		//groupingby
		Map<String,List<Employee>> grpby = emps.stream().collect(Collectors.groupingBy(Employee::getName));
		grpby.forEach((x,y) -> System.out.println(x+" "+y));
	
	
	}
}
