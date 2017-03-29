package com.bijiawang.service.LogModel;

/**
 * Created by disinuo on 17/3/29.
 */
public enum  ErrorCode {
    ERROR_CODE_100("网络异常",100);
    //TODO 先写一个例子





    private ErrorCode(String name,int code){
        this.name=name;
        this.code=code;
    }
    public String toName(){
        return this.name;
    }
    public int toCode(){return this.code;}
    private String name;
    private int code;
}
