package com.codewithjaga.fullstackbackend.repository;

import com.codewithjaga.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>
{

}
