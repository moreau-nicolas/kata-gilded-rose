package com.github.moreaunicolas.katas.gildedrose;

import static com.github.moreaunicolas.katas.gildedrose.ItemOperations.decreaseQuality;
import static com.github.moreaunicolas.katas.gildedrose.ItemOperations.decreaseSellIn;
import static com.github.moreaunicolas.katas.gildedrose.ItemOperations.isAfterSellInDate;

class DefaultUpdatePolicy implements UpdatePolicy {

    @Override
    public void update(Item item) {
        decreaseSellIn(item);
        decreaseQuality(item);
        if (isAfterSellInDate(item)) {
            decreaseQuality(item);
        }
    }
}
