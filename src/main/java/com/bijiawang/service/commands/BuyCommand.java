package com.bijiawang.service.commands;

import com.bijiawang.service.Command;
import com.bijiawang.service.LogModel.ActionLogger;
import com.bijiawang.service.commands.util.ResultMessage;

import java.util.Map;

/**
 * Created by disinuo on 17/3/26.
 */
public class BuyCommand extends Command {
//    private BuyService buyService;
    private int userId;
    private int goodsId;

    private static String id="service.commands.BuyCommand";
    @Override
    protected ResultMessage doCommand(){
//        return buyService.XXX(userId,goodsId);
//        TODO
        return null;
    }

    public BuyCommand(int userId,int goodsId){
        //TODO 先随便定一个构造器。。
        this.userId=userId;
        this.goodsId=goodsId;
        args.put("userId",userId);
        args.put("goodsId",goodsId);
    }

}
