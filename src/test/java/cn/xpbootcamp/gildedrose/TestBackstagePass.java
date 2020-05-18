package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class TestBackstagePass {

    public void assertSellInAndQuality(Product product, int sellIn, int quality) {
        Assert.assertEquals(sellIn, product.getSellIn());
        Assert.assertEquals(quality, product.getQuality());
    }

    public BackstagePass buildBackstagePass(int sellIn, int quality, int dayPass) {
        BackstagePass backstagePass = new BackstagePass(sellIn, quality);
        backstagePass.passDay(dayPass);
        return backstagePass;
    }

    @Test
    public void test_backstage_pass_sellin15_quality20_daypass1() {
        BackstagePass backstagePass = buildBackstagePass(15, 20, 1);
        assertSellInAndQuality(backstagePass, 14, 21);
    }

    @Test
    public void test_backstage_pass_sellin10_quality45_daypass1() {
        BackstagePass backstagePass = buildBackstagePass(10, 45, 1);
        assertSellInAndQuality(backstagePass, 9, 47);
    }

    @Test
    public void test_backstage_pass_sellin9_quality45_daypass1() {
        BackstagePass backstagePass = buildBackstagePass(9, 45, 1);
        assertSellInAndQuality(backstagePass, 8, 47);
    }

    @Test
    public void test_backstage_pass_sellin10_quality49_daypass1() {
        BackstagePass backstagePass = buildBackstagePass(10, 49, 1);
        assertSellInAndQuality(backstagePass, 9, 50);
    }

    @Test
    public void test_backstage_pass_sellin5_quality49_daypass1() {
        BackstagePass backstagePass = buildBackstagePass(5, 49, 1);
        assertSellInAndQuality(backstagePass, 4, 50);
    }

    @Test
    public void test_backstage_pass_sellin5_quality45_daypass1() {
        BackstagePass backstagePass = buildBackstagePass(5, 45, 1);
        assertSellInAndQuality(backstagePass, 4, 48);
    }

    @Test
    public void test_backstage_pass_sellin1_quality20_daypass1() {
        BackstagePass backstagePass = buildBackstagePass(1, 20, 1);
        assertSellInAndQuality(backstagePass, 0, 23);
    }

    @Test
    public void test_backstage_pass_sellin0_quality20_daypass1() {
        BackstagePass backstagePass = buildBackstagePass(0, 20, 1);
        assertSellInAndQuality(backstagePass, -1, 0);
    }

}
