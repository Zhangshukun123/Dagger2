package com.example.a18237.dagger2;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

public class HttpFragment extends Fragment {


    @Inject
    RetrofitManager manager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.http_fragment, container, false);


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        HttpActivity activity = (HttpActivity) getActivity();
         activity.getComponent().prodiveHttpFragmentComponent().inject(this);



        int size = manager.getClient().getSize();
        Log.i("123", "onViewCreated: " + size);

    }
}
