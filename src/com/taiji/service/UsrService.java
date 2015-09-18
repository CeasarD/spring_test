package com.taiji.service;
//用于操作user
import com.taiji.dao.UsrDao;
import com.taiji.dao.impl.UsrDaoImpl;
import com.taiji.model.User;
import com.taiji.spring1.BeanFactory;
import com.taiji.spring1.ClassPathApplicationContext;
public class UsrService {
	private UsrDao usrDao;

	public void setUsrDao(UsrDao ausrDao) {
		this.usrDao = ausrDao;
	}

	public UsrDao getUsrDao() {
		return usrDao;
	}
	public void add(User ausr) throws Exception{
		System.out.println(ausr+"user service done");
		this.usrDao.saveUsr(ausr);
	}
}
