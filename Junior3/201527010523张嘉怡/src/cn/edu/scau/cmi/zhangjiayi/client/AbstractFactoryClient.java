package cn.edu.scau.cmi.zhangjiayi.client;

import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainAbstactClass.Pad;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainAbstactClass.Phone;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainAbstactClass.Watch;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.factory.AbstractFactory;

public class AbstractFactoryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory factory = AbstractFactory.getFactory("apple");
		Phone phone=factory.createPhone();
		Pad pad = factory.createPad();
		Watch watch=factory.createWatch();
		phone.use();
		pad.use();
		watch.use();
	}

}
