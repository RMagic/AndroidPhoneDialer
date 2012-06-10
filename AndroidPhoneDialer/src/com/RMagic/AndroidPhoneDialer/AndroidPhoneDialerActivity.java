package com.RMagic.AndroidPhoneDialer;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class AndroidPhoneDialerActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final Button callButton = (Button) findViewById(R.id.callButton);
        callButton.setOnClickListener(new Button.OnClickListener() {
        	public void onClick(View v) {
        		Intent callIntent = new
        				Intent(Intent.ACTION_CALL,Uri.parse("tel:5551212"));
        		callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        		startActivity(callIntent);
        	}
        });
    }
}