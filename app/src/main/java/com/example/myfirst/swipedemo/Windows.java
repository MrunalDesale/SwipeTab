package com.example.myfirst.swipedemo;
/**
 * Created by bridgelabz3 on 19/12/15.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
public class Windows extends Fragment
{
    Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        final View windows = inflater.inflate(R.layout.windows_frag, container, false);
        ((TextView)windows.findViewById(R.id.textView)).setText("Windows");

        return windows;
    }
}