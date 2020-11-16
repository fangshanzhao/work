package com.fang.demo.strategy;

import com.fang.demo.strategy.impl.DeleteWork;
import com.fang.demo.strategy.impl.InsertWork;
import com.fang.demo.strategy.impl.UpdateWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * WorkHelp
 */
@Service
public class WorkHelp {
    private final Map<String, DoWrok> workMap = new ConcurrentHashMap<>();

    @Autowired
    public WorkHelp(Map<String, DoWrok> workMap){
        this.workMap.clear();
        workMap.forEach((k, v) -> this.workMap.put(k, v));
    }

    public String work(String str, int number){
        return workMap.get(str).work(number);
    }
}
