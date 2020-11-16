package com.fang.demo.strategy.impl;

import com.fang.demo.strategy.DoWrok;
import org.springframework.stereotype.Component;

/**
 * 更新工作
 */
@Component("updateWork")
public class UpdateWork implements DoWrok {

    @Override
    public String work(int number) {
        return "更新工作" + number;
    }
}
