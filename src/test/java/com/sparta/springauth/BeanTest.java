package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    @Autowired
    @Qualifier("Pizza")
    Food food;

    @Autowired
    @Qualifier("Pizza")
    Food pizza;

    @Test
    @DisplayName("테스트")
    void test(){
        food.eat();
    }
}
