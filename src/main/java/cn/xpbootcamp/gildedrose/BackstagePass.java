package cn.xpbootcamp.gildedrose;

public class BackstagePass extends Product {

    public BackstagePass(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    public int getQuality() {
        int calcQuality = quality;
        int actualSellIn = getSellIn();
        if (actualSellIn >= 10) {
            calcQuality = quality + dayPass;
        } else if (actualSellIn < 10 && actualSellIn >= 5) {
            calcQuality = quality + Math.max(0, sellIn - 10) + 2 * Math.min(dayPass, (10 - actualSellIn));
        } else if (actualSellIn < 5 && actualSellIn >= 0) {
            calcQuality = quality + Math.max(0, sellIn - 10) + 2 * Math.max(Math.min(5, sellIn - 5), 0)
                    + 3 * Math.min(dayPass, 5 - actualSellIn);
        } else {
            calcQuality = 0;
        }
        return Math.min(calcQuality, 50);
    }

}
