package com.example.Mainmethode;

import com.example.Model.Collage;

public class Test {
	public void m1()
	{
		Collage c=new Collage();
		c.setId(1);
		c.setName("mpgi");
		c.setFees("80000");
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getFees());
				
	}

	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
	}

}
