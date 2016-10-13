package com.example.qwert.translationformat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by Денис on 13.10.2016.
 */
public class Frag2 extends Fragment implements IMoveText {

    public static Frag2 newInstance() {
        return new Frag2();
    }

    private EditText entryText1;
    private EditText entryText2;
    private EditText entryText3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup contanir, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment2, contanir, false);
        entryText1 = (EditText) root.findViewById(R.id.editText4);
        entryText2 = (EditText) root.findViewById(R.id.editText5);
        entryText3 = (EditText) root.findViewById(R.id.editText6);
        return root;
    }

    @Override
    public void take10Pay2(String text1in2) {
        entryText1.setText(text1in2);
    }

    @Override
    public void take10Pay8(String text1in8) {
        entryText2.setText(text1in8);
    }

    @Override
    public void take10Pay16(String text1in16) {
        entryText3.setText(text1in16);
    }
}

