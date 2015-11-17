package com.job.activity.myjobs;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;

import com.job.fragment.FabuFragment;
import com.job.fragment.HomeFragment;
import com.job.fragment.NearFragment;
import com.job.fragment.PerFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    FragmentManager fm;
//    FragmentTransaction ftt;
    RadioButton home,fabu,nearll,per;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        home = (RadioButton)findViewById(R.id.home);
        fabu = (RadioButton) findViewById(R.id.fabu);
        nearll = (RadioButton) findViewById(R.id.nearll);
        per=(RadioButton)findViewById(R.id.per);
        //home第一个默认
        home.setChecked(true);

        fabu.setOnClickListener(this);
        nearll.setOnClickListener(this);
        home.setOnClickListener(this);
        per.setOnClickListener(this);

        fm = getSupportFragmentManager();

        if (savedInstanceState == null){
            FragmentTransaction ftt = fm.beginTransaction();
            HomeFragment pf = new HomeFragment();
            ftt.add(R.id.fragment_parent, pf, "home");
            ftt.commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction ftt = fm.beginTransaction();
        if (fm.findFragmentByTag("home")!= null){
            ftt.hide(fm.findFragmentByTag("home"));
        }
        if (fm.findFragmentByTag("fabu")!= null){
            ftt.hide(fm.findFragmentByTag("fabu"));
        }
        if (fm.findFragmentByTag("nearll")!= null){
            ftt.hide(fm.findFragmentByTag("nearll"));
        }
        if (fm.findFragmentByTag("per")!= null){
            ftt.hide(fm.findFragmentByTag("per"));
        }
        int id = v.getId();
        if (id == R.id.home){
            if (fm.findFragmentByTag("home")!=null){
                ftt.show(fm.findFragmentByTag("home"));
            }else{
                HomeFragment hf = new HomeFragment();
                //add(父布局ID，Fragment，Tag);
                ftt.add(R.id.fragment_parent,hf,"home");
            }

        }else if (id == R.id.fabu){
            if (fm.findFragmentByTag("fabu")!=null){
                ftt.show(fm.findFragmentByTag("fabu"));
            }else{
                FabuFragment ff = new FabuFragment();
                //add(父布局ID，Fragment，Tag);
                ftt.add(R.id.fragment_parent,ff,"fabu");
            }
        }else if (id == R.id.nearll){   //我的
            if (fm.findFragmentByTag("nearll")!=null){
                ftt.show(fm.findFragmentByTag("nearll"));
            }else{
                NearFragment nf = new NearFragment();
                //add(父布局ID，Fragment，Tag);
                ftt.add(R.id.fragment_parent,nf,"nearll");
            }
        }else if (id == R.id.per){   //我的
            if (fm.findFragmentByTag("per")!=null){
                ftt.show(fm.findFragmentByTag("per"));
            }else{
                PerFragment pf = new PerFragment();
                //add(父布局ID，Fragment，Tag);
                ftt.add(R.id.fragment_parent,pf,"per");
            }
        }
        ftt.commit();
    }
}
