package com.stringbuilder.questions;

public class Replace {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello Java");
		sb.replace(6, 10, "world");
		System.out.println(sb.toString());

	}

}
