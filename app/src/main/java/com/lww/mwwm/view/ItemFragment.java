package com.lww.mwwm.view;

import android.app.Fragment;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.lww.mwwm.R;

import java.util.ArrayList;

/**
 * 显示数据的fragment
 * @author Administrator
 *
 */
public class ItemFragment extends Fragment {
    private EditText et_1,et_2,et_3,et_4,et_5;
    private ArrayList<EditText> list ;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.item_fragment,container, false);
        setView(view);
//      setListener();
        return view;
    }
    private void setListener() {

    }
    private void setView(View view) {
        list =new ArrayList<>();
        et_1=(EditText) view.findViewById(R.id.et_1);
        et_2=(EditText) view.findViewById(R.id.et_2);
        et_3=(EditText) view.findViewById(R.id.et_3);
        et_4=(EditText) view.findViewById(R.id.et_4);
        et_5=(EditText) view.findViewById(R.id.et_5);
        list.add( et_1);
        list.add( et_2);
        list.add( et_3);
        list.add( et_4);
        list.add( et_5);
    }
    private StringBuffer sb;
    public String getValue(){
        sb =new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            String string =list.get(i).getText().toString();
    /*      if (i==0) {
                if (string!=null) {
                    sb.append(string);
                    sb.append("$");
                }else {
                    sb.append("-1");sb.append("$");
                }
            }else*/ if (i==list.size()-1) {
                if (!TextUtils.isEmpty(string)) {
                    sb.append(string);
                }else {
                    sb.append("-1");
                }
            }else {
                if (!TextUtils.isEmpty(string)) {
                    sb.append(string);sb.append("$");
                }else {
                    sb.append("-1");sb.append("$");
                }
            }
        }
        return sb.toString();
    }
    public void setXm(String string){
        if (!TextUtils.isEmpty(string)) {
            et_1.setText(string);
        }
    }
    public void setNl(String string){
        if (!TextUtils.isEmpty(string)) {
            et_2.setText(string);
        }
    }
    public void setTw(String string){
        if (!TextUtils.isEmpty(string)) {
            et_3.setText(string);
        }
    }
    public void setMb(String string){
        if (!TextUtils.isEmpty(string)) {
            et_4.setText(string);
        }
    }
    public void setHx(String string){
        if (!TextUtils.isEmpty(string)) {
            et_5.setText(string);
        }
    }

}
