package service;
import model.GoodEntity;
import model.GoodshieldEntity;
import repository.GoodRepository;
import repository.GoodsheildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
@Service("shieldService")
@Transactional
public class ShieldServiceImpl implements ShieldService {

    @Autowired
    private GoodsheildRepository goodsheildRepository;

    @Autowired
    private GoodRepository goodRepository;
    @Override
    public List<GoodEntity> shield(List<GoodEntity> goodsEntity) {
        //获取屏蔽商品列表
        List<GoodEntity> shieldList=new ArrayList<>();
        List<GoodshieldEntity> shieldId=goodsheildRepository.findAll();
        for (GoodshieldEntity gse:shieldId){
            shieldList.add(goodRepository.findOne(gse.getGoodId()));
        }

        //删除负面商品
        for(GoodEntity goods:goodsEntity){
            if (shieldList.contains(goods)){
                goodsEntity.remove(goods);
            }

        }
        return goodsEntity;
    }
}
