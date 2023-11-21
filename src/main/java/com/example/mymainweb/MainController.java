package com.example.mymainweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String showPreMain() {


        return "pre_main"; // Thymeleaf 템플릿의 파일명 (확장자 제외)을 반환합니다.

    }
}