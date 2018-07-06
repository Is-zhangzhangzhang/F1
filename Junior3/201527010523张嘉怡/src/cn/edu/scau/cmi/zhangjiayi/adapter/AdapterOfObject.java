package cn.edu.scau.cmi.zhangjiayi.adapter;

public class AdapterOfObject implements Target{
	private Adaptee source = new Adaptee();
	@Override
	public int adapterTo5(){
		System.out.println("现在的电源是："+ source.Source220() + "V");
		int voltage = 5;
		System.out.println("使用适配器后,转换为5V");
		return voltage;
	}
	
	@Override
	public int adapterTo20(){
		System.out.println("现在的电源是："+ source.Source220() + "V");
		int voltage = 20;
		System.out.println("使用适配器后,转换为20V");
		return voltage;
	}
}
