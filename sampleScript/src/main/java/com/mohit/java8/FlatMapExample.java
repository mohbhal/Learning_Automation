package com.mohit.java8;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapExample {

	public static void main(String[] args) {

    String data[][]=new String[][] {{"a","b"},{"c","d"}};
    
    Stream<String[]> str=Arrays.stream(data);
    
    Stream<String> flatmap=str.flatMap(ele->Arrays.stream(ele));
    
    Stream<String> res=flatmap.filter(ele->"a".equals(ele.toString()));
    res.forEach(System.out::println);
    
	}

}
