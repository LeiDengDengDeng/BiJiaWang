package com.bijiawang.service.commands;

import com.bijiawang.service.Command;
import com.bijiawang.service.commands.util.ResultMessage;
import com.model.GoodEntity;
import com.service.SearchService;
import com.service.ShieldService;
import com.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by disinuo on 17/4/13.
 */
public class SearchGoodsCommand extends Command {
//
    @Autowired
    private SearchService searchService;
    @Autowired
    private ShieldService shieldService;

    private String keyword;
    private List<GoodEntity> goodEntities;
    @Override
    protected ResultMessage doCommand(){
        //TODO 从同义词列表获取同义词
        String[] keywords=null;
        //将列表中的所有词交给analyse分析
        List<GoodEntity> goodEntities= searchService.analyse(keywords);

        //删除列表中的负面商品
        this.goodEntities=shieldService.shield(goodEntities);
        return null;
    }

    public SearchGoodsCommand(String keyword){
        this.keyword=keyword;
        args.put("keyword",keyword);
    }

    public List<GoodEntity> getGoodEntities() {
        return goodEntities;
    }


    @Override
    protected void initCommandId() {
        commandId="service.commands.SearchGoodsCommand";
    }
}
