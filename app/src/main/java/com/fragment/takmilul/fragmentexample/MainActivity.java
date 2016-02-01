package com.fragment.takmilul.fragmentexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

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
   }
}
