package qw.designpattern.facotry.product;

/**
 * @author qianwei
 * on 2019/10/6
 * 华硕电脑
 */
public class AsusComputer extends Computer {
    @Override
    public void searchSource() {
        System.out.println("用华硕电脑查找资料");
    }
}
