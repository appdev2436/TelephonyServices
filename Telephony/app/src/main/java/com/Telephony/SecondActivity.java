package com.Telephony;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class SecondActivity extends Activity {
	
	EditText editPhone, editMessage;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone1);
		
		editPhone= findViewById(R.id.phone1);
		editMessage= findViewById(R.id.editMessage);
		editPhone.setText("Dumlao(09951438195)");
		
		}
	public void btnSend(View view) {
		int permissionCheck = 
			ContextCompat.checkSelfPermission(this, 
											  Manifest.permission.SEND_SMS);
		if (permissionCheck== 
			PackageManager.PERMISSION_GRANTED){
			sendMessage();
		}else {
			ActivityCompat.requestPermissions(this, new 
											  String[]{Manifest.permission.SEND_SMS}, 0);
		}
		}
	private void sendMessage() {

		String phone, message;
		phone= editPhone.getText().toString().trim();
		message= editMessage.getText().toString().trim();
		SmsManager smsManager= 
			SmsManager.getDefault();

		smsManager.sendTextMessage(phone, null, 
								   message, null, null);
		Toast.makeText(this, "Message Sent", 
					   Toast.LENGTH_SHORT).show();
	}
	}
