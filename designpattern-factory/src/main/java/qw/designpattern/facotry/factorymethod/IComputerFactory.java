package qw.designpattern.facotry.factorymethod;

import qw.designpattern.facotry.product.Computer;

/**
 * @author qianwei
 * on 2019/10/6
 * 工厂方法模式
 * 创建一个工厂的接口，定义一个创建对象的方法，由实现的类去创建具体类型的对象
 */
public interface IComputerFactory {
    Computer create();
}
