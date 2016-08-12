package com.chandra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandra.model.Logins;

public interface LoginRepository extends JpaRepository<Logins,Long>{

}
