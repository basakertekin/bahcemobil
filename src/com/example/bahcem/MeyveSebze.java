package com.example.bahcem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class MeyveSebze extends Activity {
	
	private String[] meyveSebze = {"Domates","Biber","Salatalýk","Çilek","Karpuz","Kavun","Ananas"};
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.meyve_sebze);
	        
	     
	        ListView meyveSebzeListesi =(ListView) findViewById(R.id.listView1);
	 
	        
	        ArrayAdapter<String> veriAdaptoru=new ArrayAdapter<String>
	        (this, android.R.layout.simple_list_item_1, android.R.id.text1, meyveSebze);
	 
	      
	        meyveSebzeListesi.setAdapter(veriAdaptoru);
	        
	        Button button1 = (Button) findViewById(R.id.button1);
			button1.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					Intent intent = new Intent (MeyveSebze.this,Bitki.class);
					startActivity(intent);

				}
			});

			ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
			 imageButton5.setOnClickListener(new OnClickListener(){

					@Override
					public void onClick(View v) {
						Intent intent = new Intent (MeyveSebze.this,Arama.class);
						startActivity(intent);

					}
				});
			 
			 ImageButton imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
			 imageButton1.setOnClickListener(new OnClickListener(){

					@Override
					public void onClick(View v) {
						Intent intent = new Intent (MeyveSebze.this,Bitki.class);
						startActivity(intent);

					}
				});

				
	             }
}
