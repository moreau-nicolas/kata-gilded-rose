package com.github.moreaunicolas.katas.gildedrose;

import static com.github.moreaunicolas.katas.gildedrose.ItemOperations.decreaseSellIn;
import static com.github.moreaunicolas.katas.gildedrose.ItemOperations.increaseQuality;
import static com.github.moreaunicolas.katas.gildedrose.ItemOperations.isAfterSellInDate;

class BackstagePassUpdatePolicy {

    static void update(Item item) {
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
}
