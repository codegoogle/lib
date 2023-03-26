package com.lib.adssdk.Utils;

import static androidx.lifecycle.Lifecycle.Event.ON_START;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;

import com.lib.adssdk.Activity.QurekaActivity;
import com.lib.adssdk.AdsManager.AdsManager;
import com.lib.adssdk.Listner.OnAdsClickListner;
import com.lib.adssdk.MyApp;
import com.lib.adssdk.vServices;

public class AppObserve implements LifecycleObserver, Application.ActivityLifecycleCallbacks {

    AppObserve appObserve;

    private Activity currentActivity;
    public static boolean isShowingAd = true;
    private static boolean isFirstTime = true;


    public AppObserve(Application application) {
        appObserve = this;
        application.registerActivityLifecycleCallbacks(this);
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
    }


    @OnLifecycleEvent(ON_START)
    public void onStart() {
        showAdIfAvailable();
    }

    public void showAdIfAvailable() {

        if (isFirstTime) {
            isFirstTime = false;
            return;
        }

        if (isShowingAd) {
            isShowingAd = false;
            if (MyApp.getString(Const.background_ad).equals("2")) {

                AdsManager.ShowInterstitialAd(currentActivity, new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        isShowingAd = true;
                    }
                });

            } else if (MyApp.getString(Const.background_ad).equals("3")) {
                QurekaActivity.comeFromActivity = false;
                AdsManager.ShowAppOpenAd(currentActivity, new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        isShowingAd = true;
                    }
                });
            } else if (MyApp.getString(Const.background_ad).equals("4")) {
                AdsManager.ShowRewarded(currentActivity, new OnAdsClickListner() {
                    @Override
                    public void OnAdsClick() {
                        isShowingAd = true;
                    }
                });
            }
        }
    }


    @Override
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
    }

    @Override
    public void onActivityStarted(@NonNull Activity activity) {
        currentActivity = activity;
    }

    @Override
    public void onActivityResumed(@NonNull Activity activity) {
        currentActivity = activity;
    }

    @Override
    public void onActivityPaused(@NonNull Activity activity) {

    }

    @Override
    public void onActivityStopped(@NonNull Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {

    }

    @Override
    public void onActivityDestroyed(@NonNull Activity activity) {
        currentActivity = null;
    }
}
