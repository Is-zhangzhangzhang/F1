package cn.edu.scau.cmi.zhangjiayi.client;

import cn.edu.scau.cmi.zhangjiayi.adapter.AdapterOfClass;
import cn.edu.scau.cmi.zhangjiayi.adapter.AdapterOfObject;
import cn.edu.scau.cmi.zhangjiayi.adapter.Target;

public class AdapterClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//类适配器客户端
		System.out.println("****类适配器*****");
		Target adapter1 = new AdapterOfClass();
		System.out.println(adapter1.adapterTo20());
		System.out.println(adapter1.adapterTo5());
		
		System.out.println("****对象适配器*****");
		AdapterOfObject adapter2 = new AdapterOfObject();
		adapter2.adapterTo20();
		adapter2.adapterTo5();
	}

}
