package com.anythink.expressad.video.dynview.i;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.b.m;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.video.dynview.widget.AnyThinkFramLayout;
import com.anythink.expressad.video.dynview.widget.AnyThinkLevelLayoutView;
import com.anythink.expressad.video.dynview.widget.AnyThinkRelativeLayout;
import com.anythink.expressad.video.dynview.widget.AnyThinkTextView;
import com.anythink.expressad.video.module.AnythinkClickCTAView;
import com.anythink.expressad.video.widget.SoundImageView;

/* loaded from: classes2.dex */
public final class b {
    private String a = "anythink_top_play_bg";
    private String b = "anythink_top_finger_bg";
    private String c = "anythink_bottom_play_bg";
    private String d = "anythink_bottom_finger_bg";
    private String e = "anythink_tv_count";
    private String f = "anythink_sound_switch";
    private String g = "anythink_top_control";
    private String h = "anythink_tv_title";
    private String i = "anythink_tv_desc";
    private String j = "anythink_tv_install";
    private String k = "anythink_sv_starlevel";
    private String l = "anythink_tv_cta";
    private String m = "anythink_native_ec_controller";
    private String n = "anythink_reward_shape_choice_rl";
    private String o = "#FFFFFF";
    private String p = "#FF000000";
    private String q = "#40000000";
    private String r = "#CAEF79";
    private String s = "#2196F3";
    private String t = "#402196F3";
    private String u = "#8FC31F";
    private String v = "#03A9F4";

