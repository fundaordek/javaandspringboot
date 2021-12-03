package funda.northwind.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import funda.northwind.core.utilities.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {

	User findByEmail(String email);
}
