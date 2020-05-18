package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class TestSulfuras {

    public void assertSellInAndQuality(Product product, int sellIn, int quality) {
        Assert.assertEquals(sellIn, product.getSellIn());
        Assert.assertEquals(quality, product.getQuality());
    }

    public Sulfuras buildSulfuras(int sellIn, int quality, int dayPass) {
        Sulfuras sulfuras = new Sulfuras(sellIn, quality);
        sulfuras.passDay(dayPass);
        return sulfuras;
    }

    @Test
    public void test_sulfuras_pass_sellin0_quality45_daypass1() {
        Sulfuras sulfuras = buildSulfuras(0, 45, 1);
        assertSellInAndQuality(sulfuras, 0, 45);
    }

    @Test
    public void test_sulfuras_pass_sellinm1_quality45_daypass1() {
        Sulfuras sulfuras = buildSulfuras(-1, 45, 1);
        assertSellInAndQuality(sulfuras, -1, 45);
    }

    @Test
    public void test_sulfuras_pass_sellinm1_quality50_daypass1() {
        Sulfuras sulfuras = buildSulfuras(-1, 50, 1);
        assertSellInAndQuality(sulfuras, -1, 50);
    }

    @Test
    public void test_sulfuras_pass_sellinm1_quality1_daypass1() {
        Sulfuras sulfuras = buildSulfuras(-1, 1, 1);
        assertSellInAndQuality(sulfuras, -1, 1);
    }

    @Test
    public void test_sulfuras_pass_sellinm2_quality1_daypass1() {
        Sulfuras sulfuras = buildSulfuras(-2, 1, 1);
        assertSellInAndQuality(sulfuras, -2, 1);
    }

}
