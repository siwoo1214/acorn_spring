package com.acorn.prac;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerRepository {
	
	@Autowired
	SqlSession session;
	
	//전체 조회
	public List<Player> selectAll(){
		return session.selectList("player.a");
	}
}
