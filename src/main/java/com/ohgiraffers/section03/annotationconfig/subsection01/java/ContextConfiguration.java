package com.ohgiraffers.section03.annotationconfig.subsection01.java;

import com.ohgiraffers.common.MemberDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration("configurationSection03")
/* 1. Test1 */
//@ComponentScan(basePackages = "com.ohgiraffers")
/* 2. Test2 - excludeFilters */
// 스캐닝 옵션 - 제거
//@ComponentScan(basePackages ="com.ohgiraffers",
//               excludeFilters = {
//                    @ComponentScan.Filter(
//                            /* 1. 타입으로 설정 */
//                            // type = FilterType.ASSIGNABLE_TYPE, classes = { MemberDAO.class }
//                            /* 2. 어노테이션 종류로 설정 - ex)컴포넌트 타입을 스캔하지 않겠다.*/
//                            // type = FilterType.ANNOTATION, classes = { org.springframework.stereotype.Component.class }
//                            /* 3. 표현식으로 설정 */
//                             type = FilterType.REGEX, pattern = {"com.ohgiraffers.section03.annotationconfig.subsection01.java.*"}
//                    )
//               })
/* 3. Test3 - includeFilters */
@ComponentScan(
        basePackages = "com.ohgiraffers",
        useDefaultFilters = false, // 자동 컴포넌트 스캔 off
        includeFilters = {
                /* excludeFilters에서 설정하는 방식과 동일하다. */
                @ComponentScan.Filter( // 아래 조건에 맞는 것만 스캔
                        type = FilterType.ASSIGNABLE_TYPE, classes = { MemberDAO.class }
                )
        }
)
public class ContextConfiguration {
}
