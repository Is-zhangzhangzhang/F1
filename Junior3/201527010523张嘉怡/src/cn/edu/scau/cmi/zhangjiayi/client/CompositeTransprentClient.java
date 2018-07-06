package cn.edu.scau.cmi.zhangjiayi.client;

import java.util.ArrayList;

import cn.edu.scau.cmi.zhangjiayi.composite.transparent.Component;
import cn.edu.scau.cmi.zhangjiayi.composite.transparent.Organization;
import cn.edu.scau.cmi.zhangjiayi.composite.transparent.Person;

public class CompositeTransprentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("组合透明模式：");
		Component school = new Organization();
		((Organization) school).setName("华南农业大学");
		Component union = new Organization();
		((Organization) union).setName("学生会");
		((Organization) school).add(union);
		Component institute = new Organization();
		((Organization) institute).setName("学院");
		((Organization) school).add(institute);
		ArrayList<Component> list = new ArrayList<Component>();
		list = 	((Organization) school).getChild();
		System.out.println(((Organization) school).getName()+"的子组织：");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(((Organization)list.get(i)).getName());
		}
		Component student = new Person();
		((Person) student).operation();
		((Person) student).add(institute);
		((Person) student).del(institute);
	}

}
