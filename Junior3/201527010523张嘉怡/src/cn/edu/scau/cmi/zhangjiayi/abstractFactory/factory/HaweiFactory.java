package cn.edu.scau.cmi.zhangjiayi.abstractFactory.factory;

import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domain.HuaweiPad;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domain.HuaweiPhone;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domain.HuaweiWatch;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainAbstactClass.Pad;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainAbstactClass.Phone;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainAbstactClass.Watch;

public class HaweiFactory extends AbstractFactory {
	@Override
	public Phone createPhone()
	{
		return new HuaweiPhone();
	}
	
	@Override
	public Pad createPad()
	{
		return new HuaweiPad();
	}
	@Override
	public Watch createWatch()
	{
		return new HuaweiWatch();
	}
}
