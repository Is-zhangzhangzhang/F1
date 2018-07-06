package cn.edu.scau.cmi.zhangjiayi.abstractFactory.factory;

import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domain.ApplePad;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domain.ApplePhone;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domain.AppleWatch;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainAbstactClass.Pad;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainAbstactClass.Phone;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainAbstactClass.Watch;

public class AppleFactroy extends AbstractFactory {
	@Override
	public Phone createPhone() {
		return new ApplePhone();
	}
	@Override
	public Pad createPad() {
		return new ApplePad();
	}

	@Override
	public Watch createWatch() {
		return new AppleWatch();
	}
}
