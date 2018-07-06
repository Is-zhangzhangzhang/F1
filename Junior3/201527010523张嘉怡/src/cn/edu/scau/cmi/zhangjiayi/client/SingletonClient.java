package cn.edu.scau.cmi.zhangjiayi.client;

import cn.edu.scau.cmi.zhangjiayi.singleton.Chairman;

public class SingletonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chairman chairman = Chairman.getInstance();
		Chairman chairman2 = Chairman.getInstance();
		System.out.println(chairman.getName() + chairman);
		System.out.println(chairman2.getName()+ chairman2);
	}
}
