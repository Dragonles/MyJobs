package com.job.Utils.myjobs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.job.activity.myjobs.MainActivity;
import com.job.activity.myjobs.R;

/**
 * 闪屏页
 * */
public class ShanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shan);
        /*使用线程延迟三秒，跳转到主页面*/
        new Thread (new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Intent intent =new Intent(ShanActivity.this,MainActivity.class);
                    ShanActivity.this.startActivity(intent);
                    ShanActivity.this.finish();
                    break;
                }
            }
            //}
        }).start();
    }

}
