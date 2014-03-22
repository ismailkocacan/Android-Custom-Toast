package com.myproject.usefulclass;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showStandartToastMessage(View sender)
    {
    	Toast.makeText(this, "Bu standart bir toast mesajýdýr.", Toast.LENGTH_SHORT).show();
    }
    
    
    public void showSuccessToastMessage(View sender)
    {
      ToastHelper.showSuccessToast(this, "Bu baþarýlý bir toast mesajýdýr");
    }
    
    
    public void showFailToastMessage(View sender)
    {
    	ToastHelper.showFailToast(this, "Bu baþarýsýz bir toast mesajýdýr.");
    }
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
