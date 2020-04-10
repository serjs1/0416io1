package com.shaoruibo2.qiangzhixiaxiangongneng2;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.baidu.xiaxian");
                intent.setComponent(new ComponentName(getPackageName(),"com.shaoruibo2.qiangzhixiaxiangongneng2.XiaXianGuangBo"));
                sendBroadcast(intent);
            }
        });
    }
}
