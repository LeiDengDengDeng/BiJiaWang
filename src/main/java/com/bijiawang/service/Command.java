package com.bijiawang.service;

import com.bijiawang.service.LogModel.ActionLogger;
import com.bijiawang.service.commands.util.ResultMessage;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by disinuo on 17/3/29.
 */
public class Command {
    protected String commandId;
    protected Map<String,Object> args=new HashMap<String,Object>();
    public ResultMessage execute(){
        ResultMessage msg;
        initCommandId();
        logBeforeCommand();
        msg=doCommand();
        logAfterCommand();
        return msg;
    }
    /**
     * 子类要重写！
     *子类要初始化自己的commandId！就是对应的service方法的全名
     */
    protected void initCommandId(){}

    /**
     * 子类要重写！
     * 子类调用各自的service对应的方法
     */
    protected ResultMessage doCommand(){

        return null;
    }


    private void logBeforeCommand(){
        ActionLogger.logBefore(this.commandId,args);
    }

    private void logAfterCommand(){
        ActionLogger.logAfter(commandId);

    }
}
