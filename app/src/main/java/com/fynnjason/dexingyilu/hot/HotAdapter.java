package com.fynnjason.dexingyilu.hot;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.fynnjason.dexingyilu.R;

import java.util.List;

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */

public class HotAdapter extends BaseQuickAdapter<Integer,BaseViewHolder> {
    public HotAdapter(int layoutResId, @Nullable List<Integer> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Integer item) {
        ImageView iv = helper.getView(R.id.hot_iv);
        Glide.with(mContext).load(item).into(iv);
    }
}
