package cn.xpbootcamp.gildedrose;

public class NormalProduct extends AbstractProduct {

    public NormalProduct(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    public int getQuality() {
        if (sellIn - dayPass < 0) {
            return quality - Math.max(0, sellIn) - (dayPass - Math.max(0, sellIn)) * 2;
        }
        return Math.max(quality - dayPass, MIN_QUALITY);
    }

}
