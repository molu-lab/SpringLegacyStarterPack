package com.common.home.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommonDAOImpl implements CommonDAO{
	
	@Autowired
	private SqlSession sqlSession;	
	private static final String mapperNamespace = "com.common.home.mapper.CommonMapper";
	
	@Override
	public String getTimestamp() {
		String methodNamespace = String.join(".", new String[]{mapperNamespace, new Object(){}.getClass().getEnclosingMethod().getName()});
		return sqlSession.selectOne(methodNamespace); 
	}

}
