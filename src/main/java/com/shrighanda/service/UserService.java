package com.shrighanda.service;

import com.shrighanda.entity.Member;
import com.shrighanda.dao.IUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
	@Autowired
	private IUserDAO userDAO;

	@Override
	public List<Member> getAllmembers() {

		return userDAO.getAllMembers();
	}

	@Override
	public void addMember(Member member) {
	    userDAO.addMember(member);

	}

	@Override
	public void updateMember(Member member) {
	    userDAO.updateMember(member);

	}

	@Override
	public boolean deleteMember(int memeber_id) {
	    userDAO.deleteMember(memeber_id);
		return true;
	}
}

