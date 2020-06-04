package com.mohit.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterWithCollect {

	public static void main(String[] args) {
       List<String> products=Arrays.asList("Macbook","iphone","Android","Battery","Lenovo","Shoes");
       System.out.println(products);
       products.forEach(ele->System.out.println(ele));
       
       System.out.println("---------------AfterStream Apply_____________");
       
        List<String> afterStream=products.stream().filter(ele-> !ele.equals("Macbook")).collect(Collectors.toList());
                 
        afterStream.forEach(ele->System.out.println(ele));
                 
	}
	

}
