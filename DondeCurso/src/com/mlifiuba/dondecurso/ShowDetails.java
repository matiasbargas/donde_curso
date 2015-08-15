package com.mlifiuba.dondecurso;

import java.util.Collection;
import java.util.Collections;

import com.mlifiuba.dondecurso.api.DetailsModel;
import com.mlifiuba.dondecurso.api.InformationClient;

import android.app.Activity;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ShowDetails extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show_details);
		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction().add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.show_details, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		private TextView detailsView;

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_show_details, container, false);
			detailsView = (TextView) rootView.findViewById(R.id.details);
			return rootView;
		}

		@Override
		public void onActivityCreated(Bundle savedInstanceState) {
			super.onActivityCreated(savedInstanceState);
			new AddStringTask(detailsView, getActivity()).execute();
		}
	}

	public static class AddStringTask extends AsyncTask<Void, Void, Collection<DetailsModel>> {

		private ProgressDialog dialog;
		private Activity activity;
		private TextView detailsTextView;

		public AddStringTask(TextView detailsTextView, Activity activity) {
			super();
			this.detailsTextView = detailsTextView;
			this.activity = activity;
		}

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			dialog = new ProgressDialog(activity);
			dialog.setMessage("Cargando Materia");
			dialog.setIndeterminate(true);
			dialog.setCancelable(false);
			dialog.show();
		}

		@Override
		protected Collection<DetailsModel> doInBackground(Void... unused) {
			String target = activity.getIntent().getStringExtra(Index.SELECTED_ITEM);
			Collection<DetailsModel> deptos = InformationClient.getCursos(target);
			return deptos;
		}

		@Override
		protected void onPostExecute(Collection<DetailsModel> result) {
			StringBuilder builder = new StringBuilder();
			for (DetailsModel detailsModel : result) {
				builder.append(detailsModel.toString()).append("/n");
			}
			detailsTextView.setText(builder.toString());
			dialog.dismiss();
		}
	}
}
