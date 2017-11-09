package com.fynnjason.dexingyilu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.fynnjason.dexingyilu.home.NewAdapter;
import com.fynnjason.dexingyilu.home.NewModel;
import com.fynnjason.dexingyilu.hot.HotAdapter;
import com.gyf.barlibrary.ImmersionBar;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Integer> mHotData = new ArrayList<>();
    private List<NewModel> mNewData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //沉浸式
        ImmersionBar.with(this).init();
        //初始化视图
        iniView();
    }

    private void iniView() {
        //最热
        View hotView = getLayoutInflater().inflate(R.layout.layout_hot_rv, null);
        RecyclerView hotRv = hotView.findViewById(R.id.hot_rv);
        hotRv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        HotAdapter hotAdapter = new HotAdapter(R.layout.item_hot, getHotData());
        hotRv.setAdapter(hotAdapter);
        //广告
        View bannerView = getLayoutInflater().inflate(R.layout.layout_banner, null);
        Banner banner = bannerView.findViewById(R.id.banner);
        banner.setImages(Arrays.asList(R.drawable.a, R.drawable.b, R.drawable.a))
                .setImageLoader(new MyImageLoader())
                .start();
        //首页
        RecyclerView mainRv = findViewById(R.id.main_rv);
        mainRv.setLayoutManager(new LinearLayoutManager(this));
        NewAdapter newAdapter = new NewAdapter(getNewData());
        newAdapter.addHeaderView(bannerView);
        newAdapter.addHeaderView(hotView);
        mainRv.setAdapter(newAdapter);
    }

    /*最热数据*/
    private List<Integer> getHotData() {
        mHotData.add(R.drawable.a);
        mHotData.add(R.drawable.b);
        mHotData.add(R.drawable.a);
        mHotData.add(R.drawable.b);
        mHotData.add(R.drawable.a);
        return mHotData;
    }

    /*推荐数据*/
    private List<NewModel> getNewData() {
        mNewData.add(new NewModel(Arrays.asList(R.drawable.a)));
        mNewData.add(new NewModel(Arrays.asList(R.drawable.a, R.drawable.b)));
        mNewData.add(new NewModel(Arrays.asList(R.drawable.a, R.drawable.b, R.drawable.a)));
        mNewData.add(new NewModel(Arrays.asList(R.drawable.a)));
        mNewData.add(new NewModel(Arrays.asList(R.drawable.a, R.drawable.b)));
        mNewData.add(new NewModel(Arrays.asList(R.drawable.a, R.drawable.b, R.drawable.a)));
        mNewData.add(new NewModel(Arrays.asList(R.drawable.a)));
        mNewData.add(new NewModel(Arrays.asList(R.drawable.a, R.drawable.b)));
        mNewData.add(new NewModel(Arrays.asList(R.drawable.a, R.drawable.b, R.drawable.a)));
        return mNewData;
    }
}
