package com.sparta.springauth.food;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //같은 타입의 빈이 여러개일 때 우선적으로 주입받을 빈을 지정
public class Chicken implements Food {
    @Override
    public void eat() {
        System.out.println("치킨을 먹습니다.");
    }
}