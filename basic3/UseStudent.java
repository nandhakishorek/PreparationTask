package basic3;

import java.util.HashMap;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student("nandha", "male", 101, 22);
		Student s2 = new Student("kishore", "male", 102, 26);
		Student s3 = new Student("lokesh", "male", 103, 22);
		HashMap<Integer, Student> std = new HashMap<>(10);

		std.put(s1.getRollNumber(), s1);
		std.put(s2.getRollNumber(), s2);
		std.put(s3.getRollNumber(), s3);

		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s1.equals(s3));

		std.values().forEach(x -> System.out.println(x));
	}

}
