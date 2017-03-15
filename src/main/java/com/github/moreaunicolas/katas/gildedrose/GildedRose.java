package com.github.moreaunicolas.katas.gildedrose;

import static com.github.moreaunicolas.katas.gildedrose.ItemOperations.*;

public class GildedRose {
    final Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (isSulfuras(item)) {
                updateSulfuras(item);
            } else if (isAgedBrie(item)) {
                updateAgedBrie(item);
            } else if (isBackstagePass(item)) {
                updateBackstagePass(item);
            } else {
                updateDefault(item);
            }
        }
    }

    private static void updateSulfuras(Item unused) {
        // Legendary items never change!
    }

    private static void updateAgedBrie(Item item) {
        decreaseSellIn(item);
        increaseQuality(item);
        if (isAfterSellInDate(item)) {
            increaseQuality(item);
        }
    }

    private static void updateBackstagePass(Item item) {
        decreaseSellIn(item);
        increaseQuality(item);
        if (item.sellIn < 10) {
            increaseQuality(item);
        }
        if (item.sellIn < 5) {
            increaseQuality(item);
        }
        if (isAfterSellInDate(item)) {
            item.quality = 0;
        }
    }

    private static void updateDefault(Item item) {
        decreaseSellIn(item);
        decreaseQuality(item);
        if (isAfterSellInDate(item)) {
            decreaseQuality(item);
        }
    }

    private static boolean isAgedBrie(Item item) {
        return item.name.equals("Aged Brie");
    }

    private static boolean isBackstagePass(Item item) {
        return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    private static boolean isSulfuras(Item item) {
        return item.name.equals("Sulfuras, Hand of Ragnaros");
    }
}
