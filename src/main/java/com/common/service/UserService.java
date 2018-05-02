package com.common.service;

import com.common.model.User;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public interface UserService {
	
	public User getByUsername(String username);

    public Set<String> getRoles(String username);

    public Set<String> getPermissions(String username);
}
