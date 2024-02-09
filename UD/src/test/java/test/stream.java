package test;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class stream {
	@Test
	public void actual() {

		ArrayList<String> name = new ArrayList<String>();
		name.add("Dipak");
		name.add("Ram");
		name.add("Raj");
		name.add("Rahul");
		name.add("Ankit");
		name.add("Abhishek");
		int count = 0;
		for (int i = 0; i < name.size(); i++) {
			String actualname = name.get(i);
			if (actualname.startsWith("A")) {
				count++;
			}

		}
		System.out.println(count);
	}

	@Test
	public void streams() {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Dipak");
		name.add("Ram");
		name.add("Raj");
		name.add("Rahul");
		name.add("Ankit");
		name.add("Abhishek");

		long names = name.stream().filter(p -> p.startsWith("R")).count();
		System.out.println(names);
		 name.stream().filter(a->a.length()>4).forEach(a->System.out.println(a));
	     name.stream().filter(a->a.length()>4).limit(2).forEach(a->System.out.println(a));
	     }
}
