package Interview_Progm2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;



public class Count_Char {

	public static void main(String[] args) {

		String ram = "India is Wining Icc world cap in India by Chase Master";

		Map<Character, Integer> map = new HashMap<>();

		char[] ramg = ram.toCharArray();

		for (char rama : ramg) {
			if (!map.containsKey(rama)) {

				map.put(rama, 1);
			} else {

				int value = map.get(rama);

				map.put(rama, value + 1);
			}

		}

		System.out.println("Count of Each Char is -  >" + map);

		System.out.println("\n************\n");

		map.forEach((k, v) -> {

			if (v > 1) {
				System.out.println(k + " " + v);
			}
		});

		System.out.println("\n******Using Java 8******\n");

		Map<Object, Long> chas = ram.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		System.out.println(chas);

		chas.forEach((k, v) -> {

			if (v > 1) {
				System.out.println(k + "  " + v);
			}
		});

		System.out.println("\n*****Count the Each String *******\n");

		String[] str = ram.split(" ");

		Map<String, Integer> map1 = new HashMap<>();

		for (String cnt : str) {

			if (!map1.containsKey(cnt)) {
				map1.put(cnt, 1);
			} else {

				int value = map1.get(cnt);

				map1.put(cnt, value + 1);
			}
		}
		System.out.println("Count of String is -> " + map1);
		
		
		
		
		
  		
		
		
		
		

		System.out.println("\n*****Reverse of Each Words *******\n");

		String Output = " ";

		for (String revs : str) {

			String reverse = " ";

			for (int i = revs.length() - 1; i >= 0; i--) {

				reverse = reverse + revs.charAt(i);
			}
			Output = Output + reverse;
		}

		System.out.println(Output);

		
		
		
		
		
		
		System.out.println("\n*****Reverse of String*******\n");

		for (int i = ram.length() - 1; i >= 0; i--) {
			System.out.print(ram.charAt(i));
		}

		StringBuffer sb = new StringBuffer(ram);

		System.out.println("\n" + sb.reverse());

		StringBuilder sd = new StringBuilder(ram);

		System.out.println("\n" + sd.reverse());
	}

}
