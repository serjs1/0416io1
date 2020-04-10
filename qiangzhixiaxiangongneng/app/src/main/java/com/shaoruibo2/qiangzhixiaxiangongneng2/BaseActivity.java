package com.shaoruibo2.qiangzhixiaxiangongneng2;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/*继承界面变成界面*/
class BaseActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //添加子类集合
        //谁继承谁加入
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //从集合里面删除
        ActivityCollector.removeActivity(this);
    }
}
