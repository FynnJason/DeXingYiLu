package com.fynnjason.dexingyilu.home;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */

public class NewModel implements MultiItemEntity {
    private List<Integer> images;

    public NewModel(List<Integer> images) {
        this.images = images;
    }

    public List<Integer> getImages() {
        return images;
    }

    public void setImages(List<Integer> images) {
        this.images = images;
    }

    @Override
    public int getItemType() {
        return images.size();
    }
}
