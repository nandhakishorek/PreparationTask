package basic2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
	public static void main(String[] args) {
     List<Integer>list1=Arrays.asList(35,26,18);
     List<Integer>list2=Arrays.asList(46,12,56);
     List<List<Integer>> a= Arrays.asList(list1,list2);
     List<Integer>  result =a.stream().flatMap(z->z.stream()).collect(Collectors.toList());
     result.forEach(z->System.out.println(z));
     
     
	}
}
