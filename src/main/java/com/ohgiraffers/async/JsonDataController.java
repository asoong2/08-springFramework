package com.ohgiraffers.async;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

public class JsonDataController {

    @GetMapping("/json-data")
    public String showJsonData() {

        return "async/json-data";
    }

    /* @RequestBody : 요청 바디에 담긴 데이터를 java 객체에 매핑 할 때 사용하는 어노테이션
    * Spring boot web 에는 Jackson-databind 라이브러리가 기본 포함 되어 JSON => Java Object parsing이 자동으로 처리 된다.
    * 1. String
    * {"nickname":"홍길동","age":"20","email":"hong@naver.com","registDate":"2023-01-01"}
    * 2. Map
    * {nickname=홍길동,age=20,email=hong@naver.com,registDate=2023-01-01"}
    * 3. UserDTO*/

    @GetMapping("/jquery/json")
    public @ResponseBody String jqueryJsonTest(@RequestBody UserDTO requestBody) {

        System.out.println("requestBody : " + requestBody);

        return "success";
    }

}
