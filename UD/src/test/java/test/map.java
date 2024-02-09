package test;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import static org.testng.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.Streams;

public class map {
	@Test
	public void maping() {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Dipak");
		name.add("Ram");
		name.add("Raj");
		name.add("Rahut");
		name.add("Znkit");
		name.add("Abhishek");

		ArrayList<String> name1 = new ArrayList<String>();
		name.add("AB");
		name.add("CD");
		name.add("EF");
		name.add("GH");
		name.add("IK");
		name.add("JK");
		
		
		String name3[]= {"oo" , "pp"};   //array

		// name.stream().filter(a -> a.endsWith("t")).map(a ->
		// a.toUpperCase()).forEach(a -> System.out.println(a));
		// name.stream().map(a -> a.toUpperCase()).forEach(a -> System.out.println(a));
		// name.stream().filter(a->a.endsWith("t")).sorted().map(a->a.toUpperCase()).forEach(a->System.out.println(a));
		// name.stream().filter(a->a.startsWith("R")).sorted().forEach(a->System.out.println(a));
       
		//combining two arraylist
		//Stream<String> combined = Streams.concat(name.stream(), name1.stream());
       //combined.forEach(a->System.out.println(a));
       
       List<String> na = Arrays.asList(name3);                          //converting array to list
       //na.stream().sorted().forEach(p->System.out.println(p));
       Streams.concat(name.stream(),name1.stream(),na.stream()).forEach(z->System.out.println(z));
      
       boolean flag= na.stream().anyMatch(a->a.equalsIgnoreCase("oo"));
       
	Assert.assertTrue(flag);
	System.out.println(flag);
	
	
	
       
       
	}

}
