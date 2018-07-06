package cn.edu.scau.cmi.zhangjiayi.singleton;

public class Chairman {
	private static Chairman chairman;
	private String name;
	private Chairman() {
		this.name = "习近平";
	}
	public static Chairman getInstance() {
		if(chairman == null)
		{
			chairman = new Chairman();
		}
		return chairman;
	}
	public String getName() {
		return this.name;
	}
}
