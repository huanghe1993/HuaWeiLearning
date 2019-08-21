/**
 * @Author huanghe
 * @Date 2019/8/21 23:06
 * @Description: 洗虾工：负责洗虾
 */
public class ShrimpWasher extends ShrimpWasherFather {

    private String name = "无名氏";

    /**
     * 初始化构造方法
     */
    ShrimpWasher(String name){
        super();
        this.name = name;
        System.out.println("一名新的洗虾工产生了！"+name+"开始洗虾.....");
    }

    void beginWashShrimp(){
        cutterShrimp();
        drawShrimpThread();
        washShrimp();
    }

     private void cutterShrimp(){

        System.out.println("剪虾头！");
    }

    private void drawShrimpThread(){
        System.out.println("抽虾线");
    }

    private void washShrimp() {
        System.out.println("洗虾完成！");
        System.out.println("=====================");
    }




}
