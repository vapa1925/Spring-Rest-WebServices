package com.pavan.springrestwebservices.userDao;

import com.pavan.springrestwebservices.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userrepository extends JpaRepository<user,Integer> {
}
