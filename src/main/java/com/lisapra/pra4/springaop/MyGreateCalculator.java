package com.lisapra.pra4.springaop;

import org.springframework.stereotype.Service;

@Service
public class MyGreateCalculator {

    public int multTwo(int i) {
        int result = i << 1;
        return result;
    }
}
