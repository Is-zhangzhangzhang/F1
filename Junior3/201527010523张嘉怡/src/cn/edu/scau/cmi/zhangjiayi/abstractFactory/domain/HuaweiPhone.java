package cn.edu.scau.cmi.zhangjiayi.abstractFactory.domain;

import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainAbstactClass.Phone;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainInterface.Huawei;

public class HuaweiPhone extends Phone implements Huawei {
	@Override
	public void use()
	{
		System.out.println("华为手机");
		System.out.println("电子产品类型："+super.name+"品牌："+Huawei.brand);
	}
}
