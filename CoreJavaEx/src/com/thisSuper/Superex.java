package com.thisSuper;

class ParentEx {
	static int a = 10;

	ParentEx() {
	//	this.m1();
		//System.out.println(this.a + 10);
		System.out.println("Parent class default constructor");

	}

	ParentEx(int a) {
		System.out.println("Parent class parametrized constructor");

	}

	public void m1() {
		System.out.println("parent class method");
	}
}

class Superex extends ParentEx {
	static int a = 20;

	Superex() {
		//this(10);
		// super(10);
		super.m1();
		this.m1();
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println(this);
		System.out.println("child class constructor");
	}

	Superex(int a) {
		System.out.println("superex class parametrized constructor");

	}

	public void m1() {
		System.out.println("child class method");

	}

	public static void main(String[] args) {
		Superex b = new Superex(1);//current default and parent default constructor will be called no matter if we write this or super
		ParentEx p = new ParentEx();
	}
}