package com.shrighanda.entity;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class  MemberRowMapper implements RowMapper<Member> {

	@Override
	public Member mapRow(ResultSet row, int rowNum) throws SQLException {
		Member user = new Member();
		user.setId(row.getInt("id"));
		user.setFirstname(row.getString("firstname"));
		user.setLastname(row.getString("lastname"));
		user.setEmail(row.getString("email"));
		user.setAddress(row.getString("address"));
		user.setTelephone(row.getString("telephone"));
		return user;
	}

}
