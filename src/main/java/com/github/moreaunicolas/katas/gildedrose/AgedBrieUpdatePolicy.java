package com.github.moreaunicolas.katas.gildedrose;

import static com.github.moreaunicolas.katas.gildedrose.ItemOperations.decreaseSellIn;
import static com.github.moreaunicolas.katas.gildedrose.ItemOperations.increaseQuality;
import static com.github.moreaunicolas.katas.gildedrose.ItemOperations.isAfterSellInDate;

class AgedBrieUpdatePolicy implements UpdatePolicy {

    @Override
    public void update(Item item) {
        decreaseSellIn(item);
        updateQuality(item);
        if (isAfterSellInDate(item)) {
            updateQualityAfterSellInDate(item);
        }
    }

    void updateQuality(Item item) {
        increaseQuality(item);
    }

    void updateQualityAfterSellInDate(Item item) {
        updateQuality(item);
    }
}
