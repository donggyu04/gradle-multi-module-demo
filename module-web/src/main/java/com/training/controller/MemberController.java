package com.training.controller;

import com.training.entity.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @GetMapping("/")
    public Member getMember() {
        return new Member("lee");
    }
}
