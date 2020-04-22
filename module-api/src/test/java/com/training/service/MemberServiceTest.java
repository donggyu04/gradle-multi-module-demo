package com.training.service;

import com.training.entity.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Test
    public void save() {
        Member member = new Member("newMember");
        Long id = memberService.signUp(member);
        assertThat(id, is(1L));
    }
}