package forbidden;

/**
 * Created by user on 2017/4/12.
 */
public class TerForbiddenCheckImp implements ForbiddenCheckServ{

    WordStrategyServ wss;
    WordStrategyFactory wsf;

    public TerForbiddenCheckImp() {
        wsf = new DefaultWordStraFac();
        wss = wsf.getStrategy();
    }

    public TerForbiddenCheckImp(WordStrategyFactory w) {
        wsf = w;
        wss = wsf.getStrategy();
    }


    @Override
    public boolean grammarCheck(String ce) {

        return checkFor(ce);
    }

    private boolean checkFor(String s) {
        Iterable<String> it = wss.getForbiddenWords();

        for(String str : it) {
            if(s.contains(str)) {
                return true;
            }
        }

        return false;
    }
}
