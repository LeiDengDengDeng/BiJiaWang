package com.monitor;

/**
 * Created by caosh on 2017/4/12.
 */
public class DataException implements SolveException{

    DataRestore dataRestore = new concreteDataRestore();

    public void solve(){
        dataRestore.restoreData();
    }
}
