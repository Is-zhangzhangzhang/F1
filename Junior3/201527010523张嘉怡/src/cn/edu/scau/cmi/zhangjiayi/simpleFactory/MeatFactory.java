package cn.edu.scau.cmi.zhangjiayi.simpleFactory;

import cn.edu.scau.cmi.zhangjiayi.domain.Beef;
import cn.edu.scau.cmi.zhangjiayi.domain.Meat;
import cn.edu.scau.cmi.zhangjiayi.domain.Pork;

public class MeatFactory {
	public static Meat getInstance(String MeatTypeString)
	{
		switch(MeatTypeString)
		{
			case("prok"): return new Pork();
			case("beef"): return new Beef();
		}
		return null;
	}
}
