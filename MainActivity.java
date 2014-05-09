package com.example.calcemi;

import android.os.Bundle;
import android.app.Activity;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Spinner;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		EditText P = (EditText)findViewById(R.id.editText1);
		//EditText N = (EditText)findViewById(R.id.editText2);
		Spinner N=(Spinner)findViewById(R.id.spinner1);
		EditText RI = (EditText)findViewById(R.id.editText3);
		
		Button calcme = (Button)findViewById(R.id.button1);
		
		calcme.setOnClickListener(new Button.OnClickListener () {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				EditText P = (EditText)findViewById(R.id.editText1);
				//EditText N = (EditText)findViewById(R.id.editText2);
				Spinner N=(Spinner)findViewById(R.id.spinner1);
				EditText RI = (EditText)findViewById(R.id.editText3);
				
				int Pvalue, Nvalue, RIvalue, result;
				
				Pvalue = Integer.valueOf(P.getText().toString());
				//Nvalue = Integer.valueOf(N.getText().toString());
				Nvalue = Integer.valueOf(N.getSelectedItem().toString());
				RIvalue = Integer.valueOf(RI.getText().toString());
				
				result = (Pvalue * Nvalue * RIvalue) / 100;
				
				//System.out.println(result);
				
				Toast.makeText(MainActivity.this,"You have to pay : " + result,Toast.LENGTH_LONG).show();
			}
		
		}
		);
		}
		

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
