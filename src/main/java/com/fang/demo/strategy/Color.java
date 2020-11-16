package com.fang.demo.strategy;

/**
 * color类
 * @author Administrator
 */
public enum Color {
    /**
     * RED
     */
    RED("insertWork"),

    /**
     * BLUE
     */
    BLUE("updateWork"),

    /**
     * YELLOW
     */
    YELLOW("deleteWork");

    /**
     * code
     */
    private String code;

    /**
     * 创建enum
     * @param code
     */
    private Color(String code){
        this.code = code;
    }

    /**
     * 获取code
     * @return code
     */
    public String getCode() {
        return code;
    }
}
