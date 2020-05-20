package cn.xpbootcamp.gildedrose;

import org.junit.Test;

public class TestBackstagePass extends TestBase {

    public BackstagePass setupBackstagePass(int sellIn, int quality, int dayPass) {
        BackstagePass backstagePass = new BackstagePass(sellIn, quality);
        backstagePass.passDay(dayPass);
        return backstagePass;
    }

    @Test
    public void should_calc_backstage_pass_when_sellin15_quality20_daypass1() {
        BackstagePass backstagePass = setupBackstagePass(15, 20, 1);
        assertSellInAndQuality(backstagePass, 14, 21);
    }

    @Test
    public void should_calc_backstage_pass_when_sellin10_quality45_daypass1() {
        BackstagePass backstagePass = setupBackstagePass(10, 45, 1);
        assertSellInAndQuality(backstagePass, 9, 47);
    }

    @Test
    public void should_calc_backstage_pass_when_sellin9_quality45_daypass1() {
        BackstagePass backstagePass = setupBackstagePass(9, 45, 1);
        assertSellInAndQuality(backstagePass, 8, 47);
    }

    @Test
    public void should_calc_backstage_pass_when_sellin10_quality49_daypass1() {
        BackstagePass backstagePass = setupBackstagePass(10, 49, 1);
        assertSellInAndQuality(backstagePass, 9, 50);
    }

    @Test
    public void should_calc_backstage_pass_when_sellin5_quality49_daypass1() {
        BackstagePass backstagePass = setupBackstagePass(5, 49, 1);
        assertSellInAndQuality(backstagePass, 4, 50);
    }

    @Test
    public void should_calc_backstage_pass_when_sellin5_quality45_daypass1() {
        BackstagePass backstagePass = setupBackstagePass(5, 45, 1);
        assertSellInAndQuality(backstagePass, 4, 48);
    }

    @Test
    public void should_calc_backstage_pass_when_sellin1_quality20_daypass1() {
        BackstagePass backstagePass = setupBackstagePass(1, 20, 1);
        assertSellInAndQuality(backstagePass, 0, 23);
    }

    @Test
    public void should_calc_backstage_pass_when_sellin0_quality20_daypass1() {
        BackstagePass backstagePass = setupBackstagePass(0, 20, 1);
        assertSellInAndQuality(backstagePass, -1, 0);
    }

}
