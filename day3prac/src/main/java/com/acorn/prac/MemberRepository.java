package com.acorn.prac;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {
	
	@Autowired
	SqlSession session;
	
	// 전체조회
	public List<Member> selectAll(){
		return session.selectList("a.selectAll");  //mapper정보, 실행될 sql의 id 주면 된다 ("namespace,실행할 sql의 id")
	}
	
	public List<Map<String,Object>> selectAll2(){
		return session.selectList("a.selectAll2");  //mapper정보, 실행될 sql의 id 주면 된다 ("namespace,실행할 sql의 id")
	}
	
	public Member selectOne(String id) {
		return session.selectOne("a.selectOne",id);
	}
	
	public int insert(Member member) {
		int result=session.insert("a.insert",member);
		return result;
	}
	
	public int update(Member m) {
		int result=session.update("a.update",m);
		return result;
	}
	
	public int deleteOne(String id) {
		return session.delete("a.delete",id);
	}
	
	public int deleteAll() {
		return session.delete("a.deleteAll");
	}
	
}
