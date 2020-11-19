package com.Telephony;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    

	Button INTENT1,INTENT2,INTENT3,INTENT4,INTENT5;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		
		//intent phone1
		
		INTENT1 = (Button)findViewById(R.id.intent1);
        //implement Onclick event for Explicit Intent
        INTENT1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent = new  Intent(getBaseContext(), SecondActivity.class);
					startActivity(intent);
				}
			});
		
	
		//intent phone2
	
	INTENT2 = (Button)findViewById(R.id.intent2);
	INTENT2.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View v) {
		Intent intent = new  Intent(getBaseContext(), ThirdActivity.class);
		startActivity(intent);
	}
	});
	
	
		//intent phone3
		INTENT3 = (Button)findViewById(R.id.intent3);
		INTENT3.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent = new  Intent(getBaseContext(), FourthActivity.class);
					startActivity(intent);
				}
			});
			
		//intent phone4
			
		INTENT4 = (Button)findViewById(R.id.intent4);
		INTENT4.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent = new  Intent(getBaseContext(), FifthActivity.class);
					startActivity(intent);
				}
			});
		
			
		//intent phone5
		
		INTENT5 = (Button)findViewById(R.id.intent5);
		INTENT5.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent = new  Intent(getBaseContext(), SixActivity.class);
					startActivity(intent);
				}
			});
		
	
			
	//phone1
	}
	public void call(View view) {
		int permissionCheck =
			ContextCompat.checkSelfPermission(this, 
											  Manifest.permission.CALL_PHONE);
		if (permissionCheck== 
			PackageManager.PERMISSION_GRANTED){
			
			Intent callIntent = new 
				Intent(Intent.ACTION_CALL);

			callIntent.setData(Uri.parse("tel:Dumlao"+"(09951438195)"));

			startActivity(callIntent);
		}
		else {
			ActivityCompat.requestPermissions(this, 
											  new String[]{Manifest.permission.CALL_PHONE}, 
											  0);
		}
		
		
		//phone2

	}
	public void call1(View view) {
		int permissionCheck =
			ContextCompat.checkSelfPermission(this, 
											  Manifest.permission.CALL_PHONE);
		if (permissionCheck== 
			PackageManager.PERMISSION_GRANTED){

			Intent callIntent = new 
				Intent(Intent.ACTION_CALL);

			callIntent.setData(Uri.parse("tel:Dulay"+"(09657824785)"));

			startActivity(callIntent);
		}
		else {
			ActivityCompat.requestPermissions(this, 
											  new String[]{Manifest.permission.CALL_PHONE}, 
											  0);

	}
	
	}
	
	//phone3
	
	public void call2(View view) {
		int permissionCheck =
			ContextCompat.checkSelfPermission(this, 
											  Manifest.permission.CALL_PHONE);
		if (permissionCheck== 
			PackageManager.PERMISSION_GRANTED){

			Intent callIntent = new 
				Intent(Intent.ACTION_CALL);

			callIntent.setData(Uri.parse("tel:Cargo"+"(09271671581)"));

			startActivity(callIntent);
		}
		else {
			ActivityCompat.requestPermissions(this, 
											  new String[]{Manifest.permission.CALL_PHONE}, 
											  0);

		}
		}
		
		//phone4
		
	public void call3(View view) {
		int permissionCheck =
			ContextCompat.checkSelfPermission(this, 
											  Manifest.permission.CALL_PHONE);
		if (permissionCheck== 
			PackageManager.PERMISSION_GRANTED){

			Intent callIntent = new 
				Intent(Intent.ACTION_CALL);

			callIntent.setData(Uri.parse("tel:Mama"+"(09102821468)"));

			startActivity(callIntent);
		}
		else {
			ActivityCompat.requestPermissions(this, 
											  new String[]{Manifest.permission.CALL_PHONE}, 
											  0);

		}
		
	}
	
	
	//phone5
	
	public void call4(View view) {
		int permissionCheck =
			ContextCompat.checkSelfPermission(this, 
											  Manifest.permission.CALL_PHONE);
		if (permissionCheck== 
			PackageManager.PERMISSION_GRANTED){

			Intent callIntent = new 
				Intent(Intent.ACTION_CALL);

			callIntent.setData(Uri.parse("tel:Ate"+"(09222375262)"));

			startActivity(callIntent);
		}
		else {
			ActivityCompat.requestPermissions(this, 
											  new String[]{Manifest.permission.CALL_PHONE}, 
											  0);

		}
	
		
	
	}
		}
		
   
