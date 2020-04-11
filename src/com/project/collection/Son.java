package com.project.collection;

public class Son extends Father{
	void say() {
		System.out.println("子类重写父类方法 ");
	}
	
	public static void main(String[] args) {
		 Father father=new Son();
		 father.say();
		//Son son=new Son();
	}
}
