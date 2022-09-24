package com.example.springbootjenkins;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "spring.profiles.active:prod")
class SpringbootJenkinsApplicationTests {

    @Test
    void contextLoads() {
    }

}
