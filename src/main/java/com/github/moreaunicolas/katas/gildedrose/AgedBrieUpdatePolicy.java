package com.github.moreaunicolas.katas.gildedrose;

import static com.github.moreaunicolas.katas.gildedrose.ItemOperations.increaseQuality;

class AgedBrieUpdatePolicy extends DefaultUpdatePolicy {

    void updateQuality(Item item) {
        increaseQuality(item);
    }
}
