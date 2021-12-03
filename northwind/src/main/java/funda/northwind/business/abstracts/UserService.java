package funda.northwind.business.abstracts;

import funda.northwind.core.utilities.entities.User;
import funda.northwind.core.utilities.results.DataResult;
import funda.northwind.core.utilities.results.Result;

public interface UserService {
	Result add(User user);

	DataResult<User> findByEmail(String email);
}
