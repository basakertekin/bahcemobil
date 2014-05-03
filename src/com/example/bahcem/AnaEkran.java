package com.example.bahcem;


import com.apigee.sdk.ApigeeClient;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.apigee.sdk.data.client.DataClient; 
import com.apigee.sdk.data.client.callbacks.ApiResponseCallback; 
import com.apigee.sdk.data.client.response.ApiResponse; 

public class AnaEkran extends Activity {

	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.ana_ekran);
	     //github deneme   
	        String MEYVESEBZE = "meyve_sebze";
	        String SUSBITKILERI ="sus_bitkileri";
	     
	        ApigeeClient apigeeClient = new ApigeeClient(MEYVESEBZE,SUSBITKILERI,this.getBaseContext());
	    
	        girisApp = (UsergridApplication) getApplication();
	        girisApp.setApigeeClient(apigeeClient);
	    
	        Button button1 = (Button) findViewById(R.id.button1);
			button1.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					Intent intent = new Intent (AnaEkran.this,SusBitkileri.class);
					startActivity(intent);

				}
			});
			
			Button button2 = (Button) findViewById(R.id.button2);
			button2.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					Intent intent = new Intent (AnaEkran.this,MeyveSebze.class);
					startActivity(intent);

				}
			});
	        

	             }
	    }


