package cn.xpbootcamp.gildedrose;

public class Sulfuras extends AbstractProduct {
    public Sulfuras(int sellIn, int quality) {
        super(sellIn, quality);
    }

    @Override
    public int getSellIn() {
        return this.sellIn;
    }

    @Override
    public int getQuality() {
        return quality;
    }
}
