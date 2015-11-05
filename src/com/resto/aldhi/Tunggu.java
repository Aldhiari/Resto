package com.resto.aldhi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class Tunggu extends Activity {
	
	Button btn1;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tunggu);
		addListenerOnButton();
	}
		public void addListenerOnButton(){
		final Context context = this;	
		
		btn1 = (Button)findViewById(R.id.buttonclose);
		btn1.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0){
				Intent intent = new Intent(context, Menu1.class);
				startActivity(intent);
			}
		});
			
			
			}
		
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
