package com.example.gpacalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class GpaCalculator extends ActionBarActivity {

	
	private String[] arraySpinner;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gpa_calculator);
		
		
        this.arraySpinner = new String[] {
                "A", "B", "C", "D", "F"
            };
		
        Spinner s1 = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter adapter = new ArrayAdapter(this,
            android.R.layout.simple_spinner_item, arraySpinner);
        s1.setAdapter(adapter);
        
        
        Spinner s2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter adapter2 = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        s2.setAdapter(adapter2);
        
        
        Spinner s3 = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter adapter3 = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        s3.setAdapter(adapter3);
        
        
        Spinner s4 = (Spinner) findViewById(R.id.spinner4);
        ArrayAdapter adapter4 = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        s4.setAdapter(adapter4);
        
        
        Spinner s5 = (Spinner) findViewById(R.id.spinner5);
        ArrayAdapter adapter5 = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        s5.setAdapter(adapter5);
        
        
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gpa_calculator, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
