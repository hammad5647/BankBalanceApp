package com.example.quateapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class bankAdapter extends BaseAdapter {
    String[] bankNames = {};
    int[] banklogos = {};

    public bankAdapter(String[] bankNames, int[] banklogos) {
        this.bankNames = bankNames;
        this.banklogos = banklogos;
    }


    @Override
    public int getCount() {
        return bankNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bank_branch, parent, false);
        TextView txtBanks = view.findViewById(R.id.txtBanks);

        CircleImageView bankImage = view.findViewById(R.id.bankImage);

        txtBanks.setText(bankNames[position]);

        bankImage.setImageResource(banklogos[position]);
        return view;
    }
}
