package org.cvschools.pillreminder;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

/**
 * Created by Rahul on 12/29/2016.
 */

public class PillInfoAdapter extends ArrayAdapter<PillInfo> {

	public PillInfoAdapter(Activity context, List<PillInfo> pillInfoList) {
		super(context, 0, pillInfoList);
	}

	@NonNull
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		PillInfo pillInfo = getItem(position);

		// If this is a new View object we're getting, then inflate the layout.
		// If not, this view already has the layout inflated from a previous call to getView,
		if (convertView == null) {
			convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
		}

		TextView pillName = (TextView) convertView.findViewById(R.id.text_pill_name);
		TextView date = (TextView) convertView.findViewById(R.id.text_date);
		TextView expirationDate = (TextView) convertView.findViewById(R.id.text_expiration_date);

		pillName.setText(pillInfo.getName());
		date.setText(new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(pillInfo.getDate()));
		expirationDate.setText(new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(pillInfo.getExpirationDate()));

		return convertView;
	}
}
