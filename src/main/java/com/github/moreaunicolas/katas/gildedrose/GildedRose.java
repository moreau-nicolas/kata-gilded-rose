package com.github.moreaunicolas.katas.gildedrose;

public class GildedRose {
    final Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (isSulfuras(item)) {
                SulfurasUpdatePolicy.update(item);
            } else if (isAgedBrie(item)) {
                AgedBrieUpdatePolicy.update(item);
            } else if (isBackstagePass(item)) {
                BackstagePassUpdatePolicy.update(item);
            } else {
                DefaultUpdatePolicy.update(item);
            }
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
