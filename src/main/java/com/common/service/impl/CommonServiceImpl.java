package com.common.service.impl;

import com.common.service.CommonService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


@Repository
public class CommonServiceImpl implements CommonService {

	@Resource
	private JdbcTemplate jdbcTemplate;

	@Override
	public void text() {
		
	}

}
