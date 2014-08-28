package com.adam.app.tasktest1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

	private static final String TAG = "xxxx";
	private static final String Activity_NAME = MainActivity.class.getSimpleName();
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainact);
		
		int taskId = this.getTaskId();
		
		Log.i(TAG, "["+Activity_NAME+"] id: " + taskId);


	}

    public void onOpenSecActivity(View v) {
    	
    	Intent intent = new Intent(this, SecondActivity.class);
    	startActivity(intent);
    	
    }


}
