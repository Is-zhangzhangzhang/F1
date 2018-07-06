package cn.edu.scau.cmi.zhangjiayi.factory;

import cn.edu.scau.cmi.zhangjiayi.domain.Meat;
import cn.edu.scau.cmi.zhangjiayi.domain.Pork;

public class PorkFactory implements Meat {
	public  Pork createPork()
	{
		return new Pork();
	}
}
