package designpattern.factory;

import qw.designpattern.facotry.product.AsusComputer;
import qw.designpattern.facotry.product.HpComputer;
import qw.designpattern.facotry.simplefactory.ComputerSimpleFactory;

/**
 * @author qianwei
 * on 2019/6/5
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        ComputerSimpleFactory factory = new ComputerSimpleFactory();

        //用简单工厂创建华硕电脑并调用
        AsusComputer asusComputer = (AsusComputer) factory.create(AsusComputer.class);
        asusComputer.searchSource();

        //用简单工厂创建惠普电脑并调用
        HpComputer hpComputer = (HpComputer) factory.create(HpComputer.class);
        hpComputer.searchSource();

    }
}
