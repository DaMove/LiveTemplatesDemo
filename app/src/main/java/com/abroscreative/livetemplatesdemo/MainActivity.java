package com.abroscreative.livetemplatesdemo;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

/*
LIVE TEMPLATES
Android
   const (Define an int constant)  OR use psf, psfi, psfs
   fbc  (findViewById) or just enter find
   foreach (There is also fori, itco, under iteration templates)
   gone (set view visibility to gone
   IntentView (creates an Intent of ACTION_VIEW)
   key (global key for a bundle)
   newinstance (ceates a new Fragment instance with arguments)
   noinstance (private empty constructor to prohibit instance creation ie singleton)
    rgs (get a String from a resource)
    rouiT (runOnUiThread(runnable))
    sbc (block comment for structuring code)
    Sfmt (String.format())
    starter (create a static starter method to start an activity)
    Toast
    ViewConstructors (Adds generic View constructors for ur custom View)
    visible
    wrapit (adds a gradle wrapper task)

Android Logs
    logt (for a standard logtag)
    logd, loge, logi,logm, logr, logw, wtf,

Plain
    St (String)
    thr (throw new )

Android XML shortcuts
    lw - layout_width
    lh - layout_height

    lww- layout_width="wrap_content"
    lwm - layout_width = "match_parent"

    lhw - layout_height="rwap_content"
    lhm - layout_height="match_parent"
 */


    ///////////////////////////////////////////////////////////////////////////
    // sbc generates this
    ///////////////////////////////////////////////////////////////////////////



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(intentCreate(Intent.ACTION_SEND, null,"text/plain",Intent.EXTRA_TEXT,"Text to send"));



    }






    /*
      NOTE
      To create your own custom liveTemplates
        >Settings >Editor >Live Templates > + >Live Template
        After clicking on + sign then Live Template
          Enter the abbreviation, description, then paste the code
          NOTE: You may surround your params in $ if you want them to be blank
        Then click on define
           then set the boundaries or context eg >Java >declaration for global declaration templates

     My Created Custom Templates so far
      createAlarm
      startTimer
      createi
      createic
      createia

    You may declare fully qualified names when you paste ur template code so as to avoid package name confusions

     */
    public  Intent intentCreate( String action, Uri dataUri,String type,String key,String value ){
                Intent  intent = new Intent(action)
                        .setData(dataUri)
                        .setType(type)
                        .putExtra(key,value);
                if(intent.resolveActivity(getPackageManager())!=null)
                    return intent;
                else{
                    return new Intent(getBaseContext(),getBaseContext().getClass());
                }
            }









}



