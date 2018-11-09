package com.glqdlt.ex.zuuledge;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    public User findByUserId(String id);
}
