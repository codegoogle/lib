package com.google.play;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.google.ads.R;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.play.Utils.Const;
import com.hanks.htextview.base.HTextView;
import com.google.play.Utils.PP_MyBounceInterpolator;

public class AppUtil {

    public static boolean isNetworkConnected(Activity activity) {
        ConnectivityManager cm = (ConnectivityManager) activity.getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }

    public static void RateApp(Activity activity) {
        try {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + activity.getPackageName())));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void ShareApp(Activity activity) {
        try {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name");
            String shareMessage = "\nLet me recommend you this application\n\n";
            shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + activity.getPackageName() + "\n\n";
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
            activity.startActivity(Intent.createChooser(shareIntent, "choose one"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ReviewInfo reviewInfo = null;

    public static void InAppReviewInit(Activity activity) {
        ReviewManager manager = ReviewManagerFactory.create(activity);
        Task<ReviewInfo> request = manager.requestReviewFlow();
        request.addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                reviewInfo = task.getResult();
            }
        });
    }

    public static void InAppReview(Activity activity) {
        ReviewManager manager = ReviewManagerFactory.create(activity);
        if (reviewInfo != null) {
            if (MyApp.getString(Const.rate_us).equals("true")) {
                if (MyApp.getString(Const.InAppReviewCount).equals("")) {
                    Task<Void> flow = manager.launchReviewFlow(activity, reviewInfo);
                    flow.addOnCompleteListener(task -> {
                        MyApp.setString(Const.InAppReviewCount, "1");
                    });
                } else if (MyApp.getString(Const.InAppReviewCount).equals("1")) {
                    Task<Void> flow = manager.launchReviewFlow(activity, reviewInfo);
                    flow.addOnCompleteListener(task -> {
                        MyApp.setString(Const.InAppReviewCount, "2");
                    });
                }
            }
        }
    }


    public static boolean GetOpenMainApp() {
        if (MyApp.getString(Const.label).equals("1")) {
            return true;
        } else {
            return false;
        }
    }

    public static Integer GetScreenJump() {
        if (MyApp.getString(Const.screen_counter).equals("")) {
            return 0;
        } else {
            return Integer.valueOf(MyApp.getString(Const.screen_counter));
        }
    }

    public static String GetOtherData() {
        try {
            return MyApp.getString(Const.data_other);
        } catch (Exception e) {
            return "";
        }
    }


    public static String GetPrivacyPolicyLink() {
        if (MyApp.getString(Const.privacy_policy).equals("")) {
            return "";
        } else {
            return MyApp.getString(Const.privacy_policy);
        }
    }


    public static Dialog dialog = null;

    public static void showLoader(Activity activity) {

        if (dialog == null) {
            dialog = new Dialog(activity);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.setContentView(R.layout.loader);
            dialog.setCancelable(false);
        }

        HTextView textView3 = dialog.findViewById(R.id.textview3);

        if (!dialog.isShowing()) {
            dialog.show();
        }

        try {

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    textView3.setTextColor(activity.getResources().getColor(R.color.black));
                    textView3.animateText("Please Wait...");
                }
            }, 500);


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    textView3.setTextColor(activity.getResources().getColor(R.color.black));
                    textView3.animateText("Data Loading...");
                }
            }, 1500);


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    textView3.setTextColor(activity.getResources().getColor(R.color.black));
                    textView3.animateText("Please Wait...");
                }
            }, 2500);


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    textView3.setTextColor(activity.getResources().getColor(R.color.black));
                    textView3.animateText("Data Loading...");
                }
            }, 4500);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void cancelLoader() {
        if (dialog != null) {
            if (dialog.isShowing()) {
                dialog.dismiss();
                dialog.cancel();
            }
        }
    }

    public static void animationPopUp(Context context, View view) {
        final Animation myAnim = AnimationUtils.loadAnimation(context, R.anim.bouncetouch);
        PP_MyBounceInterpolator interpolator = new PP_MyBounceInterpolator(0.05, 0.2);
        myAnim.setInterpolator(interpolator);

        view.startAnimation(myAnim);
    }


}
