package com.slidingtabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rashmi.ramesh on 13-12-2017.
 */

public class SectionFragment extends Fragment {
    private String text;

    public static SectionFragment newInstance(String text) {

        Bundle args = new Bundle();
        SectionFragment fragment = new SectionFragment();
        args.putString("text", text);
        fragment.setArguments(args);
        return fragment;
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.section_fragment, container, false);
        Bundle bundle = getArguments();
        if (bundle != null) {
            text = bundle.getString("text");
        }
        AppCompatTextView textViewContent = view.findViewById(R.id.tv_content);
        textViewContent.setText(text);
        return view;

    }

}

