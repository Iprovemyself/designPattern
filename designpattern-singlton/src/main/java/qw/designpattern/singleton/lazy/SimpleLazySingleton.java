package qw.designpattern.singleton.lazy;

/**
 * @author qianwei
 * on 2019/6/10
 */
public class SimpleLazySingleton {
    private static SimpleLazySingleton instance = null;

    private SimpleLazySingleton(){
      if(instance != null){
          throw new RuntimeException("不允许创建多个实例");
      }
    }

    /**
     * 懒汉式单例，在调用时，如果没有初始化，再赋值。
     * 需要注意线程安全问题。
     * 但是如果在方法上直接加上synchronize关键字的话，就不能同时访问getInstance方法
     * @return
     */
    public static synchronized SimpleLazySingleton getInstance(){
        if(instance == null){
            instance = new SimpleLazySingleton();
        }
        return instance;
    }


}
