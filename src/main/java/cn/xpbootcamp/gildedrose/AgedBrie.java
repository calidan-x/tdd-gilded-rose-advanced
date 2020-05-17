package cn.xpbootcamp.gildedrose;

public class AgedBrie extends Product {

    public AgedBrie(int quality, int sellIn) {
        this.quality = Math.max(quality, Math.min(quality - sellIn, MAX_QUALITY));
        this.sellIn = sellIn;
    }

}
