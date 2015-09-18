package com.taiji.dao;
//用于连接数据库，屏蔽数据库操作
import com.taiji.model.User;
public interface UsrDao {
	public void saveUsr(User ausr);
}
