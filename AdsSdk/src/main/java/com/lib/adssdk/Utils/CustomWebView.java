package com.lib.adssdk.Utils;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.WebView;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public class CustomWebView extends WebView {
    public CustomWebView(Context context) {
        super(context);
    }

    public CustomWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CustomWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public CustomWebView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i, z);
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        Log.d("log", "log: " + i + " " + i2 + " " + z + " " + z2);
        if (!z && z2) {
            ViewParent parent = getParent();
            if (parent instanceof SwipeRefreshLayout) {
                ((SwipeRefreshLayout) parent).setEnabled(true);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 0) {
            return true;
        }
        ViewParent parent = getParent();
        if (!(parent instanceof SwipeRefreshLayout)) {
            return true;
        }
        ((SwipeRefreshLayout) parent).setEnabled(false);
        return true;
    }
}
