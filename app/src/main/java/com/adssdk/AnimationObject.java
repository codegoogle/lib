package com.adssdk;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class AnimationObject {


    public enum AnimationType {
        slide_in_left,
        slide_out_right,
        fade_in,
        fade_out,
        right_to_left,
        none
    }


    public static void setAnimation(Context context, View viewToAnimate, AnimationType animationType) {
        Animation animation = null;
        switch (animationType) {
            case slide_in_left:
                animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
                break;
            case slide_out_right:
                animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_out_right);
                break;
            case fade_in:
                animation = AnimationUtils.loadAnimation(context, android.R.anim.fade_in);
                break;
            case fade_out:
                animation = AnimationUtils.loadAnimation(context, android.R.anim.fade_out);
                break;
            case right_to_left:
                animation = AnimationUtils.loadAnimation(context, R.anim.right_to_left);
                break;
            case none:
                animation = null;
                break;
            default:
                animation = null;
                break;
        }

        if (animation != null) {
            animation.setDuration(1500);
            viewToAnimate.startAnimation(animation);
        }

    }

}
