package qw.designpattern.facotry.factorymethod;

import qw.designpattern.facotry.product.Computer;
import qw.designpattern.facotry.product.HpComputer;

/**
 * @author qianwei
 * on 2019/10/6
 */
public class HpComputerFacotry implements IComputerFactory {
    public Computer create() {
        return new HpComputer();
    }
}
