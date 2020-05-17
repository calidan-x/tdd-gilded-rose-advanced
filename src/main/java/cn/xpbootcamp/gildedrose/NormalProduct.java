package cn.xpbootcamp.gildedrose;

public class NormalProduct extends Product {

    public NormalProduct(int quality, int sellIn) {
        this.quality = Math.max(quality, Math.min(quality + sellIn, MAX_QUALITY));
        this.sellIn = sellIn;
    }

}
