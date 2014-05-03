package com.example.bahcem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class SusBitkileri extends Activity {
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.sus_bitkileri);
	        
	        ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
			 imageButton5.setOnClickListener(new OnClickListener(){

					@Override
					public void onClick(View v) {
						Intent intent = new Intent (SusBitkileri.this,Arama.class);
						startActivity(intent);

					}
				});

	             }

}
