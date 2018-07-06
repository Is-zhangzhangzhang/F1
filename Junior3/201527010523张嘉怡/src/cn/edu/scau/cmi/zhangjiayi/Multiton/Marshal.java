package cn.edu.scau.cmi.zhangjiayi.Multiton;

import java.util.ArrayList;

public class Marshal {
	private static ArrayList<Marshal> list = new ArrayList<Marshal>();
	private static int count = 0;
	private String name;
	private Marshal() {
		
	}
	public static Marshal getInstance(String name){
		if(count < 10)
		{
			Marshal marchal = new Marshal();
			marchal.name = name;
			list.add(marchal);
			count++;
			return marchal;
		}
		else 
		{
			System.out.println("元帅人数已达10人，不能再任命元帅");
		}
		return null;
	}
	public String getName() {
		return this.name;
	}
}
