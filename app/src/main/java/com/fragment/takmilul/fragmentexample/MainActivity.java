package com.fragment.takmilul.fragmentexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

   Fragment fragment;
   Button button1;
   Button button2;
   Button button3;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      button1 = (Button) findViewById(R.id.btn1);
      button2 = (Button) findViewById(R.id.btn2);
      button3 = (Button) findViewById(R.id.btn3);

      fragment = new Fragment1();
      FragmentManager manager = getSupportFragmentManager();
      FragmentTransaction transaction = manager.beginTransaction();
      transaction.add(R.id.fragment, fragment);
      transaction.commit();

      button1.setOnClickListener(this);
      button2.setOnClickListener(this);
      button3.setOnClickListener(this);
   }

   @Override
   public void onClick(View v) {
      int id = v.getId();

      if(v == button1){
         fragment = new Fragment1();
      }
      else if(v == button2){
         fragment = new Fragment2();
      }
      else
         fragment = new Fragment3();

      FragmentManager manager = getSupportFragmentManager();
      FragmentTransaction transaction = manager.beginTransaction();
      transaction.replace(R.id.fragment, fragment);
      transaction.addToBackStack(null);
      transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
      transaction.commit();
   }
}
