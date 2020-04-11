package com.project.collection;

public class Main {
	
	String name;
	public Main(String name) {
		System.out.println("");
		this.name=name;
	}
	
	public static void main(String[] args) {
        String string="aaa";
        String cString=string.concat("b");
        System.out.println(string);
        System.out.println(cString==string.concat("b"));
        System.out.println(cString);
        System.out.println(cString=="aaab");
        String string2="abc";
        System.out.println(string2=="abc");
        	Main main=new Main("ºÙºÙ");
        	System.out.println(main.name);
	}
}
