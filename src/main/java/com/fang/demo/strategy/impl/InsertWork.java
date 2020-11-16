package com.fang.demo.strategy.impl;

import com.fang.demo.strategy.DoWrok;
import org.springframework.stereotype.Component;

/**
 * 新增工作
 */
@Component("insertWork")
public class InsertWork implements DoWrok {

    @Override
    public String work(int number) {
        return "新增工作" + number;
    }
}
