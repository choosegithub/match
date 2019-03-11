package com.contest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void should_fix_me() {
        Item[] items = new Item[] { new AgedBrie("AgedBrie", 10, 20),new BackstagePasses("BackstagePasses", 10, 20),new CommonGoods("CommonGoods", 10, 20),new Sulfuras("Sulfuras", 10, 20) };
        GildedRose gildedRose = new GildedRose(items);
        
        gildedRose.updateQuality();

        assertEquals(9, (gildedRose.items[0]).sellIn);
        assertEquals(19, gildedRose.items[0].quality);
    }
}
