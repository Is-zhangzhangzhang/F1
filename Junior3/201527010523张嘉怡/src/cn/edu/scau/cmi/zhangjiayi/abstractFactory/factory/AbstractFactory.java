package cn.edu.scau.cmi.zhangjiayi.abstractFactory.factory;

import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainAbstactClass.Pad;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainAbstactClass.Phone;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainAbstactClass.Watch;

public abstract class AbstractFactory {
	public static AbstractFactory getFactory(String brand) {
		switch (brand) {
			case("mi"): return new MiFactory();
			case("apple"): return new AppleFactroy();
			case("huawei"): return new MiFactory();		
		}
		return null;
	}
	public abstract Phone createPhone();
	public abstract Pad createPad();
	public abstract Watch createWatch();
}
