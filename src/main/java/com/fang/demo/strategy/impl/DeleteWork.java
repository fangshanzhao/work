package com.fang.demo.strategy.impl;

import com.fang.demo.strategy.DoWrok;
import org.springframework.stereotype.Component;

/**
 * 删除工作
 */
@Component("deleteWork")
public class DeleteWork implements DoWrok {

    @Override
    public String work(int number) {
        return "删除工作" + number;
    }
}
