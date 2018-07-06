package cn.edu.scau.cmi.zhangjiayi.composite.transparent;

import java.util.ArrayList;

public class Organization extends Component {
	
	String name;
	ArrayList<Component> childs = new ArrayList<Component>();
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("I am organization's operation");
	}

	
	@Override
	public void add(Component child) {
		// TODO Auto-generated method stub
		this.childs.add(child);
	}
	
	@Override
	public void del(Component child) {
		// TODO Auto-generated method stub
		this.childs.remove(child);
	}

	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public ArrayList<Component> getChild(){
		return childs;
	}
}
