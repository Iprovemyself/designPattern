package designpattern.factory;

import qw.designpattern.facotry.factorymethod.AsusComputerFacotory;
import qw.designpattern.facotry.factorymethod.HpComputerFacotry;
import qw.designpattern.facotry.product.AsusComputer;
import qw.designpattern.facotry.product.HpComputer;

/**
 * @author qianwei
 * on 2019/6/5
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        //创建华硕电脑工厂
        AsusComputerFacotory asusComputerFacotory = new AsusComputerFacotory();
        //用华硕电脑工厂去创建华硕电脑
        AsusComputer asusComputer = (AsusComputer) asusComputerFacotory.create();
        asusComputer.searchSource();

        //创建惠普电脑工厂
        HpComputerFacotry hpComputerFacotry = new HpComputerFacotry();
        //用惠普电脑工厂创建惠普电脑
        HpComputer hpComputer = (HpComputer) hpComputerFacotry.create();
        hpComputer.searchSource();


    }
}
