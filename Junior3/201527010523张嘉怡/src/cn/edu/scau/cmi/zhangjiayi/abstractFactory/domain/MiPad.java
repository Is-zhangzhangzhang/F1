package cn.edu.scau.cmi.zhangjiayi.abstractFactory.domain;

import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainAbstactClass.Pad;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainInterface.Mi;

public class MiPad extends Pad implements Mi {
	@Override
	public void use()
	{
		System.out.println("小米平板");
		System.out.println("电子产品类型："+super.name+"品牌："+Mi.brand);
	}
}
