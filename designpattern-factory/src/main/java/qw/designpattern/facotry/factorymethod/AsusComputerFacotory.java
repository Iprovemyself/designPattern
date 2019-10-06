package qw.designpattern.facotry.factorymethod;

import qw.designpattern.facotry.product.AsusComputer;
import qw.designpattern.facotry.product.Computer;

/**
 * @author qianwei
 * on 2019/10/6
 */
public class AsusComputerFacotory implements IComputerFactory {
    public Computer create() {
        return new AsusComputer();
    }
}
