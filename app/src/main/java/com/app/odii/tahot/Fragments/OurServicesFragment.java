package com.app.odii.tahot.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.app.odii.tahot.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OurServicesFragment extends Fragment {


    public OurServicesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

          final View rootView =  inflater.inflate(R.layout.fragment_our_services, container, false);


        Button taxi = (Button)rootView.findViewById(R.id.button3);
        taxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new TaxiFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.flContent, fragment);
                transaction.addToBackStack(null)
                        .commit();
            }
        });

        ImageView imgTaxi = (ImageView)rootView.findViewById(R.id.imageView4);
        imgTaxi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new TaxiFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.flContent, fragment);
                transaction.addToBackStack(null)
                        .commit();
            }
        });

        Button hotel = (Button)rootView.findViewById(R.id.button4);
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new HotelFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.flContent, fragment);
                transaction.addToBackStack(null)
                        .commit();
            }
        });

        ImageView imgHotel = (ImageView)rootView.findViewById(R.id.imageView5);
        imgHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new HotelFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.flContent, fragment);
                transaction.addToBackStack(null)
                        .commit();
            }
        });


        Button school = (Button)rootView.findViewById(R.id.button6);
        school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new SchoolFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.flContent, fragment);
                transaction.addToBackStack(null)
                        .commit();

            }
        });

        ImageView imgSchool = (ImageView)rootView.findViewById(R.id.imageView);
        imgSchool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new SchoolFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.flContent, fragment);
                transaction.addToBackStack(null)
                        .commit();
            }
        });


        Button tour = (Button)rootView.findViewById(R.id.button7);
        tour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new TouristFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.flContent, fragment);
                transaction.addToBackStack(null)
                        .commit();
            }
        });

        ImageView imgTour = (ImageView)rootView.findViewById(R.id.imageView2);
        imgTour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new TouristFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.flContent, fragment);
                transaction.addToBackStack(null)
                        .commit();
            }
        });


        return rootView;

    }

}
