package controller;

import service.SynonymsService;
import strategy.SortStrategy;
import model.GoodEntity;
import service.SearchService;
import service.ShieldService;
import service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
@Controller
@RequestMapping
public class SearchController {

    @Autowired
    private SearchService searchService;

    @Autowired
    private SortService sortService;

    @Autowired
    private ShieldService shieldService;

    @Autowired
    private SynonymsService synonymsService;

    @ResponseBody
    @RequestMapping(value="/search")
    public List<GoodEntity> searchGoods(String keyword,SortStrategy sortStrategy){
        //todo 从同义词列表获取同义词

        List<String> keywords=synonymsService.findSynonyms(keyword);

        //将列表中的所有词交给analyse分析
        List<GoodEntity> goodEntities= searchService.analyse(keywords);

        //删除列表中的负面商品
        goodEntities=shieldService.shield(goodEntities);


        if(sortStrategy==null){
            return goodEntities;
        }
        // 对搜索结果进行排序
        goodEntities = sortService.sort(goodEntities, sortStrategy);

        return goodEntities;

    }

}
