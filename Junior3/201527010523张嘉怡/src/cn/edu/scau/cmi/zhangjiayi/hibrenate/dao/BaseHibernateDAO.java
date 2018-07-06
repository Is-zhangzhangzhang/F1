package cn.edu.scau.cmi.zhangjiayi.hibrenate.dao;

import org.hibernate.Session;

import cn.edu.scau.cmi.zhangjiayi.hibrenate.HibernateSessionFactory;


/**
 * Data access object (DAO) for domain model
 * @author MyEclipse Persistence Tools
 */
public class BaseHibernateDAO implements IBaseHibernateDAO {
	
	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}
	
}