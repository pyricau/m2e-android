package com.sample.project;

import android.app.Activity;
import android.os.Bundle;

public class HelloAndroidActivity extends Activity {

    public boolean someBoolean = false;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        someBoolean = true;
    }

}

