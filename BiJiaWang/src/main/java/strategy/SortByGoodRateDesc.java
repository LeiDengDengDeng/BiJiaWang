package strategy;

import java.util.Collections;
import java.util.List;

/**
 * Created by liying on 2017/4/11.
 */
public class SortByGoodRateDesc<GoodEntity> implements SortStrategy<GoodEntity> {

    @Override
    public List<GoodEntity> sort(List<GoodEntity> list) {
        list.sort(new GoodRateComparator());
        Collections.reverse(list);
        return list;
    }
}
