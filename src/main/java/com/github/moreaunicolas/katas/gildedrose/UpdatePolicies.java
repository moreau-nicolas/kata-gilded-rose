package com.github.moreaunicolas.katas.gildedrose;

class UpdatePolicies {

    private static final UpdatePolicy
        DEFAULT = new DefaultUpdatePolicy(),
        SULFURAS = new SulfurasUpdatePolicy(),
        AGED_BRIE = new AgedBrieUpdatePolicy(),
        BACKSTAGE_PASS = new BackstagePassUpdatePolicy(),
        CONJURED_ITEM = new ConjuredItemUpdatePolicy();

    UpdatePolicy findApplicableUpdatePolicy(Item item) {
        if (isSulfuras(item)) {
            return SULFURAS;
        } else if (isAgedBrie(item)) {
            return AGED_BRIE;
        } else if (isBackstagePass(item)) {
            return BACKSTAGE_PASS;
        } else if (isConjured(item)) {
            return CONJURED_ITEM;
        }
        return DEFAULT;
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
