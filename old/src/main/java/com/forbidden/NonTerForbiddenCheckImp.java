package com.forbidden;

/**
 * Created by user on 2017/4/12.
 */
public class NonTerForbiddenCheckImp implements ForbiddenCheckServ {

    ForbiddenCheckServ next;

    public NonTerForbiddenCheckImp(ForbiddenCheckServ f) {
        next = f;
    }

    @Override
    public boolean grammarCheck(String ce) {

        return checkFor(ce) || next.grammarCheck(ce);
    }


    private boolean checkFor(String s) {
        return false;
    }
}
