package org.cvschools.pillreminder;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.cvschools.pillreminder.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


	public MainFragment() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {

		List<PillInfo> pillInfoList = new ArrayList<>();
		pillInfoList.add(new PillInfo("Aspirin", new Date(2017, 5, 3)));

		PillInfoAdapter pillInfoAdapter = new PillInfoAdapter(getActivity(), pillInfoList);

		View rootView = inflater.inflate(R.layout.fragment_main, container, false);

		ListView listView = (ListView) rootView.findViewById(R.id.listview_pill);
		listView.setAdapter(pillInfoAdapter);

		return rootView;
	}
}
