package cn.xpbootcamp.gildedrose;

abstract public class Product {

    public final int MAX_QUALITY = 50;
    /**
     * 商品距离过期的天数
     */
    protected int sellIn;
    /**
     * 代表商品的价值
     */
    protected int quality;

    public int getQuality() {
        return quality;
    }

}
