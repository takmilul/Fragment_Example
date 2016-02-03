package com.fragment.takmilul.fragmentexample;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment {

   OnFragment1SelectedListener mCallback;

   public interface OnFragment1SelectedListener {
      public void onArticleSelected(int position);
   }

   @Override
   public void onAttach(Context context) {
      super.onAttach(context);

   }

   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {
      // Inflate the layout for this fragment
      return inflater.inflate(R.layout.fragment_fragment1, container, false);
   }

}
