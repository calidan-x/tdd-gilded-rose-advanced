package cn.xpbootcamp.gildedrose;

import org.junit.Assert;

public class TestBase {

    public void assertSellInAndQuality(AbstractProduct product, int sellIn, int quality) {
        Assert.assertEquals(sellIn, product.getSellIn());
        Assert.assertEquals(quality, product.getQuality());
    }

}