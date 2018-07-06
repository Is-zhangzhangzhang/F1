package cn.edu.scau.cmi.zhangjiayi.composite.transparent;

public abstract class Component {
	public abstract void operation();
	public abstract void add(Component child);
	public abstract void del(Component child);
}
