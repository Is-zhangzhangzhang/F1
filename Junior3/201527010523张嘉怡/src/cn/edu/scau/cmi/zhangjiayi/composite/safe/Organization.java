package cn.edu.scau.cmi.zhangjiayi.composite.safe;

import java.util.ArrayList;

public class Organization implements Component {
	String name;
	ArrayList<Component> childs = new ArrayList<Component>();
	
	@Override
	public void operation(){
		System.out.println("I am organization's operation");
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void addOrganization(Component child){
		this.childs.add(child);
	}
	
	public void delOrganizaiton(Component child){
		this.childs.remove(child);
	}
	
	public ArrayList<Component> getChild(){
		return childs;
	}
}
