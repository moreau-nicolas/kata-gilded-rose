package com.github.moreaunicolas.katas.gildedrose;

public class GildedRose {
    final Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (isSulfuras(item)) continue;

            if (isAgedBrie(item) || isBackstagePass(item)) {
                increaseQuality(item);
                if (isBackstagePass(item)) {
                    if (item.sellIn < 11) {
                        increaseQuality(item);
                    }
                    if (item.sellIn < 6) {
                        increaseQuality(item);
                    }
                }
            } else {
                decreaseQuality(item);
            }

            item.sellIn -= 1;

            if (item.sellIn < 0) {
                if (isAgedBrie(item)) {
                    increaseQuality(item);
                } else if (isBackstagePass(item)) {
                    item.quality = 0;
                } else {
                    decreaseQuality(item);
                }
            }
        }
    }

    private static void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality += 1;
        }
    }

    private static void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality -= 1;
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
