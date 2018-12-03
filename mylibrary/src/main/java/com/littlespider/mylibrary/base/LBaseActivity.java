package com.littlespider.mylibrary.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.littlespider.mylibrary.ToastUtil;

/**
 * Created by littlespider on 2018/12/03.
 */
public abstract class LBaseActivity extends Activity {

    protected ToastUtil t;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayRes());
        t = new ToastUtil(this);
        initView();
        initData();
    }

    protected abstract int setLayRes();

    protected abstract void initView();

    protected abstract void initData();
}
