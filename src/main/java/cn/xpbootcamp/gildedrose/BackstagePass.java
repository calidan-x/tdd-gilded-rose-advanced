package cn.xpbootcamp.gildedrose;


/**
 * @author yin
 */
public class BackstagePass extends Product {

    public BackstagePass(int quality, int sellIn) {

        if (sellIn > 10) {
            this.quality = quality;
        } else if (sellIn <= 10 && sellIn > 5) {
            this.quality = quality + 2 * (10 - sellIn + 1);
        } else if (sellIn <= 5 && sellIn > 0) {
            this.quality = quality + 10 + 3 * (5 - sellIn + 1);
        } else {
            this.quality = 0;
        }
        this.sellIn = sellIn;
    }

}
