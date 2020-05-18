package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class TestNormalProduct {

    public void assertSellInAndQuality(Product product, int sellIn, int quality) {
        Assert.assertEquals(sellIn, product.getSellIn());
        Assert.assertEquals(quality, product.getQuality());
    }

    public NormalProduct buildNormalProduct(int sellIn, int quality, int dayPass) {
        NormalProduct normalProduct = new NormalProduct(sellIn, quality);
        normalProduct.passDay(dayPass);
        return normalProduct;
    }

    @Test
    public void test_normal_product_sellin10_quality29_daypass1() {
        NormalProduct normalProduct = buildNormalProduct(10, 20, 1);
        assertSellInAndQuality(normalProduct, 9, 19);
    }

    @Test
    public void test_normal_product_sellin2_quality0_daypass1() {
        NormalProduct normalProduct = buildNormalProduct(2, 0, 1);
        assertSellInAndQuality(normalProduct, 1, 0);
    }

    @Test
    public void test_normal_product_sellin3_quality6_daypass1() {
        NormalProduct normalProduct = buildNormalProduct(3, 6, 1);
        assertSellInAndQuality(normalProduct, 2, 5);
    }

    @Test
    public void test_normal_product_sellin3_quality51_daypass1() {
        NormalProduct normalProduct = buildNormalProduct(3, 51, 1);
        assertSellInAndQuality(normalProduct, 2, 50);
    }

    @Test
    public void test_normal_product_sellin0_quality6_daypass1() {
        NormalProduct normalProduct = buildNormalProduct(0, 6, 1);
        assertSellInAndQuality(normalProduct, -1, 4);
    }

    @Test
    public void test_normal_product_sellinm1_quality6_daypass1() {
        NormalProduct normalProduct = buildNormalProduct(-1, 6, 1);
        assertSellInAndQuality(normalProduct, -2, 4);
    }

}
