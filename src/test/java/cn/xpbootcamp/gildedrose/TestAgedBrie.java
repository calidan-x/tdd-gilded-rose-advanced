package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class TestAgedBrie {

    public void assertSellInAndQuality(Product product, int sellIn, int quality) {
        Assert.assertEquals(sellIn, product.getSellIn());
        Assert.assertEquals(quality, product.getQuality());
    }

    public AgedBrie buildAgedBrie(int sellIn, int quality, int dayPass) {
        AgedBrie agedBrie = new AgedBrie(sellIn, quality);
        agedBrie.passDay(dayPass);
        return agedBrie;
    }

    @Test
    public void test_agedbrie_pass_sellin2_quality0_daypass1() {
        AgedBrie agedBrie = buildAgedBrie(2, 0, 1);
        assertSellInAndQuality(agedBrie, 1, 1);
    }

    @Test
    public void test_agedbrie_pass_sellin2_quality49_daypass1() {
        AgedBrie agedBrie = buildAgedBrie(2, 49, 1);
        assertSellInAndQuality(agedBrie, 1, 50);
    }

    @Test
    public void test_agedbrie_pass_sellin2_quality50_daypass1() {
        AgedBrie agedBrie = buildAgedBrie(2, 50, 1);
        assertSellInAndQuality(agedBrie, 1, 50);
    }

    @Test
    public void test_agedbrie_pass_sellin0_quality20_daypass1() {
        AgedBrie agedBrie = buildAgedBrie(0, 20, 1);
        assertSellInAndQuality(agedBrie, -1, 22);
    }

    @Test
    public void test_agedbrie_pass_sellinm1_quality20_daypass1() {
        AgedBrie agedBrie = buildAgedBrie(-1, 20, 1);
        assertSellInAndQuality(agedBrie, -2, 22);
    }
}
