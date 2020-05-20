package cn.xpbootcamp.gildedrose;

public class AgedBrie extends AbstractProduct {

    public AgedBrie(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    public int getQuality() {
        int actualSellIn = getSellIn();
        int calcQuality = 0;
        if (sellIn > 0 && actualSellIn >= 0) {
            calcQuality = quality + dayPass;
        } else {
            calcQuality = quality + Math.max(sellIn, 0) + (Math.min(sellIn, 0) - actualSellIn) * 2;
        }
        return Math.min(calcQuality, MAX_QUALITY);
    }

}
