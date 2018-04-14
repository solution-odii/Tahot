package com.app.odii.tahot.Fragments;


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
public class SchoolFragment extends Fragment {


    public SchoolFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_school, container, false);

        ListView lv = (ListView)rootView.findViewById(R.id.listview3);
        lv.setAdapter(new ItemListManager());

        return rootView;
    }

   public class ItemListManager extends BaseAdapter{

       String items_data[][] = {
               {"R.drawable.image17"},
               {"R.drawable.image18"},
               {"R.drawable.image25"},
               {"R.drawable.image26"},
               {"R.drawable.image27"},
               {"R.drawable.image28"},
               {"R.drawable.image29"},
               {"R.drawable.image30"},
               {"R.drawable.image31"},
               {"R.drawable.image32"}


       };
       int items_images[] = {R.drawable.image17, R.drawable.image18, R.drawable.image25,
               R.drawable.image26, R.drawable.image27, R.drawable.image28, R.drawable.image29,
               R.drawable.image30, R.drawable.image31, R.drawable.image32,};

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
                convertView=LayoutInflater.from(getContext()).inflate(R.layout.layout_school, parent, false);

            }
            ImageView image = (ImageView) convertView.findViewById(R.id.imageView10);
            Button deto = (Button) convertView.findViewById(R.id.button11);
            image.setImageResource(items_images[position]);

            deto.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    AlertDialog.Builder det = new AlertDialog.Builder(getContext());
                    det.setTitle("School Profile");
                    det.setMessage("Name: Federal University of Technology Owerri" + "\n" + "Location: Ihiagwa, Imo State, Nigeria" + "\n" +
                            "Rating: 7/10");
                    det.create().show();
                }
            });

            return convertView;

        }
    }

}
