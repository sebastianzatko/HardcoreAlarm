package com.example.alarm.Components.Others;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;

import androidx.core.app.NotificationCompat;

import com.example.alarm.R;

public class NotificationHelper extends ContextWrapper {

    private NotificationManager notificationManager;
    public static final String channelID="channel1ID";
    public static final String channeLName="Channel 1"; //Esto es lo que ve el usuario el algun punto


    public NotificationHelper(Context base) {
        super(base);
        if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.O){
            createChannels();
        }
    }

    @TargetApi(Build.VERSION_CODES.O)
    public void createChannels(){
        NotificationChannel channel=new NotificationChannel(channelID,channeLName, NotificationManager.IMPORTANCE_HIGH);
        channel.enableLights(true);
        channel.enableVibration(true);
        channel.setLightColor(R.color.colorPrimary);
        channel.setLockscreenVisibility(Notification.VISIBILITY_PRIVATE);
        getManager().createNotificationChannel(channel);
    }

    public NotificationManager getManager(){
        if(notificationManager==null){
            notificationManager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        }
        return this.notificationManager;
    }

    public NotificationCompat.Builder getChannelNotification(){
        String title="Alarm";
        String Message="The Alarm is on FIRE";
        return new NotificationCompat.Builder(getApplicationContext(),channelID)
                .setContentTitle(title).setContentText(Message).setSmallIcon(R.drawable.ic_alarm_black_24dp);
    }


}
