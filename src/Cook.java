/**
 * @Author huanghe
 * @Date 2019/8/21 23:12
 * @Description: 大厨类：负责做虾
 */

class Cook {

    /**
     * 大蒜数量
     */
    private static final Integer GARLIC_NUM = 5;

    /**
     * 生姜数量
     */
    private static final Integer GINGER_NUM = 5;

    /**
     * 倒啤酒总次数
     */
    private static final Integer TOTAL_BEER_NUM = 5;


     Cook(String name) {
        System.out.println(name);
    }

    /**
     * 做虾
     */
    void beginDoShrimp() {
        oil();
        pourSeasoning();
        pourShrimps();
        fireShrimps();
        pourBeer();
        mengShrimps();
        eatShrimps();
    }

    /**
     * 倒油
     */
    void oil() {
        System.out.println("倒油");
    }

    /**
     * 加调料
     */
    private void pourSeasoning() {
        String str = String.format("倒调料,加%d个大蒜，加%d个生姜", GARLIC_NUM, GINGER_NUM);
        System.out.println(str);
    }

    /**
     * 倒虾
     */
    private void pourShrimps() {

        System.out.println("倒虾");
    }

    /**
     * 炒虾
     */
    private void fireShrimps() {

        System.out.println("炒虾");
    }

    /**
     * 倒啤酒
     */
    private void pourBeer() {
        for (int pourNum = 1; pourNum < TOTAL_BEER_NUM; pourNum++) {
            StringBuffer sb = new StringBuffer(String.format("第%d次倒啤酒", pourNum));
            sb.append("\n等一分钟");
            System.out.println(sb);
        }
    }

    /**
     * 焖虾
     */
    private void mengShrimps() {
        System.out.println("关火");
    }

    /**
     * 吃货吃虾
     */
    private void eatShrimps() {
        System.out.println("吃虾");
    }


}
