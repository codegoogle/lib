package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* loaded from: classes2.dex */
public class OwnNativeAdView extends FrameLayout {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    private a i;

    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public OwnNativeAdView(@x1 Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.a = (int) motionEvent.getRawX();
            this.b = (int) motionEvent.getRawY();
            this.e = (int) motionEvent.getX();
            this.f = (int) motionEvent.getY();
        } else if (action == 1 || action == 3) {
            this.c = (int) motionEvent.getRawX();
            this.d = (int) motionEvent.getRawY();
            this.g = (int) motionEvent.getX();
            this.h = (int) motionEvent.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public com.anythink.basead.c.a getAdClickRecord() {
        com.anythink.basead.c.a aVar = new com.anythink.basead.c.a();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.h = this.h;
        return aVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setWindowEventListener(a aVar) {
        this.i = aVar;
    }

    public OwnNativeAdView(@x1 Context context, @z1 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OwnNativeAdView(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}