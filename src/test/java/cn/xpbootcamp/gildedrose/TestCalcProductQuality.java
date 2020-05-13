package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class TestCalcProductQuality {

    @Test
    public void givenAgedBrieSellinBiggerThan10_WhenCalc_ThenRet10() {
        AgedBrie agedBrie = new AgedBrie(10, 12);
        Assert.assertEquals(10, agedBrie.getQuality());
    }

    @Test
    public void givenAgedBrieSellinMinus2_WhenCalc_ThenRet12() {
        AgedBrie agedBrie = new AgedBrie(10, -2);
        Assert.assertEquals(12, agedBrie.getQuality());
    }

    @Test
    public void givenAgedBrieSellinMinus41_WhenCalc_ThenRet50() {
        AgedBrie agedBrie = new AgedBrie(10, -41);
        Assert.assertEquals(50, agedBrie.getQuality());
    }

    @Test
    public void givenSulfuras_WhenCalc_ThenRet50() {
        Sulfuras sulfuras = new Sulfuras(10);
        Assert.assertEquals(10, sulfuras.getQuality());
    }

    @Test
    public void givenBackstagePass_S11_Q10_WhenCalc_ThenRet10() {
        BackstagePass backstagePass = new BackstagePass(10,11);
        Assert.assertEquals(10, backstagePass.getQuality());
    }

    @Test
    public void givenBackstagePass_S9_Q10_WhenCalc_ThenRet14() {
        BackstagePass backstagePass = new BackstagePass(10,9);
        Assert.assertEquals(14, backstagePass.getQuality());
    }

    @Test
    public void givenBackstagePass_S5_Q10_WhenCalc_ThenRet23() {
        BackstagePass backstagePass = new BackstagePass(10,5);
        Assert.assertEquals(23, backstagePass.getQuality());
    }

    @Test
    public void givenBackstagePass_S1_Q10_WhenCalc_ThenRet35() {
        BackstagePass backstagePass = new BackstagePass(10,1);
        Assert.assertEquals(35, backstagePass.getQuality());
    }

    @Test
    public void givenBackstagePass_S0_Q10_WhenCalc_ThenRet0() {
        BackstagePass backstagePass = new BackstagePass(10,0);
        Assert.assertEquals(0, backstagePass.getQuality());
    }

    @Test
    public void givenBackstagePass_SMinus1_Q10_WhenCalc_ThenRet0() {
        BackstagePass backstagePass = new BackstagePass(10,-1);
        Assert.assertEquals(0, backstagePass.getQuality());
    }
}
