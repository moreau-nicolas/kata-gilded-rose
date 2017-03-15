package com.github.moreaunicolas.katas.gildedrose;

import static com.github.moreaunicolas.katas.gildedrose.ItemOperations.decreaseSellIn;
import static com.github.moreaunicolas.katas.gildedrose.ItemOperations.increaseQuality;
import static com.github.moreaunicolas.katas.gildedrose.ItemOperations.isAfterSellInDate;

class AgedBrieUpdatePolicy {

    static void update(Item item) {
        decreaseSellIn(item);
        increaseQuality(item);
        if (isAfterSellInDate(item)) {
            increaseQuality(item);
        }
    }
}
