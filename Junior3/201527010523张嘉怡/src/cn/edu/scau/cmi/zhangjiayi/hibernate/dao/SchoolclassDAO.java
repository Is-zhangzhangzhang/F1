package cn.edu.scau.cmi.zhangjiayi.hibernate.dao;

import java.util.List;
import java.util.Set;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.edu.scau.cmi.zhangjiayi.hibernate.domain.Schoolclass;

/**
 * A data access object (DAO) providing persistence and search support for
 * Schoolclass entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.edu.scau.cmi.zhangjiayi.hibernate.domain.Schoolclass
 * @author MyEclipse Persistence Tools
 */
public class SchoolclassDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(SchoolclassDAO.class);
	// property constants

	public void save(Schoolclass transientInstance) {
		log.debug("saving Schoolclass instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Schoolclass persistentInstance) {
		log.debug("deleting Schoolclass instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Schoolclass findById(java.lang.String id) {
		log.debug("getting Schoolclass instance with id: " + id);
		try {
			Schoolclass instance = (Schoolclass) getSession()
					.get("cn.edu.scau.cmi.zhangjiayi.hibrenate.domain.Schoolclass", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Schoolclass instance) {
		log.debug("finding Schoolclass instance by example");
		try {
			List results = getSession().createCriteria("cn.edu.scau.cmi.zhangjiayi.hibrenate.domain.Schoolclass")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Schoolclass instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Schoolclass as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Schoolclass instances");
		try {
			String queryString = "from Schoolclass";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Schoolclass merge(Schoolclass detachedInstance) {
		log.debug("merging Schoolclass instance");
		try {
			Schoolclass result = (Schoolclass) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Schoolclass instance) {
		log.debug("attaching dirty Schoolclass instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Schoolclass instance) {
		log.debug("attaching clean Schoolclass instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}