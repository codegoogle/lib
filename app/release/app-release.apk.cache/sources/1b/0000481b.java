package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.p7700g.p99005.i2;
import java.util.List;

/* compiled from: AnimatorSetCompat.java */
@i2({i2.a.t})
/* loaded from: classes2.dex */
public class ia2 {
    public static void a(@x1 AnimatorSet animatorSet, @x1 List<Animator> list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }
}