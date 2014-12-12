package com.example.gpacalculator;

import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
	private EditText grade7;
	private EditText grade8;
	int numOfCourses=0;
	private int gpaOutOf=4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gpa_calculator);
		
		
		
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			
		     
		     numOfCourses = Integer.parseInt(extras.getString("courses"));
		     gpaOutOf = Integer.parseInt(extras.getString("gpa"));
		}
		
		
		grade1 = (EditText) findViewById(R.id.editText1);
		grade2 = (EditText) findViewById(R.id.editText2);
		grade3 = (EditText) findViewById(R.id.editText3);
		grade4 = (EditText) findViewById(R.id.editText4);
		grade5 = (EditText) findViewById(R.id.editText5);
		grade6 = (EditText) findViewById(R.id.editText6);
		grade7 = (EditText) findViewById(R.id.editText7);
		grade8 = (EditText) findViewById(R.id.editText8);
		
		
        this.arraySpinner = new String[] {
                "1", "2", "3", "4"
            };
        this.arrayCreditHours = new String[] {
                "3", "3", "3", "3", "3", "3", "3", "3"
            };
        
        this.arrayGrades = new String[] {
                "A", "A", "A", "A", "A", "A", "A", "A"
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
        
        
        Spinner s7 = (Spinner) findViewById(R.id.spinner7);
        ArrayAdapter adapter7 = new ArrayAdapter(this,
        android.R.layout.simple_spinner_item, arraySpinner);
        s7.setAdapter(adapter7);
        
        Spinner s8 = (Spinner) findViewById(R.id.spinner8);
        ArrayAdapter adapter8 = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        s8.setAdapter(adapter8);
        
        
        
       

        
        
        grade1.setVisibility(View.INVISIBLE);
        grade2.setVisibility(View.INVISIBLE);
        grade3.setVisibility(View.INVISIBLE);
        grade4.setVisibility(View.INVISIBLE);
        grade5.setVisibility(View.INVISIBLE);
        grade6.setVisibility(View.INVISIBLE);
        grade7.setVisibility(View.INVISIBLE);
        grade8.setVisibility(View.INVISIBLE);
        
        s1.setVisibility(View.INVISIBLE);
        s2.setVisibility(View.INVISIBLE);
        s3.setVisibility(View.INVISIBLE);
        s4.setVisibility(View.INVISIBLE);
        s5.setVisibility(View.INVISIBLE);
        s6.setVisibility(View.INVISIBLE);
        s7.setVisibility(View.INVISIBLE);
        s8.setVisibility(View.INVISIBLE);
        
        
        for(int i=1;i<=numOfCourses;i++){
        	
        	if(i==1){
        		 grade1.setVisibility(View.VISIBLE);
        		 s1.setVisibility(View.VISIBLE);
        	}
        	if(i==2){
       		 grade2.setVisibility(View.VISIBLE);
       		 s2.setVisibility(View.VISIBLE);
       	}
        	if(i==3){
       		 grade3.setVisibility(View.VISIBLE);
       		 s3.setVisibility(View.VISIBLE);
       	}
        	if(i==4){
       		 grade4.setVisibility(View.VISIBLE);
       		 s4.setVisibility(View.VISIBLE);
       	}
        	if(i==5){
       		 grade5.setVisibility(View.VISIBLE);
       		 s5.setVisibility(View.VISIBLE);
       	}
        	if(i==6){
       		 grade6.setVisibility(View.VISIBLE);
       		 s6.setVisibility(View.VISIBLE);
       	}
        	
        	if(i==7){
         		 grade7.setVisibility(View.VISIBLE);
         		 s7.setVisibility(View.VISIBLE);
         	}
       	
       	if(i==8){
         		 grade8.setVisibility(View.VISIBLE);
         		 s8.setVisibility(View.VISIBLE);
         	}
        	
        	
        }
        
        
        
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
          
          
          s7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
				@Override
				public void onItemSelected(AdapterView<?> arg0, View arg1,
						int pos, long arg3) {
					Object item = arg0.getItemAtPosition(pos);
						arrayCreditHours[6]=item.toString();
				}
				
				public void onNothingSelected(AdapterView<?> parent) {
				  	}
				  
				  
          });
          
          s8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
				@Override
				public void onItemSelected(AdapterView<?> arg0, View arg1,
						int pos, long arg3) {
					Object item = arg0.getItemAtPosition(pos);
						arrayCreditHours[7]=item.toString();
				}
				
				public void onNothingSelected(AdapterView<?> parent) {
				  	}
				  
				  
          });
          
          
          
          
          
          Button calculateGpa = (Button) findViewById(R.id.calculateGpa);
          
          calculateGpa.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
						
					

						
					
					{
						// it means we added our grades 
						
						
						
						double totalCredits=0;
						for(int i=0;i<numOfCourses;i++){
								totalCredits += Integer.parseInt(arrayCreditHours[i]); 
						}
						
						
						arrayGrades[0]= grade1.getText().toString();
						arrayGrades[1]= grade2.getText().toString();
						arrayGrades[2]= grade3.getText().toString();
						arrayGrades[3]= grade4.getText().toString();
						arrayGrades[4]= grade5.getText().toString();
						arrayGrades[5]= grade6.getText().toString();
						arrayGrades[6]= grade7.getText().toString();
						arrayGrades[7]= grade8.getText().toString();
						
						Toast.makeText(getApplicationContext(), "Total Credits "+ totalCredits, 20).show();
						double totalEarned=0.0;
						double forThisCourse=0.0;
						
						for(int i=0;i<numOfCourses;i++){
							
							if(gpaOutOf==4){
							forThisCourse = getEarnedPoints4(arrayGrades[i]) * (Integer.parseInt(arrayCreditHours[i]));
							}else{
								forThisCourse = getEarnedPoints5(arrayGrades[i]) * (Integer.parseInt(arrayCreditHours[i]));
							}
							totalEarned += forThisCourse;
							
						}
						
						
						showDialog((totalEarned/totalCredits));
						
						
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
	
	
	public double getEarnedPoints4(String grade){
		if(grade.equals("A") || grade.equals("a") ){
			return 4.0;
		}
		else if(grade.equals("A-") || grade.equals("a-") ){
			return 3.7;
		}
		else if(grade.equals("B+") || grade.equals("b+") ){
			return 3.3;
		}
		else if(grade.equals("B") || grade.equals("b") ){
			return 3.0;
		}
		else if(grade.equals("B-") || grade.equals("b-") ){
			return 2.7;
		}
		else if(grade.equals("C+") || grade.equals("c+") ){
			return 2.3;
		}
		else if(grade.equals("C") || grade.equals("c") ){
			return 2.0;
		}
		else if(grade.equals("C-") || grade.equals("c-") ){
			return 1.7;
		}
		else if(grade.equals("D+") || grade.equals("d+") ){
			return 1.3;
		}
		else if(grade.equals("D") || grade.equals("d") ){
			return 1.0;
		}
		else if(grade.equals("D-") || grade.equals("d-") ){
			return 0.7;
		}
		else if(grade.equals("F") || grade.equals("f") ){
			return 0.0;
		}else{
		return 0.0;
		}
		
	}

	
	
public double getEarnedPoints5(String grade){
		
		if(grade.equals("A") || grade.equals("a") ){
			return 5.0;
		}
		else if(grade.equals("A-") || grade.equals("a-") ){
			return 4.7;
		}
		else if(grade.equals("B+") || grade.equals("b+") ){
			return 4.3;
		}
		else if(grade.equals("B") || grade.equals("b") ){
			return 4.0;
		}
		else if(grade.equals("B-") || grade.equals("b-") ){
			return 3.7;
		}
		else if(grade.equals("C+") || grade.equals("c+") ){
			return 3.3;
		}
		else if(grade.equals("C") || grade.equals("c") ){
			return 3.0;
		}
		else if(grade.equals("C-") || grade.equals("c-") ){
			return 2.7;
		}
		else if(grade.equals("D+") || grade.equals("d+") ){
			return 2.3;
		}
		else if(grade.equals("D") || grade.equals("d") ){
			return 2.0;
		}
		else if(grade.equals("D-") || grade.equals("d-") ){
			return 1.7;
		}
		else if(grade.equals("F") || grade.equals("f") ){
			return 0.0;
		}else{
		return 0.0;
		}
	}
	
	
	
	public void showDialog(double gpa){
		
		AlertDialog.Builder builder = new AlertDialog.Builder(GpaCalculator.this);
        builder.setMessage("You GPA is "+ gpa)
               .setPositiveButton("Share it", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
                       // FIRE ZE MISSILES!
             	      Intent shareIntent = new Intent();
            	      shareIntent.setAction(Intent.ACTION_SEND);
            	      shareIntent.setType("text/plain");
            	      shareIntent.putExtra(Intent.EXTRA_TEXT, "Share your Gpa ");
            	      startActivity(Intent.createChooser(shareIntent, "From GPA calculator"));
                   }
               })
               .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
                       // User cancelled the dialog
                   }
               });
        // Create the AlertDialog object and return it
        Dialog d= builder.create();
        
        
        d.show();
        
        
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
