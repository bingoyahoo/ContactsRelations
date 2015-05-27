package com.delvinlow.android.contactsrelations.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    ArrayAdapter<String> mContactsAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] data = {"Anna 1234567", "Belle 1234567", "Christina 1234567",
                "Dawn 1234567", "Elaine 1234567", "Fiona 1234567", "Germaine 1234567"};
        List<String> contacts = new ArrayList<String>(Arrays.asList(data));

        //Creating the adapter
        mContactsAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_contact,
                R.id.list_item_contact_textview,
                contacts);

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_contact);
        listView.setAdapter(mContactsAdapter);

        return rootView;

    }
}
