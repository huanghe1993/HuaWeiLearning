/**
 * @Author huanghe
 * @Date 2019/8/21 23:05
 * @Description: 测试类
 */
public class Main {

    public static void main(String[] args) {
        ShrimpWasher shrimpWasher = new ShrimpWasher("洗虾工");
        shrimpWasher.beginWashShrimp();
        Cook cooker = new Cook("我是最地道的油焖大虾高手,开始做虾.....");
        cooker.beginDoShrimp();
    }

}
