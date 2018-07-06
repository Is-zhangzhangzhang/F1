package cn.edu.scau.cmi.zhangjiayi.client;

import java.util.ArrayList;

import cn.edu.scau.cmi.zhangjiayi.Multiton.Marshal;

public class MultitonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Marshal> newList = new ArrayList<Marshal>();
		for(int i=1;i<=10;i++)
		{
			newList.add( Marshal.getInstance("元帅"+i) );
			System.out.println( newList.get(i-1).getName() );
		}
		//测试创建第11个元帅能否成功
		Marshal marshal = Marshal.getInstance("元帅11");
	}
}
