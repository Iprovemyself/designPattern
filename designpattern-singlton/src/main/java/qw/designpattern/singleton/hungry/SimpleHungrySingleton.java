package qw.designpattern.singleton.hungry;

/**
 * @author qianwei
 * on 2019/6/10
 * 简单饿汉式单例
 * 直接对实例进行初始化
 * 然后私有化构造方法，并提供一个全局的访问点。
 */
public class SimpleHungrySingleton {
    private static final SimpleHungrySingleton INSTANCE = new SimpleHungrySingleton();

    private SimpleHungrySingleton(){
        //防止反射攻击
        if(INSTANCE != null){
            throw  new RuntimeException("不能创建多个实例");
        }
    }

    public static SimpleHungrySingleton getInstance(){
        return INSTANCE;
    }

}
