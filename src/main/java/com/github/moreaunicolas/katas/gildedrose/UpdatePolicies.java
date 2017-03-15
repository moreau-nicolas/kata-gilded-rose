package com.github.moreaunicolas.katas.gildedrose;

class UpdatePolicies {

    UpdatePolicy findApplicableUpdatePolicy(Item item) {
        UpdatePolicy updatePolicy = new DefaultUpdatePolicy();
        if (isSulfuras(item)) {
            updatePolicy = new SulfurasUpdatePolicy();
        } else if (isAgedBrie(item)) {
            updatePolicy = new AgedBrieUpdatePolicy();
        } else if (isBackstagePass(item)) {
            updatePolicy = new BackstagePassUpdatePolicy();
        } else if (isConjured(item)) {
            updatePolicy = new ConjuredItemUpdatePolicy();
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

    private static boolean isConjured(Item item) {
        return item.name.startsWith("Conjured ");
    }
}
