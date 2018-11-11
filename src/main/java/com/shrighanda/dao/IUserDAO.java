package com.shrighanda.dao;

import com.shrighanda.entity.Member;

import java.util.List;

public interface IUserDAO {
   List<Member> getAllMembers();
   void addMember(Member member);
   boolean deleteMember(int member_id);
   void updateMember(Member member);
}
 