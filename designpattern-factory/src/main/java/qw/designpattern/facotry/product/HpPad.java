package qw.designpattern.facotry.product;

/**
 * @author qianwei
 * on 2019/10/6
 * 惠普的pad
 */
public class HpPad extends Pad {

    @Override
    public void watchMovie() {
        System.out.println("用惠普的Pad看电影");
    }
}
