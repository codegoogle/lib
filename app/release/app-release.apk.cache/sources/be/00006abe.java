package net.pubnative.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.p7700g.p99005.jp5;

/* loaded from: classes3.dex */
public class CountDownView extends FrameLayout {
    private ProgressBar s;
    private TextView t;

    public CountDownView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context ctx) {
        View inflate = FrameLayout.inflate(ctx, jp5.c.b, this);
        this.s = (ProgressBar) inflate.findViewById(jp5.b.j);
        this.t = (TextView) inflate.findViewById(jp5.b.k);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -90.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setFillAfter(true);
        this.s.startAnimation(rotateAnimation);
    }

    public void b(int currentMs, int totalMs) {
        this.s.setMax(totalMs);
        this.s.setSecondaryProgress(totalMs);
        this.s.setProgress(currentMs);
        this.t.setText(String.valueOf(((totalMs - currentMs) / 1000) + 1));
    }

    public CountDownView(Context context, AttributeSet attrs) {
        super(context, attrs);
        a(context);
    }

    public CountDownView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        a(context);
    }
}