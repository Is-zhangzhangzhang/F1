package cn.edu.scau.cmi.zhangjiayi.factory;

import cn.edu.scau.cmi.zhangjiayi.domain.Beef;
import cn.edu.scau.cmi.zhangjiayi.domain.Meat;
import cn.edu.scau.cmi.zhangjiayi.domain.Pork;

public interface MeatFactory {
	public static Meat getInstance(String MeatTypeString)
	{
		switch(MeatTypeString)
		{
			case("prok"): return new PorkFactory();
			case("beef"): return new BeefFactory();
		}
		return null;
	}
}
