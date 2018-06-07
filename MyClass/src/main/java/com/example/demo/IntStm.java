package com.example.demo;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStm{
	public static void main(String[] args) {
		IntStream.of(5,10);
		Stream.of("1","3","5").mapToInt(Integer::parseInt);//.forEach(System.out::println);
		IntStream.builder().add(1).add(2).add(3).build();//.forEach(System.out::println);
		IntStream.concat(IntStream.builder().add(1).build(),IntStream.builder().add(1).build());//.forEach(System.out::println);
		@SuppressWarnings("unused")
		IntStream emptyStream = IntStream.empty();
		IntStream.generate(() -> 1).limit(30);//.forEach(System.out::println);
		IntStream.iterate(0, n -> n+3).limit(3).boxed().collect(Collectors.toList());//.forEach(System.out::println);
		IntStream.range(30, 50);//.forEach(System.out::println);
		IntStream.rangeClosed(30, 50);//.forEach(System.out::println);
		
		//1,2,3,5....
		Stream.generate(new Shulie()).limit(10).forEach(System.out::println);
		
		// Stream<Integer> shuli = Stream.generate(new Shulie());
	    //shuli.limit(10).forEach(System.out::println);

	}
}
