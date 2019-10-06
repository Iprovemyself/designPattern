package qw.designpattern.singleton.lazy;

/**
 * @author qianwei
 * on 2019/6/11
 * 内部类懒汉式单例
 */
public class InnerClassSingleton {

    private InnerClassSingleton(){
        if(LazySingletonHolder.INSTANCE != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static InnerClassSingleton getInstance(){
        return LazySingletonHolder.INSTANCE;
    }

    private static class LazySingletonHolder{
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

}
