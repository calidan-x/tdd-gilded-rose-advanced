package cn.xpbootcamp.gildedrose;

import org.junit.Test;

public class TestSulfuras extends TestBase {

    public Sulfuras setupSulfuras(int sellIn, int quality, int dayPass) {
        Sulfuras sulfuras = new Sulfuras(sellIn, quality);
        sulfuras.passDay(dayPass);
        return sulfuras;
    }

    @Test
    public void should_calc_sulfuras_when_sellin0_quality45_daypass1() {
        Sulfuras sulfuras = setupSulfuras(0, 45, 1);
        assertSellInAndQuality(sulfuras, 0, 45);
    }

    @Test
    public void should_calc_sulfuras_when_sellinm1_quality45_daypass1() {
        Sulfuras sulfuras = setupSulfuras(-1, 45, 1);
        assertSellInAndQuality(sulfuras, -1, 45);
    }

    @Test
    public void should_calc_sulfuras_when_sellinm1_quality50_daypass1() {
        Sulfuras sulfuras = setupSulfuras(-1, 50, 1);
        assertSellInAndQuality(sulfuras, -1, 50);
    }

    @Test
    public void should_calc_sulfuras_when_sellinm1_quality1_daypass1() {
        Sulfuras sulfuras = setupSulfuras(-1, 1, 1);
        assertSellInAndQuality(sulfuras, -1, 1);
    }

    @Test
    public void should_calc_sulfuras_when_sellinm2_quality1_daypass1() {
        Sulfuras sulfuras = setupSulfuras(-2, 1, 1);
        assertSellInAndQuality(sulfuras, -2, 1);
    }

}
