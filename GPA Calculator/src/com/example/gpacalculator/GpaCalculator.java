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
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class GpaCalculator extends ActionBarActivity {

	
	private String[] arraySpinner;
	private String[] arrayCreditHours;
	private String[] arrayGrades;
	
	private EditText grade1;
	private EditText grade2;
	private EditText grade3;
	private EditText grade4;
	private EditText grade5;
	private EditText grade6;
	int numOfCourses=6;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gpa_calculator);
		
		
		grade1 = (EditText) findViewById(R.id.editText1);
		grade2 = (EditText) findViewById(R.id.editText2);
		grade3 = (EditText) findViewById(R.id.editText3);
		grade4 = (EditText) findViewById(R.id.editText4);
		grade5 = (EditText) findViewById(R.id.editText5);
		grade6 = (EditText) findViewById(R.id.editText6);
		
        this.arraySpinner = new String[] {
                "1", "2", "3", "4"
            };
        this.arrayCreditHours = new String[] {
                "3", "3", "3", "3", "3", "3"
            };
        this.arrayGrades = new String[] {
                "A", "A", "A", "A", "A", "A"
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
        
        
        Spinner s6 = (Spinner) findViewById(R.id.spinner6);
        ArrayAdapter adapter6 = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        s6.setAdapter(adapter6);
        
        
        
        
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
				
        	
        	@Override
				public void onItemSelected(AdapterView<?> arg0, View arg1,
						int pos, long arg3) {
					Object item = arg0.getItemAtPosition(pos);
						arrayCreditHours[0]=item.toString();
										
				}
				
				public void onNothingSelected(AdapterView<?> parent) {
				  	}


				  
				  
          });
          
          
          
          s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
				@Override
				public void onItemSelected(AdapterView<?> arg0, View arg1,
						int pos, long arg3) {
					Object item = arg0.getItemAtPosition(pos);
						arrayCreditHours[1]=item.toString();
				}
				
				public void onNothingSelected(AdapterView<?> parent) {
				  	}
				  
				  
          });
          
          
          
          s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
				@Override
				public void onItemSelected(AdapterView<?> arg0, View arg1,
						int pos, long arg3) {
					Object item = arg0.getItemAtPosition(pos);
						arrayCreditHours[2]=item.toString();
				}
				
				public void onNothingSelected(AdapterView<?> parent) {
				  	}
				  
				  
          });
          
          
          
          s4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
				@Override
				public void onItemSelected(AdapterView<?> arg0, View arg1,
						int pos, long arg3) {
					Object item = arg0.getItemAtPosition(pos);
						arrayCreditHours[3]=item.toString();
				}
				
				public void onNothingSelected(AdapterView<?> parent) {
				  	}
				  
				  
          });
          
          
          s5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
				@Override
				public void onItemSelected(AdapterView<?> arg0, View arg1,
						int pos, long arg3) {
					Object item = arg0.getItemAtPosition(pos);
						arrayCreditHours[4]=item.toString();
				}
				
				public void onNothingSelected(AdapterView<?> parent) {
				  	}
				  
				  
          });
          
          
          
          s6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
				@Override
				public void onItemSelected(AdapterView<?> arg0, View arg1,
						int pos, long arg3) {
					Object item = arg0.getItemAtPosition(pos);
						arrayCreditHours[5]=item.toString();
				}
				
				public void onNothingSelected(AdapterView<?> parent) {
				  	}
				  
				  
          });
          
          
          
          
          
          
          
          Button calculateGpa = (Button) findViewById(R.id.calculateGpa);
          
          calculateGpa.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
						
					for(int i=0;i<numOfCourses;i++){
//						Toast.makeText(getApplicationContext(), "Calculating GPA ", 7).show();
						Toast.makeText(getApplicationContext(), "Grade at index "+i+" is "+ arrayCreditHours[i], 7).show();
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
