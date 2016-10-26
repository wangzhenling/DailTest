package com.example.dailtest;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	EditText editText;
	Button btnCall;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		editText=(EditText) this.findViewById(R.id.etPhone);
		btnCall=(Button) this.findViewById(R.id.btnCall);
		
		btnCall.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Uri uri=Uri.parse("tel:"+editText.getText().toString());
				Intent intent=new Intent(Intent.ACTION_CALL,uri);
				MainActivity.this.startActivity(intent);
				
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
