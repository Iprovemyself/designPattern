package qw.designpattern.singleton.lazy;

/**
 * @author qianwei
 * on 2019/6/10
 * 双重锁懒汉式单例
 *
 */
public class DoubleCheckSingleton {
    private static DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton(){
        if(instance != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static DoubleCheckSingleton getInstance(){
        if(instance == null){
            //把同步放到方法里面，可以保证多线程访问时能进入方法
            synchronized (DoubleCheckSingleton.class){
                if(instance==null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
