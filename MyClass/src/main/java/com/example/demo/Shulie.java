package com.example.demo;

import java.util.function.Supplier;

public class Shulie implements Supplier<Integer> {
	int m=1;
	int n=1;
	@Override
	public Integer get() {
		int x = m+n;
		m=n;
		n=x;
		return m;
		
	}
	
	
}
