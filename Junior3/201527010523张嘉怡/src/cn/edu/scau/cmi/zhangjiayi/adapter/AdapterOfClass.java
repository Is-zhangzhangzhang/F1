package cn.edu.scau.cmi.zhangjiayi.adapter;

public class AdapterOfClass extends Adaptee implements Target{
	
	@Override
	public int adapterTo5(){
		int source = Source220();
		System.out.println("现在的电源电压是："+source);
		int voltage = 5;
		System.out.println("使用适配器后,转换为5V");
		return voltage;
	}
	
	@Override
	public int adapterTo20(){
		int source = Source220();
		System.out.println("现在的电源电压是："+source);
		int voltage = 20;
		System.out.println("使用适配器后,转换为20V");
		return voltage;
	}
}
