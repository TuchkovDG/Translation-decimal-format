package com.example.qwert.translationformat;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Денис on 13.10.2016.
 */
public class Frag1 extends Fragment {
    public static Frag1 newInstance() {
        return new Frag1();
    }

    private Button text10in2;
    private Button text10in8;
    private Button text10in16;

    private EditText entry10ret2;
    private EditText entry10ret8;
    private EditText entry10ret16;

    private IMoveText sender1;
    private IMoveText sender2;
    private IMoveText sender3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup contanir, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment1, contanir, false);

        text10in2 = (Button) root.findViewById(R.id.button);
        text10in8 = (Button) root.findViewById(R.id.button2);
        text10in16 = (Button) root.findViewById(R.id.button3);

        entry10ret2 = (EditText) root.findViewById(R.id.editText);
        entry10ret8 = (EditText) root.findViewById(R.id.editText2);
        entry10ret16 = (EditText) root.findViewById(R.id.editText3);

        text10in2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sender1 != null) {
                    String text1 = entry10ret2.getText().toString();
                    int text1Integer = Integer.parseInt(text1);
                    String text1in2 = Integer.toBinaryString(text1Integer);
                    sender1.take10Pay2(text1in2);
                }
            }
        });

        text10in8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sender2 != null) {
                    String text2 = entry10ret8.getText().toString();
                    int text2Integer = Integer.parseInt(text2);
                    String text2in8 = Integer.toOctalString(text2Integer);
                    sender2.take10Pay8(text2in8);
                }
            }
        });

        text10in16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sender3 != null) {
                    String text3 = entry10ret16.getText().toString();
                    int text3Integer = Integer.parseInt(text3);
                    String text2in16 = Integer.toHexString(text3Integer);
                    sender3.take10Pay16(text2in16);
                }
            }
        });

        return root;

    }

    public void setSender1(IMoveText sender1) {
        this.sender1 = sender1;
    }

    public void setSender2(IMoveText sender2) {
        this.sender2 = sender2;
    }

    public void setSender3(IMoveText sender3) {
        this.sender3 = sender3;
    }
}
