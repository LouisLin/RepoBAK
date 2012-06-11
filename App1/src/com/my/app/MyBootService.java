/**
 * 
 */
package com.my.app;

import com.my.app.lib.MyIntent;
import com.my.app.lib.MyNotification;
import com.my.app.lib.MyToast;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

/**
 * @author Louis
 *
 */
public class MyBootService extends Service {

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();

		MyNotification.notify(this);
		MyToast.showLong(this, MyBootService.class.getName());

//		MyIntent.startActivity(this, MyBootActivity.class);
	}

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

}
