package com.sparta.springauth.food;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Pizza") //같은 타입의 빈이 여러개일 때 주입받을 빈을 지정
public class Pizza implements Food {
    @Override
    public void eat() {
        System.out.println("피자를 먹습니다.");
    }
}