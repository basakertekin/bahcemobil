package com.example.bahcem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ListView;

public class Listem extends Activity{
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.listem);
	        ListView lw1 = (ListView) findViewById(R.id.listView1);
	        lw1.setOnItemClickListener(null);
	      
	        ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton1);
			 imageButton5.setOnClickListener(new OnClickListener(){

				@Override
					public void onClick(View v) {
						Intent intent = new Intent (Listem.this,Arama.class);
						startActivity(intent);

					}
				});

	             }

}
