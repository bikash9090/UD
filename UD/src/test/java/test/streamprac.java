package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamprac {

	public static void main(String[] args) {
		
		Integer num []= {1,2,7,9,4,5,5};
		List<Integer> number = Arrays.asList(num);
		number.stream().sorted().forEach(a->System.out.println(a));
		List<Integer> sorted = number.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		System.out.println(sorted.get(2));
		
		
		
	}


	}
