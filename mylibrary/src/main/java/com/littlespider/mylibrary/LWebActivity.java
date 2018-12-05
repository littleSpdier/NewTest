package com.littlespider.mylibrary;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;

import com.littlespider.mylibrary.base.LBaseActivity;

/**
 * Created by littlespider on 2018/12/05.
 */
public class LWebActivity extends LBaseActivity implements View.OnClickListener{

    private WebView webView;
    private LinearLayout llBack;

    private static String webUrl;

    @Override
    protected int setLayRes() {
        return R.layout.activity_webview;
    }

    @Override
    protected void initView() {
        llBack = findViewById(R.id.ll_back);
        webView = findViewById(R.id.web_view);
        llBack.setOnClickListener(this);
        webView.setWebViewClient(new WebViewClient());
        if (webUrl != null&&!"".equals(webUrl)){
//            webView.loadUrl("http://www.sanwen.net/subject/3665473");
            webView.loadUrl(webUrl);
        }
    }

    @Override
    protected void initData() {

    }

    public static void intoWebActivity(Activity activity, String url){
        webUrl = url;
        Intent intent = new Intent(activity, LWebActivity.class);
        activity.startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
