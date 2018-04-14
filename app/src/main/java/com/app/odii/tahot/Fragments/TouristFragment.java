package com.app.odii.tahot.Fragments;


import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import com.app.odii.tahot.R;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/**
 * A simple {@link Fragment} subclass.
 */
public class TouristFragment extends Fragment {


    public TouristFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =inflater.inflate(R.layout.fragment_tourist, container, false);
        ListView lv = (ListView)rootView.findViewById(R.id.listview4);
        lv.setAdapter(new ItemListManager());
        return rootView;
    }


    public class ItemListManager extends BaseAdapter{

        String items_data[][] = {
                {"R.drawable.image19"},
                {"R.drawable.image20"},
                {"R.drawable.image33"},
                {"R.drawable.image34"},
                {"R.drawable.image35"},
                {"R.drawable.image36"}




        };
        int items_images[] = {R.drawable.image19, R.drawable.image20, R.drawable.image33,
                R.drawable.image34, R.drawable.image35, R.drawable.image36
        };


        @Override
        public int getCount() {
            return items_data.length;
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
                convertView= LayoutInflater.from(getContext()).inflate(R.layout.layout_tour, parent, false);
            }
            ImageView image = (ImageView) convertView.findViewById(R.id.imageView11);
            Button ve = (Button) convertView.findViewById(R.id.button13);
            ImageButton lo = (ImageButton)convertView.findViewById(R.id.imageButton3);
            image.setImageResource(items_images[position]);

            ve.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder detor = new AlertDialog.Builder(getContext());
                    detor.setTitle("Tourism");
                    detor.setMessage("Name: Natural" + "\n" + "Age: 23 Years" + "\n" +
                            "Rating: 8/10");
                    detor.create().show();
                }
            });

            lo.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder loc = new AlertDialog.Builder(getContext());
                    loc.setTitle("Location");
                    loc.setMessage("No 5 Sam Urewuji Avenue Naze, Owerri Imo State");
                    loc.create().show();
                }
            });

            return convertView;
        }
    }
}
