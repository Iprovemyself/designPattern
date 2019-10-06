package qw.designpattern.facotry.abstractfactory;

import qw.designpattern.facotry.product.Computer;
import qw.designpattern.facotry.product.HpComputer;
import qw.designpattern.facotry.product.HpPad;
import qw.designpattern.facotry.product.Pad;

/**
 * @author qianwei
 * on 2019/10/6
 * 惠普工厂，生产惠普产品
 */
public class HpFactory implements IFactory {
    public Computer createComputer() {
        return new HpComputer();
    }

    public Pad createPad() {
        return new HpPad();
    }
}
