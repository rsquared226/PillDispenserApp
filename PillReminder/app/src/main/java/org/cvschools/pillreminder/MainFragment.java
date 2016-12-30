package org.cvschools.pillreminder;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.cvschools.pillreminder.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

	private static final String LOG_TAG = "MainFragment";

	public MainFragment() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {

		List<PillInfo> pillInfoList = new ArrayList<>();

		try {
			pillInfoList.add(new PillInfo("Aspirin",
					new SimpleDateFormat("yyyy-MM-dd").parse("2017-02-16"),
					new SimpleDateFormat("yyyy-MM-dd").parse("2018-08-28")));
			pillInfoList.add(new PillInfo("Nitrostat",
					new SimpleDateFormat("yyyy-MM-dd").parse("2017-12-25"),
					new SimpleDateFormat("yyyy-MM-dd").parse("2017-04-9")));
		} catch (ParseException e) {
			Log.e(LOG_TAG, e.getMessage());
			Toast.makeText(getActivity(), "Date parsing went wrong", Toast.LENGTH_SHORT).show();
		}

		PillInfoAdapter pillInfoAdapter = new PillInfoAdapter(getActivity(), pillInfoList);

		View rootView = inflater.inflate(R.layout.fragment_main, container, false);

		ListView listView = (ListView) rootView.findViewById(R.id.listview_pill);
		listView.setAdapter(pillInfoAdapter);

		return rootView;
	}
}
