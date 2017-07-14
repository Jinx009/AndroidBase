package com.example.jinx.androiddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //得到按钮
        Button btn = (Button)findViewById(R.id.hellobutton);
        //获取按钮点击事件
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView)findViewById(R.id.hellotextView);
                //点击后操作第一步弹出原生支持toast提示
                Toast.makeText(MainActivity.this,R.string.interact_message,Toast.LENGTH_SHORT).show();
                //更换文本框显示
                textView.setText(R.string.interact_message);
                //View跳转
                setContentView(R.layout.main_one);
            }
        });
    }
}
