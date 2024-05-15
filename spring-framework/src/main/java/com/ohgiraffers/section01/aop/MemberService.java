package com.ohgiraffers.section01.aop;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MemberService {

    private final MemberDAO memberDAO;

    // 생산자 의존성 주입
    public MemberService(MemberDAO memberDAO) { this.memberDAO = memberDAO; }

    // 전체 멤버 호출
    public Map<Long, MemberDTO> selectMembers() {
        System.out.println("selectMembers 메소드 실행");
        return memberDAO.selectMembers();
    }

    // 특정 id 멤버 호출
    public MemberDTO selectMember(Long id) {
        System.out.println("selectMember 메소드 실행");
        return memberDAO.selectMember(id);
    }





}
