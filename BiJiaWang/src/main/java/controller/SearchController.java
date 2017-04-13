package controller;

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

    @ResponseBody
    @RequestMapping(value="/search",method = RequestMethod.POST)
    public List<GoodEntity> searchGoods(String keyword){
        //todo 从同义词列表获取同义词
        String[] keywords=null;

        //将列表中的所有词交给analyse分析
        List<GoodEntity> goodEntities= searchService.analyse(keywords);

        //删除列表中的负面商品
        goodEntities=shieldService.shield(goodEntities);

        return goodEntities;

    }
    @ResponseBody
    @RequestMapping(value="/sort",method = RequestMethod.POST)
    public List<GoodEntity> sortGoods(List<GoodEntity> goodEntities,SortStrategy sortStrategy) {
        //将搜索获得的商品进行排序
        goodEntities = sortService.sort(goodEntities, sortStrategy);

        return goodEntities;

    }

}
