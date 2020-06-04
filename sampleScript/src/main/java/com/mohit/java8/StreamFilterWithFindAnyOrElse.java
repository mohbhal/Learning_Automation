package com.mohit.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamFilterWithFindAnyOrElse {

	public static void main(String[] args) {
       List<PojoCustomer> customerList=Arrays.asList(
    		   new PojoCustomer("Tom",30),
    		   new PojoCustomer("Peter",40),
    		   new PojoCustomer("Mohit",32),
    		   new PojoCustomer("Sam",44)
    		   );
       PojoCustomer customer=customerList.stream()
                    .filter(ele->"Peter".equals(ele.getName()))
                    .findAny()
                    .orElse(null);
       System.out.println(customer.getName() + " " + customer.getAge());
       
       PojoCustomer customer1=customerList.stream()
               .filter(ele->"ABC".equals(ele.getName()))
               .findAny()
               .orElse(null);
  System.out.println(customer1);
  
  System.out.println("------------------");
  PojoCustomer customer2=customerList.stream()
          .filter(ele->"Mohit".equals(ele.getName()) && 32==ele.getAge())
          .findAny()
          .orElse(null);
System.out.println(customer2.getName() + " "+customer2.getAge());


     
	}

}
