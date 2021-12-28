package com.example.lab010402;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class Mainframe extends Fragment {
    private String str;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        TextView tv = view.findViewById(R.id.textView);
        Bundle data = getArguments();
        if (data != null) {
            str = data.getString("smth");
        }
        tv.setText(str);
        return view;
    }
}
    //super.onViewCreated(view, savedInstanceState);

       /* TextView tv = view.findViewById(R.id.textView);
        tv.setTextSize(26);
        tv.setPadding(16, 16, 16, 16);
        Bundle data= getArguments();
        assert data != null;
        //String str=data.getString("smth");
        tv.setText(getArguments().getString("smth"));*/


