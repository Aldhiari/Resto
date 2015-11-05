package com.resto.aldhi;




import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.KeyEvent;

public class Menu1 extends Activity {
	
	Button btn1;
	Button btn2;
	Button btn_kaluar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu1);
		addListenerOnButton();
	}
		public void addListenerOnButton(){
		final Context context = this;	
		
		btn1 = (Button)findViewById(R.id.food);
		btn1.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0){
				Intent intent = new Intent(context, menu2.class);
				startActivity(intent);
			}
		});
			
		
		btn2 = (Button)findViewById(R.id.drinkk);
		btn2.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0){
				Intent intent = new Intent(context, Menu3.class);
				startActivity(intent);
			}
		});
		
				
		
		Button btn_kaluar = (Button) findViewById(R.id.btkeluar);
        btn_kaluar.setOnClickListener(new View.OnClickListener() {
   
   @Override
   
   public void onClick(View view) {
   
    close();
   
   
   }
   
   

private void close() {
	// TODO Auto-generated method stub
	
}
   });
		
		
		}
		
		@Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        getMenuInflater().inflate(R.menu.main, menu);
	        return true;
	    }

	       public void close(){

	           AlertDialog.Builder builder = new AlertDialog.Builder(this);
	           builder.setMessage("Apakah Anda Benar-Benar ingin keluar?")
	           .setCancelable(false)
	           .setPositiveButton("Ya",
	           new DialogInterface.OnClickListener() {
	           public void onClick(DialogInterface dialog,
	           int id) {
	            Menu1.this.finish();
	           }
	           })
	           .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
	           public void onClick(DialogInterface dialog,
	           int id) {
	           dialog.cancel();

	           }
	           }).show();
	           } 
	          
	          
	          public boolean onKeyDown(int keyCode, KeyEvent event) {
	              if (keyCode == KeyEvent.KEYCODE_BACK) {
	               close();
	            
	              }   
	              return super.onKeyDown(keyCode, event);
	           }
	           
	

}
