package cn.edu.scau.cmi.zhangjiayi.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.scau.cmi.zhangjiayi.hibrenate.HibernateSessionFactory;
import cn.edu.scau.cmi.zhangjiayi.hibrenate.domain.Student;

public class HibrenateClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		//Transaction transaction = session.beginTransaction();
		Student std = session.get(Student.class, "201527010523");
		System.out.println(std.getName());
	}

}
