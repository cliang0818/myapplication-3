package com.example.raymond.myapplication;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
//Array adapter populates the listview
public class modulesAdapter extends ArrayAdapter<modules> {
    private static final String TAG_ARRAY = "arrayadapter";
    public modulesAdapter(Context context, ArrayList<modules> modules){
        super(context, 0 , modules);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        modules modules  = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.modules, parent, false);
        }
        TextView moduleTitle = convertView.findViewById(R.id.moduleTitle);
        TextView moduleDesc = convertView.findViewById(R.id.moduleDescription);
        Log.e(TAG_ARRAY, "populating table");

        moduleTitle.setText(modules.moduleTitle);
        moduleDesc.setText(modules.moduleDescription);

        return convertView;
    }
}
