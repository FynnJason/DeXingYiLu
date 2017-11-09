package com.fynnjason.dexingyilu.home;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.fynnjason.dexingyilu.R;

import java.util.List;

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */

public class NewAdapter extends BaseMultiItemQuickAdapter<NewModel, BaseViewHolder> {
    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public NewAdapter(List<NewModel> data) {
        super(data);
        addItemType(1, R.layout.item_type_one);
        addItemType(2, R.layout.item_type_two);
        addItemType(3, R.layout.item_type_three);
    }

    @Override
    protected void convert(BaseViewHolder helper, NewModel item) {
        switch (helper.getItemViewType()) {
            case 1:
                ImageView iv = helper.getView(R.id.one_iv);
                Glide.with(mContext).load(item.getImages().get(0)).into(iv);
                break;
            case 2:
                ImageView ivFirst = helper.getView(R.id.two_iv_first);
                ImageView ivSecond = helper.getView(R.id.two_iv_second);
                Glide.with(mContext).load(item.getImages().get(0)).into(ivFirst);
                Glide.with(mContext).load(item.getImages().get(1)).into(ivSecond);
                break;
            case 3:
                ImageView ivF = helper.getView(R.id.three_iv_first);
                ImageView ivS = helper.getView(R.id.three_iv_second);
                ImageView ivT = helper.getView(R.id.three_iv_third);
                Glide.with(mContext).load(item.getImages().get(0)).into(ivF);
                Glide.with(mContext).load(item.getImages().get(1)).into(ivS);
                Glide.with(mContext).load(item.getImages().get(2)).into(ivT);
                break;
        }
    }
}
