package cn.edu.scau.cmi.zhangjiayi.composite.transparent;

public class Person extends Component {

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("I am Preson's operation");
	}

	@Override
	public void add(Component child) {
		// TODO Auto-generated method stub
		System.out.println("sorry，不支持该方法！");
	}

	@Override
	public void del(Component child) {
		// TODO Auto-generated method stub
		System.out.println("sorry，不支持该方法！");
	}
	
}
