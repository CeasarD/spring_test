package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.taiji.model.User;
import com.taiji.service.UsrService;
import com.taiji.spring1.BeanFactory;
import com.taiji.spring1.ClassPathApplicationContext;

public class UsrServiceTest {

	@Test
	public void testAdd() throws Exception {
		//fail("Not yet implemented");
		BeanFactory f = new ClassPathApplicationContext();
		UsrService s = (UsrService)f.getBean("service");
		User u = new User();
		s.add(u);
	}

}
