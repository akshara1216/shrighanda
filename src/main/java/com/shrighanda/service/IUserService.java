package com.shrighanda.service;



import com.shrighanda.entity.Member;

import java.util.List;

public interface IUserService {
        List<Member> getAllmembers();
        void addMember(Member member);
        void updateMember(Member member);
        boolean deleteMember(int memeber_id);
}