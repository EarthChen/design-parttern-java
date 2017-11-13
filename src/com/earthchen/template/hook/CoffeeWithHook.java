package com.earthchen.template.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {


    @Override
    void brew() {
        System.out.println("dripping coffee through filter");

    }

    @Override
    void addCondiments() {
        System.out.println("adding sugar and milk");
    }

    /**
     * 覆盖钩子方法
     *
     * 根据用户输入来决定是否需要
     * @return
     */
    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    /**
     * 获取用户输入的问题答案
     *
     * 咖啡是否需要加糖和牛奶
     * @return
     */
    private String getUserInput() {
        String answer=null;
        System.out.println("是否需要加糖和牛奶(y/n)");
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        try {
            answer=in.readLine();
        }catch (IOException e){
            System.out.println("io错误");
        }
        if (answer==null) {
            return "no";
        }
        return answer;
    }
}
