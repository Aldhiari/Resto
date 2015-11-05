package com.resto.aldhi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;




public class Menu3 extends Activity {
	
	Button btn1;
	int angka= 0;
	int angka1= 0;
	int angka2= 0;
	int angka3= 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu3);
		addListenerOnButton();
	}
		public void addListenerOnButton(){
		final Context context = this;	
		
		btn1 = (Button)findViewById(R.id.Back);
		btn1.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0){
				Intent intent = new Intent(context, Menu1.class);
				startActivity(intent);
			}
		});
			
		
		btn1 = (Button)findViewById(R.id.Daftar2);
		btn1.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0){
				Intent intent = new Intent(context, Pesanan.class);
				startActivity(intent);
			}
		});
			
		Button plus = (Button) findViewById(R.id.plus);
        Button negatif = (Button) findViewById(R.id.negatif);
        final TextView Angkaa = (TextView) findViewById(R.id.Angkaa);
        
        plus.setOnClickListener(new View.OnClickListener() {
	       	 
            @Override
            public void onClick(View v) {
            	angka = angka + 1;
            	Angkaa.setText(String.valueOf(angka));
            }
        });
        
        negatif.setOnClickListener(new View.OnClickListener() {
	       	 
            @Override
            public void onClick(View v) {
            	
            	Angkaa.setText(String.valueOf(angka));
            	
            	if (!Angkaa.getText().toString().equals("0")) {
            		angka = angka - 1;
            	}

            }
        });
		
        
		
        Button plus1 = (Button) findViewById(R.id.plus1);
        Button negatif1 = (Button) findViewById(R.id.negatif1);
        final TextView Angkaa1 = (TextView) findViewById(R.id.Angkaa1);
        
        plus1.setOnClickListener(new View.OnClickListener() {
	       	 
            @Override
            public void onClick(View v) {
            	angka1 = angka1 + 1;
            	Angkaa1.setText(String.valueOf(angka1));
            }
        });
        
        negatif1.setOnClickListener(new View.OnClickListener() {
	       	 
            @Override
            public void onClick(View v) {
            	
            	Angkaa1.setText(String.valueOf(angka1));
            	
            	if (!Angkaa1.getText().toString().equals("0")) {
            		angka1 = angka1 - 1;
            	}

            }
        });
		
        Button plus2 = (Button) findViewById(R.id.plus2);
        Button negatif2 = (Button) findViewById(R.id.negatif2);
        final TextView Angkaa2 = (TextView) findViewById(R.id.Angkaa2);
        
        plus2.setOnClickListener(new View.OnClickListener() {
	       	 
            @Override
            public void onClick(View v) {
            	angka2 = angka2 + 1;
            	Angkaa2.setText(String.valueOf(angka2));
            }
        });
        
        negatif2.setOnClickListener(new View.OnClickListener() {
	       	 
            @Override
            public void onClick(View v) {
            	
            	Angkaa2.setText(String.valueOf(angka2));
            	
            	if (!Angkaa2.getText().toString().equals("0")) {
            		angka2 = angka2 - 1;
            	}

            }
        });
		
        
        Button plus3 = (Button) findViewById(R.id.plus3);
        Button negatif3 = (Button) findViewById(R.id.negatif3);
        final TextView Angkaa3 = (TextView) findViewById(R.id.Angkaa3);
        
        plus3.setOnClickListener(new View.OnClickListener() {
	       	 
            @Override
            public void onClick(View v) {
            	angka3 = angka3 + 1;
            	Angkaa3.setText(String.valueOf(angka3));
            }
        });
        
        negatif3.setOnClickListener(new View.OnClickListener() {
	       	 
            @Override
            public void onClick(View v) {
            	
            	Angkaa3.setText(String.valueOf(angka3));
            	
            	if (!Angkaa3.getText().toString().equals("0")) {
            		angka3 = angka3 - 1;
            	}

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
