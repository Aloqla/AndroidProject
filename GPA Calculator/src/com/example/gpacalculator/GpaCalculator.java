package com.example.gpacalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class GpaCalculator extends ActionBarActivity {

	
	private String[] arraySpinner;
	private String[] arrayGrades;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gpa_calculator);
		
		
        this.arraySpinner = new String[] {
                "A", "B", "C", "D", "F"
            };
        this.arrayGrades = new String[] {
                "A", "A", "A", "A", "A"
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
        
        
        
        
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
				
        	
        	@Override
				public void onItemSelected(AdapterView<?> arg0, View arg1,
						int pos, long arg3) {
					Object item = arg0.getItemAtPosition(pos);
						arrayGrades[0]=item.toString();
						Toast.makeText(getApplicationContext(), "The selected grade is "+ item.toString()+" At index "+pos, 10).show();
						
				}
				
				public void onNothingSelected(AdapterView<?> parent) {
				  	}


				  
				  
          });
          
          
          
          s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
				@Override
				public void onItemSelected(AdapterView<?> arg0, View arg1,
						int pos, long arg3) {
					Object item = arg0.getItemAtPosition(pos);
						arrayGrades[1]=item.toString();
						Toast.makeText(getApplicationContext(), "The selected grade is "+ item.toString(), 10).show();
				}
				
				public void onNothingSelected(AdapterView<?> parent) {
				  	}
				  
				  
          });
          
          
          
          s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
				@Override
				public void onItemSelected(AdapterView<?> arg0, View arg1,
						int pos, long arg3) {
					Object item = arg0.getItemAtPosition(pos);
						arrayGrades[2]=item.toString();
						Toast.makeText(getApplicationContext(), "The selected grade is "+ item.toString(), 10).show();
				}
				
				public void onNothingSelected(AdapterView<?> parent) {
				  	}
				  
				  
          });
          
          
          
          s4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
				@Override
				public void onItemSelected(AdapterView<?> arg0, View arg1,
						int pos, long arg3) {
					Object item = arg0.getItemAtPosition(pos);
						arrayGrades[3]=item.toString();
						Toast.makeText(getApplicationContext(), "The selected grade is "+ item.toString(), 10).show();
				}
				
				public void onNothingSelected(AdapterView<?> parent) {
				  	}
				  
				  
          });
          
          
          s5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
				@Override
				public void onItemSelected(AdapterView<?> arg0, View arg1,
						int pos, long arg3) {
					Object item = arg0.getItemAtPosition(pos);
						arrayGrades[4]=item.toString();
						Toast.makeText(getApplicationContext(), "The selected grade is "+ item.toString(), 10).show();
				}
				
				public void onNothingSelected(AdapterView<?> parent) {
				  	}
				  
				  
          });
          
          
          
          
          Button calculateGpa = (Button) findViewById(R.id.calculateGpa);
          
          calculateGpa.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
						
					for(int i=0;i<5;i++){
//						Toast.makeText(getApplicationContext(), "Calculating GPA ", 7).show();
						Toast.makeText(getApplicationContext(), "Grade at index "+i+" is "+ arrayGrades[i], 7).show();
					}
					
				}
			});
          
        
        
		
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
