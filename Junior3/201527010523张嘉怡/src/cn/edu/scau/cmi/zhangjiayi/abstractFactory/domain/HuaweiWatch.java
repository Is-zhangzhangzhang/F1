package cn.edu.scau.cmi.zhangjiayi.abstractFactory.domain;

import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainAbstactClass.Watch;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainInterface.Huawei;

public class HuaweiWatch extends Watch implements Huawei {
	@Override
	public void use()
	{
		System.out.println("华为手表");
		System.out.println("电子产品类型："+super.name+"品牌："+Huawei.brand);
	}
}
