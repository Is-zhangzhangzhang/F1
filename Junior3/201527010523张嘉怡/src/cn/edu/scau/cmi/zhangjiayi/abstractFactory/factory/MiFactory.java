package cn.edu.scau.cmi.zhangjiayi.abstractFactory.factory;

import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domain.MiPad;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domain.MiPhone;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domain.MiWatch;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainAbstactClass.Pad;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainAbstactClass.Phone;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainAbstactClass.Watch;

public class MiFactory extends AbstractFactory {
	
	@Override
	public Phone createPhone(){
		return new MiPhone();
	}
	
	@Override
	public Pad createPad(){
		return new MiPad();
	}
	
	@Override
	public Watch createWatch()
	{
		return new MiWatch();
	}
	
}
