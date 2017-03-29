package com.example.Repository;

import com.example.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by seungki on 2017-03-29.
 */
public interface MemberRepository  extends JpaRepository<Member, Integer> {
}
