package com.example.Mainmethode;

import com.example.Model.Collage;

public class Test {
	public void m1()
	{
		Collage c=new Collage();
		c.setId(1);
		c.setName("mpgi");
		c.setFees("80000");
		Collage c1=new Collage();
		c1.setId(1);
		c1.setName("mpgi");
		c1.setFees("80000");
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getFees());
		System.out.println(c1.getId());
		System.out.println(c1.getName());
		System.out.println(c1.getFees());
	}

	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
	}

}
