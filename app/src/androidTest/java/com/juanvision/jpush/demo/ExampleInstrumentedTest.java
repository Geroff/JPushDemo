package com.juanvision.jpush.demo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    public static final String TAG = "ExampleInstrumentedTest";

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.juanvision.jpush.demo", appContext.getPackageName());
    }

    @Test
    public void generateDefineIntentForHawei() { // 生成华为自定义intent
        Intent previewIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("juanvisionscheme://com.juanvision.eseecloud30/notify_preview?798985748:door bell call:1"));
        previewIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        String previewIntentString = previewIntent.toUri(Intent.URI_INTENT_SCHEME);
        Log.d(TAG, "previewIntentString-->" + previewIntentString);

        Intent alertIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("juanvisionscheme://com.juanvision.eseecloud30/notify_alert?798985748:motion detection:1"));
        alertIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        String alertIntentString = alertIntent.toUri(Intent.URI_INTENT_SCHEME);
        Log.d(TAG, "alertIntentString-->" + alertIntentString);
    }
}
