package qw.designpattern.singleton.hungry;

/**
 * @author qianwei
 * on 2019/6/10
 * 饿汉式单例写法2
 * 将对实例的初始化放在静态块中
 */
public class StaticHungrySingleton {
    private static StaticHungrySingleton instance;

    private StaticHungrySingleton(){
        if(instance != null){
            throw  new RuntimeException("无法创建多个实例");
        }
    }

    static{
        instance = new StaticHungrySingleton();
    }

    public StaticHungrySingleton getInstance(){
        return instance;
    }
}
