package cn.edu.scau.cmi.zhangjiayi.abstractFactory.domain;

import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainAbstactClass.Pad;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainInterface.Huawei;

public class HuaweiPad extends Pad implements Huawei {
	@Override
	public void use()
	{
		System.out.println("华为平板");
		System.out.println("电子产品类型："+super.name+"品牌："+Huawei.brand);
	}
}
