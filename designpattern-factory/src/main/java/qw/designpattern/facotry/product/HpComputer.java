package qw.designpattern.facotry.product;

/**
 * @author qianwei
 * on 2019/10/6
 * 惠普电脑
 */
public class HpComputer extends Computer {
    @Override
    public void searchSource() {
        System.out.println("用惠普电脑查找资料");
    }
}
