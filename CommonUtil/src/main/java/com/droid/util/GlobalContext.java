package com.droid.util;

import android.content.Context;


public class GlobalContext {
    private GlobalContext() {
    }

    private static Context sAppContext;

    public static final void setAppContext(Context appContext) {
        if (appContext != null) {
            sAppContext = appContext.getApplicationContext();
        }
    }

    public static final Context getAppContext() {
        assert sAppContext != null;
        return sAppContext;
    }


}
