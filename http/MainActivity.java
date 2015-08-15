package com.billy.pruebajson;

import java.io.IOException;
import java.io.InputStream;

import com.billy.pruebajson.R.id;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView tv;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(id.texto);
        
    	if (hayConeccion()){
    		tv.setText("Hay conección!");
    		try {
    			// Version.
    			get("http://www.mli-fiuba.com.ar/eqac/?v=1.0&ds=1");
    		} catch (IOException e) {
    			Log.d("pifiada", "No se encontró la página...");
    			e.printStackTrace();
    		}
    	} else {
    		tv.setText("No hay conección.");
    	}
		
    }
    
    // Método del onClick del botón.
    public boolean chequearConeccion(View v){
    	return hayConeccion();
    }
    
    public boolean hayConeccion(){
        // Recordar que para haber usado esto hubo que dar permisos.
    	ConnectivityManager cMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
    	NetworkInfo info = cMgr.getActiveNetworkInfo();
    	return info != null && info.isConnected();
    }
    
    public InputStream get(String sURL) throws IOException {
    	DownloadWebpageTask task = new DownloadWebpageTask();
    	task.execute(sURL);
    	return task.getIn();
    }
}