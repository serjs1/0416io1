package com.example.shaoruibo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class LeftFragment extends Fragment {
    public String str="中户人民共和国";
    //碎片中的List
    public List<String> list=new ArrayList<>();
    //在碎片中创建活动对象 连接 活动
    public  MainActivity jiandie;
    //建立构造函数 初始化jiandie对象
//    public LeftFragment(){
//
//
//    }
    @Override
    public void onAttach(Context context) {
        //上级
        super.onAttach(context);
        jiandie=(MainActivity)getActivity();

        list.add("aaaa");
        list.add("aaaa");
        list.add("aaaa");
        list.add("aaaa");
        list.add("aaaa");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragment= inflater.inflate(R.layout.fragment_left, container, false);
        //       过滤条件 LeftFragment中 打印 jiandiestr
        Log.d("LeftFragment",jiandie.str);
        jiandie.bbb();
        return fragment;

    }
    public void a(){
        //打印江西应用科技学院
        Log.d("LeftFragment","江西应用科技学院");
    }

}
