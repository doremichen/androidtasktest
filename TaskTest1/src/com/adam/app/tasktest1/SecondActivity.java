package com.adam.app.tasktest1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends Activity {
	
	private static final String TAG = "xxxx";
	private static final String Activity_NAME = SecondActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secact);
		
		int taskId = this.getTaskId();
		
		Log.i(TAG, "["+Activity_NAME+"] id: " + taskId);

	}

	
	public void onOpenThirdActivity(View v) {
		
		Intent intent = new Intent(this, ThirdActivity.class);
    	startActivity(intent);
		
	}
	
}
