package com.ljj;

import com.ljj.animal.bird.Bird;
import com.ljj.animal.BrownKiwi;
import com.ljj.animal.bird.Swallow;

/**
 * 里氏替换原则
 */
public class PrincipleApp {
    public static void main(String[] args) {
        Bird bird1=new Swallow();
        Bird bird2=new BrownKiwi();
        bird1.setSpeed(120);
        bird2.setSpeed(120);
        System.out.println("如果飞行300公里：");
        try
        {
            System.out.println("燕子将飞行"+bird1.getFlyTime(300)+"小时.");
            System.out.println("几维鸟将飞行"+bird2.getFlyTime(300)+"小时。");
        }
        catch(Exception err)
        {
            System.out.println("发生错误了!");
        }
    }
}
