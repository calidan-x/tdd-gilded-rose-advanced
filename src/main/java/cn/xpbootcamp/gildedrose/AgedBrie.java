package cn.xpbootcamp.gildedrose;


/**
 * @author yin
 */
public class AgedBrie extends Product {

    public AgedBrie(int quality, int sellIn) {
        this.quality = Math.max(quality, Math.min(quality - sellIn, MAX_QUALITY));
        this.sellIn = sellIn;
    }

}
