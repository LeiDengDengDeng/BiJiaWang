package com.bijiawang.service.commands;

import com.Strategy.SortStrategy;
import com.bijiawang.service.Command;
import com.bijiawang.service.commands.util.ResultMessage;
import com.model.GoodEntity;
import com.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by disinuo on 17/3/26.
 */
public class SortGoodsCommand extends Command {
    @Autowired
    private SortService sortService;
    private List<GoodEntity> goodEntities;
    private SortStrategy sortStrategy;
    @Override
    protected ResultMessage doCommand(){
        this.goodEntities=sortService.sort(this.goodEntities,this.sortStrategy);
        return null;
    }

    public SortGoodsCommand(List<GoodEntity> goodEntities, SortStrategy sortStrategy){
        this.goodEntities=goodEntities;
        this.sortStrategy=sortStrategy;
        args.put("goodEntities",goodEntities);
        args.put("sortStrategy",sortStrategy);
    }

    public List<GoodEntity> getGoodEntities(){return goodEntities;}
    @Override
    protected void initCommandId() {
        commandId="service.commands.SortGoodsCommand";
    }
}
