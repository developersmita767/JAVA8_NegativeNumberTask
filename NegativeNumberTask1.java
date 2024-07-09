//Write a Java program to implement a lambda expression to filter numbers less than zero.

package Java8_Task;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NegativeNumberTask1 {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,-2,-3,-1,-4);
		  Predicate<Integer> isNegative = number -> number < 0;

		  List<Integer> negativeNumbers =list.stream().filter(isNegative).collect(Collectors.toList());
		System.out.println("original numbers " + list);
		System.out.println("negative numbers " + negativeNumbers);


	}

}
