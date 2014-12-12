package com.example.gpacalculator;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
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


public class MainActivity extends ActionBarActivity {

	
	
	private String[] arraySpinner;
	private String[] arrayGPA;
	private String courses="1";
	private String gpaOutOf = "4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        
        this.arraySpinner = new String[] {
                "1", "2", "3", "4", "5", "6", "7", "8"
            };
        
        this.arrayGPA = new String[] {
                "4", "5"
            };
        
        
        
        Spinner selectCourses = (Spinner) findViewById(R.id.selectCourses);
        ArrayAdapter adapter = new ArrayAdapter(this,
            android.R.layout.simple_spinner_item, arraySpinner);
        selectCourses.setAdapter(adapter);
        
        Spinner selectGPA = (Spinner) findViewById(R.id.selectGPA);
        ArrayAdapter adapter2 = new ArrayAdapter(this,
            android.R.layout.simple_spinner_item, arrayGPA);
        selectGPA.setAdapter(adapter2);
        
        
        selectCourses.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
				@Override
				public void onItemSelected(AdapterView<?> arg0, View arg1,
						int pos, long arg3) {
					Object item = arg0.getItemAtPosition(pos);
					courses = item.toString();
						
				}
				
				public void onNothingSelected(AdapterView<?> parent) {
				  	}
				  
				  
         });
        
        
        
        
        selectGPA.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
				@Override
				public void onItemSelected(AdapterView<?> arg0, View arg1,
						int pos, long arg3) {
					Object item = arg0.getItemAtPosition(pos);
					gpaOutOf = item.toString();
						
				}
				
				public void onNothingSelected(AdapterView<?> parent) {
				  	}
				  
				  
         });
        
        
        Button startCalculation = (Button) findViewById(R.id.startAppButton);
        startCalculation.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
					
				
				Intent intent = new Intent(MainActivity.this,GpaCalculator.class);
				intent.putExtra("courses",courses);
				intent.putExtra("gpa",gpaOutOf);
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
