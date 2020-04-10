package com.shaoruibo2.qiangzhixiaxiangongneng2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/*第五步写另外一个基类*/
public class LoginActivity extends BaseActivity {
    private EditText account;
    private EditText password;
    /*第一步*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
         account=findViewById(R.id.account);
        password=findViewById(R.id.password);
        /*第五步*/
        Button login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //得到账号密码的值
                String account_str=account.getText().toString();
                String password_str=password.getText().toString();
                if(account_str.equals("admin")&&password_str.equals("123456")){
                    Intent intent=
                            new Intent
                                    (LoginActivity.this,
                                            MainActivity.class);
                    startActivity(intent);

                }
                else{
                    Toast.makeText(LoginActivity.this,
                            "账号密码有错误",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
