package com.repository;

import com.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoJPARepo  extends JpaRepository<UserInfo , Long> {
}
