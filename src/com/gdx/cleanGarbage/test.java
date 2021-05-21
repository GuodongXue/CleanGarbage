package com.gdx.cleanGarbage;

public class test {
    public static void main(String[] args) {
        new animal();
        new animal();
        new animal();
        new animal();

        //告诉让帮我清理垃圾

        for(int i = 1; i<100;i++){
            Runtime.getRuntime().gc();
        }
    }
}
