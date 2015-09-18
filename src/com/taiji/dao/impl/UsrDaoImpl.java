package com.taiji.dao.impl;

import com.taiji.dao.UsrDao;
import com.taiji.model.User;

public class UsrDaoImpl implements UsrDao{

	@Override
	public void saveUsr(User ausr) {
		// TODO Auto-generated method stub
		System.out.println(ausr+" saved");
	}

}
