package cn.edu.scau.cmi.zhangjiayi.factory;

import cn.edu.scau.cmi.zhangjiayi.domain.Beef;
import cn.edu.scau.cmi.zhangjiayi.domain.Meat;

public class BeefFactory implements Meat {
	public Beef createBeef(){
		return new Beef();
	}
}
