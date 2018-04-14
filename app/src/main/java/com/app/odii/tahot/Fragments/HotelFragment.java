package com.app.odii.tahot.Fragments;


import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import com.app.odii.tahot.R;

/**
 * A simple {@link Fragment} subclass.
 */


public class HotelFragment extends Fragment {

    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_hotel, container, false);

        ListView lv = (ListView)rootView.findViewById(R.id.listview2);
        lv.setAdapter(new ItemListManager());

        return rootView;
    }
    class ItemListManager extends BaseAdapter{
        String data_items[][]={
                {"R.drawable.image15"},
                {"R.drawable.image16"},
                {"R.drawable.image21"},
                {"R.drawable.image22"},
                {"R.drawable.image23"},
                {"R.drawable.image24"}
        };

        int items_images[] = {R.drawable.image15, R.drawable.image16, R.drawable.image21,
                R.drawable.image22, R.drawable.image23, R.drawable.image24};

        @Override
        public int getCount() {
            return data_items.length;
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
            if (convertView==null){
                convertView= LayoutInflater.from(getContext()).inflate(R.layout.layout_hotel, parent, false);
            }
            ImageView image = (ImageView) convertView.findViewById(R.id.imageView9);
            final Button detail = (Button) convertView.findViewById(R.id.button9);
            Button order = (Button) convertView.findViewById(R.id.button10);
            image.setImageResource(items_images[position]);

            detail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder detail = new AlertDialog.Builder(getContext());
                    detail.setTitle("Hotel Specifications");
                    detail.setMessage("Name: Solution Hotel" + "\n" + "Location: Imo State,Nigeria" + "\n" + "Price: $5");
                    detail.create().show();
                }
            });

            order.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder order = new AlertDialog.Builder(getContext());
                    order.setTitle("Notification");
                    order.setMessage("Order Sent" + "\n" + "Hotel Awaiting Your Arrival");
                    order.create().show();
                }
            });
            return convertView;
        }
    }
}
