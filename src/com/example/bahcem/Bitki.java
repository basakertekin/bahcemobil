package com.example.bahcem;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class Bitki extends Activity {
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.bitki);
	        
	        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
			 imageButton2.setOnClickListener(new OnClickListener(){

					@Override
					public void onClick(View v) {
						Intent intent = new Intent (Bitki.this,BitkiDetay.class);
						startActivity(intent);

					}
				});
			 

		        Button button1 = (Button) findViewById(R.id.button1);
				button1.setOnClickListener(new OnClickListener(){

					@Override
					public void onClick(View v) {
						Intent intent = new Intent (Bitki.this,Listem.class);
						startActivity(intent);

					}
				});

	             }

}
