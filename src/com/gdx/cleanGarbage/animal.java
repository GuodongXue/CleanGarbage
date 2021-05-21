package com.gdx.cleanGarbage;

public class animal {
    int age;
    public void sleep(){

    }
    protected void finalize()
        throws Throwable{
        System.out.println("been cleaned");
    }
}
