package qw.designpattern.facotry.simplefactory;

import qw.designpattern.facotry.product.AsusComputer;
import qw.designpattern.facotry.product.Computer;

/**
 * @author qianwei
 * on 2019/10/6
 * 对简单工厂的理解：
 *      简单工厂一个工厂只能创建一类产品
 */
public class ComputerSimpleFactory {

    /**
     * @param clazz 传的类型限制
     * @return : qw.designpattern.facotry.product.Computer
     * @Description: 用简单工厂创建华硕电脑的实例
     * @author: qw
     * @date 2019/10/6 22:23
     * @version 1.0
     */
    public Computer create(Class clazz) {
        try {
            if (clazz != null) {
                return (Computer) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
