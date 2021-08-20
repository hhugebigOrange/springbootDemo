package com.wt.demo.designpattern.singleton;
/**
 *  双重校验 单例模式
 */
public class SingleTon {

    //添加volatile，确保原子性，防止指令重排
    private static volatile SingleTon singleTon;

    //私有化构造方法，防止其他类调用构造方法，生成新的对象
    private SingleTon() {
    }

    public static SingleTon getInstance(){
        if (singleTon==null){
            synchronized (SingleTon.class){
                if (singleTon==null){
                    singleTon=new SingleTon();
                }
            }
        }
        return singleTon;
    }


}
