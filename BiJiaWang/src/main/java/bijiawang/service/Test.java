package bijiawang.service;

/**
 * Created by deng on 2017/3/7.
 */
public class Test {
    private static int id=90;
    static {
        id=1000;
    }
    public static int getId(){return id;}
    public static void main(String[] args){
        int id=Test.getId();
        System.out.print(id);
    }
}
