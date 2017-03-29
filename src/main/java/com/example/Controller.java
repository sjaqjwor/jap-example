package com.example;

import com.example.Repository.MemberRepository;
import com.example.Repository.StudentRepository;
import com.example.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by seungki on 2017-03-23.
 */
@RestController
@RequestMapping("hi")
public class Controller
{
    @Autowired
    StudentRepository userRepository;
    @Autowired
    TeamRepository teamRepository;
    @Autowired
    MemberRepository memberRepository;

    @RequestMapping("/list")
    public List<Student> list(){
        return userRepository.findAll();
    }

    @RequestMapping("/make")
    public List<Member> list_(){

        Team team = new Team();
        team.setName("삼성");
        team.setId("1");
        teamRepository.save(team);
        Member member = new Member();
        member.setCity("서울");
        member.setName("이승기");
        member.setTeam(team);
        member.setStreet("성동구");
        member.setZipcode("코드");
        member.setOrders(null);
        memberRepository.save(member);
        return memberRepository.findAll();
    }

}
