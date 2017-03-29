package com.bijiawang.service.commands;

import com.bijiawang.service.Command;
import com.bijiawang.service.LogModel.ActionLogger;

/**
 * Created by disinuo on 17/3/26.
 */
public class BuyCommand implements Command {
//    private BuyService buyService;
    private int userId;
    private int goodsId;
    private static String id="service.commands.BuyCommand";
    public void execute() {
        //buyService.buy(userId,goodsId);
        log();
    }

    public void log() {
        ActionLogger.log(id);
    }
    public BuyCommand(int userId,int goodsId){
        //TODO 先随便定一个构造器。。
        this.userId=userId;
        this.goodsId=goodsId;
    }
}
