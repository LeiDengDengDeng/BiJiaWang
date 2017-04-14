package com.forbidden;

/**
 * Created by user on 2017/4/12.
 */
public class DefaultWordStraFac implements WordStrategyFactory {
    @Override
    public WordStrategyServ getStrategy() {
        return new DefaultWordStrategyImp();
    }
}
