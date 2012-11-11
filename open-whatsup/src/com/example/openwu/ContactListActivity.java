package com.example.openwu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ContactListActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactlist);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.contactlist, menu);
        return true;
    }
}
