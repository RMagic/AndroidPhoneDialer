package com.RMagic.AndroidPhoneDialer;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;

public class AndroidPhoneDialerActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Intent dialIntent = new
        		Intent(Intent.ACTION_DIAL,Uri.parse("tel:5551212"));
        dialIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(dialIntent);
    }
}