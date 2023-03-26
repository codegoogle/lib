package com.ironsource.environment;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class ContextProvider {
    private static volatile ContextProvider a;
    private Activity b;
    private Context c;
    private Handler e = new Handler(Looper.getMainLooper());
    private ConcurrentHashMap<String, a> d = new ConcurrentHashMap<>();

    /* loaded from: classes3.dex */
    public interface a {
        void onPause(Activity activity);

        void onResume(Activity activity);
    }

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (a == null) {
            synchronized (ContextProvider.class) {
                if (a == null) {
                    a = new ContextProvider();
                }
            }
        }
        return a;
    }

    public Context getApplicationContext() {
        Activity activity;
        Context context = this.c;
        return (context != null || (activity = this.b) == null) ? context : activity.getApplicationContext();
    }

    public Activity getCurrentActiveActivity() {
        return this.b;
    }

    public void onPause(Activity activity) {
        if (activity != null) {
            for (a aVar : this.d.values()) {
                aVar.onPause(activity);
            }
        }
    }

    public void onResume(Activity activity) {
        if (activity != null) {
            this.b = activity;
            for (a aVar : this.d.values()) {
                aVar.onResume(this.b);
            }
        }
    }

    @Deprecated
    public void postOnUIThread(Runnable runnable) {
        Handler handler = this.e;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public void registerLifeCycleListener(a aVar) {
        this.d.put(aVar.getClass().getSimpleName(), aVar);
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.b = activity;
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.c = context;
        }
    }
}