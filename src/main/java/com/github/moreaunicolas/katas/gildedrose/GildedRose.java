package com.github.moreaunicolas.katas.gildedrose;

public class GildedRose {
    final Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            UpdatePolicy updatePolicy = findApplicableUpdatePolicy(item);
            updatePolicy.update(item);
        }
    }

    private static UpdatePolicy findApplicableUpdatePolicy(Item item) {
        UpdatePolicy updatePolicy = new DefaultUpdatePolicy();
        if (isSulfuras(item)) {
            updatePolicy = new SulfurasUpdatePolicy();
        } else if (isAgedBrie(item)) {
            updatePolicy = new AgedBrieUpdatePolicy();
        } else if (isBackstagePass(item)) {
            updatePolicy = new BackstagePassUpdatePolicy();
        }
        return updatePolicy;
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
