package com.example.mmc.bookhouse.ui.activity;

import android.content.Context;
import android.content.Intent;

import com.example.mmc.bookhouse.R;
import com.example.mmc.bookhouse.ui.base.BaseActivity;

/**
 * Created by wangjiao on 2019/5/23.
 * 功能描述：图书详情
 */

public class BookDetailActivity extends BaseActivity {
    @Override
    protected int getResId() {
        return R.layout.activity_detail;
    }

    public static void start(Context context){
        Intent intnet = new Intent(context,BookDetailActivity.class);
        context.startActivity(intnet);
    }

}