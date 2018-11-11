package com.shrighanda.dao;


import com.shrighanda.entity.Member;
import com.shrighanda.entity.MemberRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class UserDAO implements IUserDAO {
	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public List<Member> getAllMembers() {
		String sql = "SELECT * FROM contact";
		//RowMapper<Member> rowMapper = new BeanPropertyRowMapper<Member>(member.class);
		RowMapper<Member> rowMapper = new MemberRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);

	}

	@Override
	public void addMember(Member member) {
		String sql = "INSERT INTO contact (firstname,lastname, email, address, telephone)"
				+ " VALUES (?,?, ?, ?, ?)";
		jdbcTemplate.update(sql,member.getFirstname(),member.getLastname(),member.getEmail(),
				member.getAddress(),member.getTelephone());

	}

	@Override
	public boolean deleteMember(int member_id) {
		String sql = "DELETE FROM contact WHERE id=?";
		jdbcTemplate.update(sql, member_id);
		return true;
	}

	@Override
	public void updateMember(Member member) {
		String sql = "UPDATE contact SET firstname=?,lastname=?, email=?, address=?, "
				+ "telephone=? WHERE id=?";
		jdbcTemplate.update(sql, member.getFirstname(),member.getLastname(),
				member.getEmail(),member.getAddress(),member.getTelephone(),member.getId());

	}
}
