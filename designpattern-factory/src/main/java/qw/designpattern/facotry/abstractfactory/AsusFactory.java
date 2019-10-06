package qw.designpattern.facotry.abstractfactory;

import qw.designpattern.facotry.product.AsusComputer;
import qw.designpattern.facotry.product.AsusPad;
import qw.designpattern.facotry.product.Computer;
import qw.designpattern.facotry.product.Pad;

/**
 * @author qianwei
 * on 2019/10/6
 * 华硕工厂，生产华硕产品
 */
public class AsusFactory implements IFactory {
    public Computer createComputer() {
        return new AsusComputer();
    }

    public Pad createPad() {
        return new AsusPad();
    }
}
