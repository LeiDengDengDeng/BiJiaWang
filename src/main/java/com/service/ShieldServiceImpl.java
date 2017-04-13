package com.service;

import com.model.GoodEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
@Service("shiledService")
@Transactional
public class ShieldServiceImpl implements ShieldService {

    @Override
    public List<GoodEntity> shield(List<GoodEntity> goodsEntity) {
        //todo 获取屏蔽商品列表
        List<GoodEntity> shieldList=null;

        //删除负面商品
        for(GoodEntity goods:goodsEntity){
            if (shieldList.contains(goods)){
                goodsEntity.remove(goods);
            }

        }
        return goodsEntity;
    }
}
