package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.lang.reflect.Member;

public class Application {
    public static void main(String[] args) {

        /* GenericXmlApplicationContext 클래스를 사용하여 ApplicationContext를 생성한다.
        * 생성자에 XML 설정 메타 정보를 인자로 전달한다. */
        ApplicationContext context
                = new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");
        // IoC 컨테이너에 설정 메타 정보를 전달했다.

        /* 1. bean id를 이용해서 bean을 가져오는 방법 */
        // 직접 new MemberDTO 하지 않았다는 게 핵심이다.
//        MemberDTO member = (MemberDTO) context.getBean("member");

        /* 2. bean의 클래스 메타 정보를 전달하여 가져오는 방법 */
        // 타입을 명시한 것이기 때문에 다운캐스팅이 필요하지 않다.
//        MemberDTO member = context.getBean(MemberDTO.class);

        /* 3. bean의 id와 클래스 메타 정보를 전달하여 가져오는 방법 */
        MemberDTO member = context.getBean("member", MemberDTO.class);
        System.out.println(member);

    }
}
