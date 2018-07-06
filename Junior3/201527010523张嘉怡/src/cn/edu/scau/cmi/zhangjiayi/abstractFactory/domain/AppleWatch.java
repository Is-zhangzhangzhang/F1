package cn.edu.scau.cmi.zhangjiayi.abstractFactory.domain;

import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainAbstactClass.Watch;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainInterface.Apple;

public class AppleWatch extends Watch implements Apple {
	@Override
	public void use()
	{
		System.out.println("苹果手表");
		System.out.println("电子产品类型："+super.name+"品牌："+Apple.brand);
	}
}
