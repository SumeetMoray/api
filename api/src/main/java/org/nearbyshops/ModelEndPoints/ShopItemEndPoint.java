package org.nearbyshops.ModelEndPoints;

import org.nearbyshops.Model.ItemCategory;
import org.nearbyshops.Model.ShopItem;

import java.util.ArrayList;

/**
 * Created by sumeet on 30/6/16.
 */
public class ShopItemEndPoint {

    Integer itemCount;
    Integer offset;
    Integer limit;
    Integer max_limit;
    ArrayList<ShopItem> results;


    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getMax_limit() {
        return max_limit;
    }

    public void setMax_limit(Integer max_limit) {
        this.max_limit = max_limit;
    }

    public ArrayList<ShopItem> getResults() {
        return results;
    }

    public void setResults(ArrayList<ShopItem> results) {
        this.results = results;
    }
}
