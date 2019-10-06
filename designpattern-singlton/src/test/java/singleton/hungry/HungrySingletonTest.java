package singleton.hungry;

import qw.designpattern.singleton.hungry.SimpleHungrySingleton;

/**
 * @author qianwei
 * on 2019/6/10
 */
public class HungrySingletonTest {
    public static void main(String[] args) {
        SimpleHungrySingleton simpleSingleton = SimpleHungrySingleton.getInstance();
        Thread t = new Thread(()->{
            SimpleHungrySingleton singleton = SimpleHungrySingleton.getInstance();
        });
        t.start();
    }
}
