package funda.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;

import funda.northwind.business.abstracts.UserService;
import funda.northwind.core.dataAccess.UserDao;
import funda.northwind.core.utilities.entities.User;
import funda.northwind.core.utilities.results.DataResult;
import funda.northwind.core.utilities.results.Result;
import funda.northwind.core.utilities.results.SuccessDataResult;
import funda.northwind.core.utilities.results.SuccessResult;

public class UserManager implements UserService {

	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
	this.userDao.save(user);
	return new SuccessResult("KUllanıcı Eklendi");
	}

	@Override
	public DataResult<User> findByEmail(String email) {

		return new SuccessDataResult<User>(this.userDao.findByEmail(email), "Kullanıcı Bulundu");
	}

}
