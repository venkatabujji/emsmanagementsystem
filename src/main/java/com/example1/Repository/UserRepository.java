package com.example1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example1.Model.User;




@Repository
public interface UserRepository extends JpaRepository<User,Integer>
{
    User findByUserNameAndPassword(String userName, String password);
}
