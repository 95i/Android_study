package com.smtxi.mynotification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private NotificationManager manager;
    private Notification notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        Intent intent = new Intent(this, NotificationActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 1);

        notification = new NotificationCompat.Builder(this, "leo")
                .setContentTitle("通知")
                .setContentText("世界怎么小，就不要出去啦")
                .setSmallIcon(R.drawable.ic_baseline_pets_24)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.a))
                .setColor(Color.parseColor("#ff0000"))
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .build();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("leo", "测速通知", NotificationManager.IMPORTANCE_HIGH);
            manager.createNotificationChannel(channel);
        }


    }

    public void sendNotification(View view) {
        manager.notify(1, notification);
    }

    public void cacelNotification(View view) {
        manager.cancel(1);
    }
}