package cn.edu.scau.cmi.zhangjiayi.client;

import java.util.Scanner;

import cn.edu.scau.cmi.zhangjiayi.domain.Meat;
import cn.edu.scau.cmi.zhangjiayi.factory.MeatFactory;

public class FactoryClient {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("please input the meat you want:");
		String meatTypeString = input.nextLine();
		Meat meat = createObject(meatTypeString);
	}
	public static Meat createObject(String meatType)
	{
		return MeatFactory.getInstance(meatType);
	}
}
