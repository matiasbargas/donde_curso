package com.billy.pruebajson;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import android.os.AsyncTask;
import android.util.Log;

// Ingresa string, devuelve un Input Stream. El void es sobre el progreso. No hacemos nada al respecto.
public class DownloadWebpageTask extends AsyncTask<String,Void,InputStream> {
	
	// El in que se devuelve cuando hubo error. Después veo de mejorarlo.
	InputStream def = null;
	// El resultado.
	InputStream ret = null;
	
	// La parte de la Task que se encarga del proceso y devuelve un resultado.
	@Override
	protected InputStream doInBackground(String... urls) {
		try {
			return downloadURL(urls[0]);
		} catch (IOException e) {
			Log.d("pifiada",e.getMessage());
		}
		return def;
	}
	
	// Lo que se hace con el resultado una vez que termina la Task.
	@Override
	protected void onPostExecute(InputStream resultado){
		ret = resultado;
	}
	
	public InputStream downloadURL(String sURL) throws IOException {
		Log.d("debug","hola");
		URL url;
		InputStream in = null;
	
		try {
			url = new URL(sURL);
		} catch (MalformedURLException e) {
			Log.d("pifiada", "La URL está mal hecha.");
			e.printStackTrace();
			return def;
		}
		Log.d("debug","paso url");
		HttpURLConnection conn;
		try {
			conn = (HttpURLConnection) url.openConnection();
		} catch (IOException e) {
			Log.d("pifiada","La conección falló");
			e.printStackTrace();
			return def;
		}
		Log.d("debug","paso conn");
		
		try {
			in = new BufferedInputStream(conn.getInputStream());
			return in;
		} finally {
			// cierres.
			conn.disconnect();
			if (in != null){
				in.close();
			}
		}
	}
	
	public InputStream getIn(){
		return ret;
	}
}
