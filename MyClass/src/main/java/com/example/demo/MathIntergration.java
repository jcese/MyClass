package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


/**
 * 调用intergarble接口函数
 * @author zjy
 *
 */
public class MathIntergration {
	public static void main(String[] args) {
		double d1 = intergarble(x -> x, 10,100,1000); 
		System.out.println(d1);
		List<People>people = new ArrayList<>();
		findMathpeople(people,p -> p.getId() ==10);
		findMathpeople(people,p -> p.getName().equals("张三"));
		findMathpeople(people,p -> p.getSalcry().equals("abc"));
		System.out.println(mapSum(people, People::getId));//People是实体T，getId包括了f方法又包括了返回值类型；
		
	}
	/**
	 * 数值积分
	 * @param func
	 * @param a
	 * @param b
	 * @param numSlice
	 * @return
	 */
	public static double intergarble (Intergrable func ,double a, double b,int numSlice){
	    if(numSlice<1)
	    	numSlice = 1;
	    
	    double delta = (b-a)/numSlice;
	    double start = a+ delta/2.0; //取区间中间那块;
	    double sum = 0.0;
	    for(int i =0;i<numSlice;i++){
	        sum += delta*func.ecal(start + delta*i);
	    }
	    return sum;
	}
	/**
	 * 操作函数
	 * @param people
	 * @param fun
	 * @return
	 */
	public static List<People> findMathpeople(List<People>people ,Predicate<People>fun){
		return people;
	}
	
	/**
	 * T是输入参数，Integer是方法的返回类型，调用了实体的f方法；
	 * @param entries
	 * @param f
	 * @return
	 */
	public static <T>int mapSum(List<T>entries, Function<T, Integer>f){
		int sum =0;
		for(T entry:entries) {
			sum +=f.apply(entry);
		}
		return sum;
	}
	
}
