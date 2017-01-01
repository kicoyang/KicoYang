package com.lib.kicoyang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.main_iv)
    ImageView mainIv;
    @Bind(R.id.activity_main)
    RelativeLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Picasso.with(this).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1483284263808&di=939002ffc241f9d64ae35926ace82f53&imgtype=0&src=http%3A%2F%2Fwww.zhuobufan.com%2FUserFiles%2FAttachment%2F16%2F12_22%2F5c7f3f0e-9d8a-48d2-9f4f-c5c69c9cfed1.jpg").into(mainIv);
    }

    @OnClick({R.id.main_iv, R.id.activity_main})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_iv:
                break;
            case R.id.activity_main:
                break;
        }
    }
}
