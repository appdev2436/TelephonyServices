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

public class FourthActivity extends Activity {

	EditText editPhone1, editMessage1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone3);

		editPhone1= findViewById(R.id.phone3);
		editMessage1= findViewById(R.id.editMessage);
		editPhone1.setText("Cargo(09271671581)");

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
		phone= editPhone1.getText().toString().trim();
		message= editMessage1.getText().toString().trim();
		SmsManager smsManager= 
			SmsManager.getDefault();

		smsManager.sendTextMessage(phone, null, 
								   message, null, null);
		Toast.makeText(this, "Message Sent", 
					   Toast.LENGTH_SHORT).show();
	}
}
