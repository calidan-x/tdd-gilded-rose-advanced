package cn.xpbootcamp.gildedrose;

import org.junit.Test;

public class TestAgedBrie extends TestBase {

    public AgedBrie setupAgedBrie(int sellIn, int quality, int dayPass) {
        AgedBrie agedBrie = new AgedBrie(sellIn, quality);
        agedBrie.passDay(dayPass);
        return agedBrie;
    }

    @Test
    public void should_calc_agedbrie_when_sellin2_quality0_daypass1() {
        AgedBrie agedBrie = setupAgedBrie(2, 0, 1);
        assertSellInAndQuality(agedBrie, 1, 1);
    }

    @Test
    public void should_calc_agedbrie_when_sellin2_quality49_daypass1() {
        AgedBrie agedBrie = setupAgedBrie(2, 49, 1);
        assertSellInAndQuality(agedBrie, 1, 50);
    }

    @Test
    public void should_calc_agedbrie_when_sellin2_quality50_daypass1() {
        AgedBrie agedBrie = setupAgedBrie(2, 50, 1);
        assertSellInAndQuality(agedBrie, 1, 50);
    }

    @Test
    public void should_calc_agedbrie_when_sellin0_quality20_daypass1() {
        AgedBrie agedBrie = setupAgedBrie(0, 20, 1);
        assertSellInAndQuality(agedBrie, -1, 22);
    }

    @Test
    public void should_calc_agedbrie_when_sellinm1_quality20_daypass1() {
        AgedBrie agedBrie = setupAgedBrie(-1, 20, 1);
        assertSellInAndQuality(agedBrie, -2, 22);
    }
}