    private void b(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a(this.g));
        if (relativeLayout != null) {
            if (com.anythink.expressad.video.dynview.a.b.a == 0 && com.anythink.expressad.video.dynview.a.b.b == 0 && com.anythink.expressad.video.dynview.a.b.c == 0 && com.anythink.expressad.video.dynview.a.b.d == 0) {
                return;
            }
            relativeLayout.setVisibility(4);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.setMargins(layoutParams.leftMargin + com.anythink.expressad.video.dynview.a.b.a, layoutParams.topMargin + com.anythink.expressad.video.dynview.a.b.c, layoutParams.rightMargin + com.anythink.expressad.video.dynview.a.b.b, layoutParams.bottomMargin + com.anythink.expressad.video.dynview.a.b.d);
            relativeLayout.setLayoutParams(layoutParams);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
            alphaAnimation.setDuration(200L);
            relativeLayout.startAnimation(alphaAnimation);
            relativeLayout.setVisibility(0);
        }
    }

    private void d(View view, com.anythink.expressad.video.dynview.c cVar) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a(this.m));
        if (relativeLayout != null) {
            if (cVar.e() == 1) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(layoutParams.leftMargin + com.anythink.expressad.video.dynview.a.b.a, layoutParams.topMargin + com.anythink.expressad.video.dynview.a.b.c, layoutParams.rightMargin + com.anythink.expressad.video.dynview.a.b.b, layoutParams.bottomMargin + com.anythink.expressad.video.dynview.a.b.d);
                relativeLayout.setLayoutParams(layoutParams);
                return;
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.setMargins(layoutParams2.leftMargin + com.anythink.expressad.video.dynview.a.b.a, layoutParams2.topMargin + com.anythink.expressad.video.dynview.a.b.c, layoutParams2.rightMargin + com.anythink.expressad.video.dynview.a.b.b, layoutParams2.bottomMargin + com.anythink.expressad.video.dynview.a.b.d);
            relativeLayout.setLayoutParams(layoutParams2);
        }
    }

    public final void a(View view) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        ObjectAnimator objectAnimator3;
        if (view == null || !(view instanceof AnyThinkFramLayout)) {
            return;
        }
        AnyThinkFramLayout anyThinkFramLayout = (AnyThinkFramLayout) view;
        AnimatorSet animatorSet = new AnimatorSet();
        if (view.getContext() != null) {
            ImageView imageView = (ImageView) view.findViewById(a(this.a));
            ImageView imageView2 = (ImageView) view.findViewById(a(this.b));
            ImageView imageView3 = (ImageView) view.findViewById(a(this.c));
            ImageView imageView4 = (ImageView) view.findViewById(a(this.d));
            ObjectAnimator objectAnimator4 = null;
            if (imageView != null) {
                new com.anythink.expressad.video.dynview.g.b();
                objectAnimator = com.anythink.expressad.video.dynview.g.b.a(imageView);
            } else {
                objectAnimator = null;
            }
            if (imageView2 != null) {
                new com.anythink.expressad.video.dynview.g.b();
                objectAnimator2 = com.anythink.expressad.video.dynview.g.b.b(imageView2);
            } else {
                objectAnimator2 = null;
            }
            if (imageView3 != null) {
                new com.anythink.expressad.video.dynview.g.b();
                objectAnimator3 = com.anythink.expressad.video.dynview.g.b.a(imageView3);
            } else {
                objectAnimator3 = null;
            }
            if (imageView4 != null) {
                new com.anythink.expressad.video.dynview.g.b();
                objectAnimator4 = com.anythink.expressad.video.dynview.g.b.b(imageView4);
            }
            if (objectAnimator == null || objectAnimator3 == null || objectAnimator2 == null || objectAnimator4 == null) {
                return;
            }
            animatorSet.playTogether(objectAnimator, objectAnimator3, objectAnimator2, objectAnimator4);
            anyThinkFramLayout.setAnimatorSet(animatorSet);
        }
    }

    public final void c(View view, com.anythink.expressad.video.dynview.c cVar) {
        if (view == null || cVar == null) {
            return;
        }
        if (view.getContext() != null) {
            AnyThinkLevelLayoutView anyThinkLevelLayoutView = (AnyThinkLevelLayoutView) view.findViewById(a(this.k));
            if (anyThinkLevelLayoutView != null) {
                if (cVar.e() == 1) {
                    anyThinkLevelLayoutView.setOrientation(1);
                } else {
                    anyThinkLevelLayoutView.setOrientation(0);
                }
            }
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a(this.m));
            if (relativeLayout != null) {
                if (cVar.e() == 1) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(layoutParams.leftMargin + com.anythink.expressad.video.dynview.a.b.a, layoutParams.topMargin + com.anythink.expressad.video.dynview.a.b.c, layoutParams.rightMargin + com.anythink.expressad.video.dynview.a.b.b, layoutParams.bottomMargin + com.anythink.expressad.video.dynview.a.b.d);
                    relativeLayout.setLayoutParams(layoutParams);
                } else {
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams2.setMargins(layoutParams2.leftMargin + com.anythink.expressad.video.dynview.a.b.a, layoutParams2.topMargin + com.anythink.expressad.video.dynview.a.b.c, layoutParams2.rightMargin + com.anythink.expressad.video.dynview.a.b.b, layoutParams2.bottomMargin + com.anythink.expressad.video.dynview.a.b.d);
                    relativeLayout.setLayoutParams(layoutParams2);
                }
            }
            View findViewById = view.findViewById(a(this.l));
            if (findViewById instanceof TextView) {
                TextView textView = (TextView) findViewById;
                textView.setTextColor(Color.parseColor(this.o));
                textView.setTextSize(25.0f);
                String str = this.r;
                com.anythink.expressad.video.dynview.h.b.a.a(findViewById, 1.0f, 5.0f, str, new String[]{this.u, str}, GradientDrawable.Orientation.LEFT_RIGHT);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            new com.anythink.expressad.video.dynview.g.b();
            animatorSet.playTogether(com.anythink.expressad.video.dynview.g.b.c(findViewById));
            if (view instanceof AnyThinkFramLayout) {
                ((AnyThinkFramLayout) view).setAnimatorSet(animatorSet);
            }
            if (view instanceof AnyThinkRelativeLayout) {
                ((AnyThinkRelativeLayout) view).setAnimatorSet(animatorSet);
            }
        }
        new com.anythink.expressad.video.dynview.g.b();
        com.anythink.expressad.video.dynview.g.b.e(view);
    }

    public final void a(View view, com.anythink.expressad.video.dynview.c cVar) {
        String str;
        String str2;
        String str3;
        float f;
        float f2;
        Context context = view != null ? view.getContext() : null;
        if (context == null || cVar == null) {
            return;
        }
        TextView textView = (TextView) view.findViewById(a(this.e));
        if (textView != null) {
            textView.setBackgroundResource(h.a(context, "anythink_reward_shape_progress", h.c));
            textView.setTextColor(Color.parseColor(this.o));
            textView.setTextSize(11.0f);
        }
        TextView textView2 = (TextView) view.findViewById(a("anythink_reward_click_tv"));
        if (textView2 != null) {
            textView2.setTextSize(20.0f);
            if (textView2 instanceof AnyThinkTextView) {
                new com.anythink.expressad.video.dynview.g.b();
                ((AnyThinkTextView) textView2).setObjectAnimator(com.anythink.expressad.video.dynview.g.b.c(textView2));
            }
        }
        String str4 = this.p;
        String str5 = this.r;
        int i = cVar.i();
        if (i == 302) {
            str = this.s;
            str2 = this.v;
            str4 = this.o;
            str3 = this.t;
            f = 1.0f;
            f2 = 10.0f;
        } else if (i != 802) {
            str = this.u;
            str2 = this.r;
            str3 = str5;
            f = 1.0f;
            f2 = 5.0f;
        } else {
            str = this.o;
            str4 = this.p;
            str3 = this.q;
            str2 = str;
            f = 0.5f;
            f2 = 25.0f;
        }
        if (textView2 != null) {
            textView2.setTextColor(Color.parseColor(str4));
            com.anythink.expressad.video.dynview.h.b.a.a(textView2, f, f2, str3, new String[]{str, str2}, GradientDrawable.Orientation.LEFT_RIGHT);
        }
        if (cVar.f() != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cVar.f().getLayoutParams();
            layoutParams.setMargins(0, 0, 0, 0);
            cVar.f().setLayoutParams(layoutParams);
        }
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a(this.g));
        if (relativeLayout != null) {
            if (com.anythink.expressad.video.dynview.a.b.a == 0 && com.anythink.expressad.video.dynview.a.b.b == 0 && com.anythink.expressad.video.dynview.a.b.c == 0 && com.anythink.expressad.video.dynview.a.b.d == 0) {
                return;
            }
            relativeLayout.setVisibility(4);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams2.setMargins(layoutParams2.leftMargin + com.anythink.expressad.video.dynview.a.b.a, layoutParams2.topMargin + com.anythink.expressad.video.dynview.a.b.c, layoutParams2.rightMargin + com.anythink.expressad.video.dynview.a.b.b, layoutParams2.bottomMargin + com.anythink.expressad.video.dynview.a.b.d);
            relativeLayout.setLayoutParams(layoutParams2);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
            alphaAnimation.setDuration(200L);
            relativeLayout.startAnimation(alphaAnimation);
            relativeLayout.setVisibility(0);
        }
    }

    public final void b(View view, com.anythink.expressad.video.dynview.c cVar) {
        Context context;
        int b;
        if (view == null || cVar == null || (context = view.getContext()) == null) {
            return;
        }
        if (cVar.e() == 1) {
            view.setBackgroundDrawable(context.getResources().getDrawable(h.a(context, this.n, h.c)));
            TextView textView = (TextView) view.findViewById(a(this.h));
            if (textView != null) {
                textView.setTextColor(Color.parseColor(this.p));
            }
            TextView textView2 = (TextView) view.findViewById(a(this.i));
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor(this.p));
            }
            b = s.b(context, 2.0f);
        } else {
            b = s.b(context, 10.0f);
            view.getBackground().setAlpha(100);
        }
        int b2 = s.b(context, 8.0f);
        View findViewById = view.findViewById(a(this.j));
        if (findViewById != null) {
            if (cVar.f() != null && (cVar.f() instanceof AnythinkClickCTAView)) {
                new com.anythink.expressad.video.dynview.g.b();
                ((AnythinkClickCTAView) cVar.f()).setObjectAnimator(com.anythink.expressad.video.dynview.g.b.c(findViewById));
            }
            if (findViewById instanceof TextView) {
                TextView textView3 = (TextView) findViewById;
                textView3.setTextColor(Color.parseColor(this.o));
                textView3.setTextSize(15.0f);
                String str = this.r;
                com.anythink.expressad.video.dynview.h.b.a.a(textView3, 1.0f, 5.0f, str, new String[]{this.u, str}, GradientDrawable.Orientation.LEFT_RIGHT);
            }
        }
        if (view.getLayoutParams() == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(b, b, b, b2);
            layoutParams.height = s.b(context, 60.0f);
            view.setLayoutParams(layoutParams);
        }
    }

    private void a(Context context, View view) {
        SoundImageView soundImageView = (SoundImageView) view.findViewById(a(this.f));
        int b = s.b(context, 60.0f);
        int b2 = s.b(context, 10.0f);
        if (soundImageView != null) {
            ((FrameLayout.LayoutParams) soundImageView.getLayoutParams()).setMargins(b2, 0, 0, b);
        }
    }

    private static int a(String str) {
        return h.a(m.a().e(), str, "id");
    }
}