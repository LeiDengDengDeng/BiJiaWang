package bijiawang.service.commands;

import bijiawang.service.Command;
import bijiawang.service.commands.util.ResultMessage;
import model.GoodEntity;
import service.SearchService;
import service.ShieldService;
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
       List<String> keywords=null;
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
