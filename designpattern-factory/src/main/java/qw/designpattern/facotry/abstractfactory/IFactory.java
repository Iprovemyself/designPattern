package qw.designpattern.facotry.abstractfactory;

import qw.designpattern.facotry.product.Computer;
import qw.designpattern.facotry.product.Pad;

/**
 * @author qianwei
 * on 2019/10/6
 * 抽象工厂
 */
public interface IFactory {

    /**
     * @return : qw.designpattern.facotry.product.Computer
     * @Description: 生产电脑
     * @author: qw
     * @date 2019/10/6 22:41
     * @version 1.0
     */
    Computer createComputer();

    /**
     * @return : qw.designpattern.facotry.product.Pad
     * @Description: 生产pad
     * @author: qw
     * @date 2019/10/6 22:41
     * @version 1.0
     */
    Pad createPad();
}
