package com.example.mylibrary;

import android.util.Log;

public class LibraryClass {
    private static String TAG = "LibraryClass";

    public String printLog(String msg) {
        Log.v(TAG, msg);
        return msg + "_Response from lib";
    }
}
