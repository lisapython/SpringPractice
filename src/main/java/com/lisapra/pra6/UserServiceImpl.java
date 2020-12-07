package com.lisapra.pra6;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public void work() {
        System.out.println("开始干活...coding...");
    }
}
