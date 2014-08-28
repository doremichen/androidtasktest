package com.adam.app.tasktest2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class OtherActivity extends Activity {

	private static final String TAG = "xxxx";
	private static final String Activity_NAME = OtherActivity.class.getSimpleName();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.otheract);
		
		int taskId = this.getTaskId();
		
		Log.i(TAG, "["+Activity_NAME+"] id: " + taskId);
	}

	
	
}
