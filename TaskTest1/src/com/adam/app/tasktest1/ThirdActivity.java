package com.adam.app.tasktest1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ThirdActivity extends Activity {

	private static final String TAG = "xxxx";
	private static final String Activity_NAME = ThirdActivity.class.getSimpleName();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thirdact);
		
		int taskId = this.getTaskId();
		
		Log.i(TAG, "["+Activity_NAME+"] id: " + taskId);
	}

	public void onOpenFourActivity(View v) {
		
		Intent intent = new Intent(this, FourthActivity.class);
    	startActivity(intent);
		
	}
	
}
