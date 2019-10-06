package designpattern.factory;

import qw.designpattern.facotry.abstractfactory.AsusFactory;
import qw.designpattern.facotry.abstractfactory.HpFactory;
import qw.designpattern.facotry.product.AsusComputer;
import qw.designpattern.facotry.product.AsusPad;
import qw.designpattern.facotry.product.HpComputer;
import qw.designpattern.facotry.product.HpPad;

/**
 * @author qianwei
 * on 2019/6/10
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        //抽象工厂的调用
        //创建具体产品族的工厂

        //创建惠普工厂
        HpFactory hpFactory = new HpFactory();
        //用惠普工厂创建惠普电脑
        HpComputer hpComputer = (HpComputer) hpFactory.createComputer();
        hpComputer.searchSource();
        //用惠普工厂创建惠普Pad
        HpPad hpPad = (HpPad) hpFactory.createPad();
        hpPad.watchMovie();

        //创建华硕工厂
        AsusFactory asusFactory = new AsusFactory();
        //用华硕工厂创建华硕电脑
        AsusComputer asusComputer = (AsusComputer) asusFactory.createComputer();
        asusComputer.searchSource();
        //用华硕工厂创建华硕Pad
        AsusPad asusPad = (AsusPad) asusFactory.createPad();
        asusPad.watchMovie();


    }
}
