package com.app.odii.tahot.Fragments;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import com.app.odii.tahot.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TaxiFragment extends Fragment {


    public TaxiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_taxi, container, false);

        ListView lv = (ListView)rootView.findViewById(R.id.listview);
        lv.setAdapter(new ItemListManager());

       return rootView;
    }

    class ItemListManager extends BaseAdapter{

        String items_data[][] = {
                {"R.drawable.image8"},
                {"R.drawable.image9"},
                {"R.drawable.image10"},
                {"R.drawable.image11"},
                {"R.drawable.image12"},
                {"R.drawable.image13"},
                {"R.drawable.image14"}


        };

        int items_images[] = {R.drawable.image8, R.drawable.image9, R.drawable.image10,
                R.drawable.image11, R.drawable.image12, R.drawable.image13, R.drawable.image14};

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
                convertView= LayoutInflater.from(getContext()).inflate(R.layout.layout_taxi, parent, false);
            }

            ImageView image = (ImageView) convertView.findViewById(R.id.imageView3);
            ImageButton img = (ImageButton) convertView.findViewById(R.id.imageButton);
            Button detail = (Button) convertView.findViewById(R.id.button8);
            image.setImageResource(items_images[position]);


            detail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder detail = new AlertDialog.Builder(getContext());
                    detail.setTitle("Driver Profile");
                    detail.setMessage("Name: Odii Chinedum "+"\n"+"Nationality: Nigerian"+"\n"+
                            "Driving Experience: 6 Years "+"\n"+"Languages: English, French, Igbo"+"\n"+
                            "Age: 27"+"\n"+ "Tahot Trust Level: 7/10"+"\n");
                    detail.create().show();
                }
            });

            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent call = new Intent(Intent.ACTION_CALL);
                    call.setData(Uri.parse("tel: 08145161463"));
                    startActivity(call);
                }
            });
            return convertView;
        }
    }

}
