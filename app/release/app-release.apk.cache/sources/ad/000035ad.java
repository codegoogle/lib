package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.ironsource.environment.h;
import com.ironsource.sdk.controller.u;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.microsoft.appcenter.ingestion.models.AbstractLog;
import com.p7700g.p99005.oq;

/* loaded from: classes3.dex */
public class ControllerActivity extends Activity implements w, com.ironsource.sdk.j.g {
    private static final String s = ControllerActivity.class.getSimpleName();
    private static String t = "removeWebViewContainerView | mContainer is null";
    private static String u = "removeWebViewContainerView | view is null";
    private String A;
    private com.ironsource.sdk.g.b E;
    private boolean F;
    private boolean G;
    private String v;
    private x w;
    private RelativeLayout x;
    private FrameLayout y;
    public int currentRequestedRotation = -1;
    private boolean z = false;
    private Handler B = new Handler();
    private final Runnable C = new a();
    private RelativeLayout.LayoutParams D = new RelativeLayout.LayoutParams(-1, -1);

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.z));
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnSystemUiVisibilityChangeListener {
        public b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public final void onSystemUiVisibilityChange(int i) {
            if ((i & oq.l) == 0) {
                ControllerActivity.this.B.removeCallbacks(ControllerActivity.this.C);
                ControllerActivity.this.B.postDelayed(ControllerActivity.this.C, 500L);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ControllerActivity.this.getWindow().addFlags(128);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ControllerActivity.this.getWindow().clearFlags(128);
        }
    }

    private void a() {
        String str = s;
        Logger.i(str, "clearWebviewController");
        x xVar = this.w;
        if (xVar == null) {
            Logger.i(str, "clearWebviewController, null");
            return;
        }
        xVar.P = x.g.Gone;
        xVar.v0 = null;
        xVar.K0 = null;
        xVar.a(this.A, "onDestroy");
    }

    private void b(String str) {
        if (str != null) {
            if ("landscape".equalsIgnoreCase(str)) {
                e();
            } else if ("portrait".equalsIgnoreCase(str)) {
                g();
            } else if (AbstractLog.DEVICE.equalsIgnoreCase(str)) {
                if (h.q(this)) {
                    setRequestedOrientation(1);
                }
            } else if (getRequestedOrientation() == -1) {
                setRequestedOrientation(4);
            }
        }
    }

    private void e() {
        int k = h.k(this);
        String str = s;
        Logger.i(str, "setInitiateLandscapeOrientation");
        if (k == 0) {
            Logger.i(str, "ROTATION_0");
            setRequestedOrientation(0);
        } else if (k == 2) {
            Logger.i(str, "ROTATION_180");
            setRequestedOrientation(8);
        } else if (k == 3) {
            Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(8);
        } else if (k != 1) {
            Logger.i(str, "No Rotation");
        } else {
            Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(0);
        }
    }

    private void g() {
        int k = h.k(this);
        String str = s;
        Logger.i(str, "setInitiatePortraitOrientation");
        if (k == 0) {
            Logger.i(str, "ROTATION_0");
            setRequestedOrientation(1);
        } else if (k == 2) {
            Logger.i(str, "ROTATION_180");
            setRequestedOrientation(9);
        } else if (k == 1) {
            Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(1);
        } else if (k != 3) {
            Logger.i(str, "No Rotation");
        } else {
            Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(1);
        }
    }

    @Override // com.ironsource.sdk.j.g
    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Logger.i(s, "onBackPressed");
        new com.ironsource.sdk.i.a();
        if (com.ironsource.sdk.i.a.a(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.ironsource.sdk.j.g
    public void onCloseRequested() {
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Logger.i(s, "onCreate");
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            x xVar = (x) com.ironsource.sdk.d.b.a((Context) this).a.a;
            this.w = xVar;
            xVar.O.setId(1);
            x xVar2 = this.w;
            xVar2.K0 = this;
            xVar2.v0 = this;
            Intent intent = getIntent();
            this.A = intent.getStringExtra("productType");
            this.z = intent.getBooleanExtra("immersive", false);
            this.v = intent.getStringExtra("adViewId");
            this.F = false;
            this.G = intent.getBooleanExtra("ctrWVPauseResume", false);
            if (this.z) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new b());
                runOnUiThread(this.C);
            }
            if (!TextUtils.isEmpty(this.A) && d.e.OfferWall.toString().equalsIgnoreCase(this.A)) {
                if (bundle != null) {
                    com.ironsource.sdk.g.b bVar = (com.ironsource.sdk.g.b) bundle.getParcelable(CallMraidJS.b);
                    if (bVar != null) {
                        this.E = bVar;
                        this.w.a(bVar);
                    }
                    finish();
                } else {
                    this.E = this.w.w0;
                }
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.x = relativeLayout;
            setContentView(relativeLayout, this.D);
            String str = this.v;
            this.y = !(!TextUtils.isEmpty(str) && !str.equals(Integer.toString(1))) ? this.w.O : com.ironsource.sdk.utils.d.a(getApplicationContext(), com.ironsource.sdk.c.d.a().a(str).b());
            if (this.x.findViewById(1) == null && this.y.getParent() != null) {
                finish();
            }
            Intent intent2 = getIntent();
            String stringExtra = intent2.getStringExtra("orientation_set_flag");
            intent2.getIntExtra("rotation_set_flag", 0);
            b(stringExtra);
            this.x.addView(this.y, this.D);
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        Logger.i(s, "onDestroy");
        try {
        } catch (Exception e) {
            com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.p, new com.ironsource.sdk.a.a().a("callfailreason", e.getMessage()).a);
            String str = s;
            Logger.i(str, "removeWebViewContainerView fail " + e.getMessage());
        }
        if (this.x == null) {
            throw new Exception(t);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.y.getParent();
        View findViewById = this.v == null ? viewGroup2.findViewById(1) : com.ironsource.sdk.c.d.a().a(this.v).b();
        if (findViewById == null) {
            throw new Exception(u);
        }
        if (isFinishing() && (viewGroup = (ViewGroup) findViewById.getParent()) != null) {
            viewGroup.removeView(findViewById);
        }
        viewGroup2.removeView(this.y);
        if (this.F) {
            return;
        }
        Logger.i(s, "onDestroy | destroyedFromBackground");
        a();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            x xVar = this.w;
            if (xVar.L != null) {
                xVar.K.onHideCustomView();
                return true;
            }
        }
        if (this.z && (i == 25 || i == 24)) {
            this.B.removeCallbacks(this.C);
            this.B.postDelayed(this.C, 500L);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.ironsource.sdk.j.g
    public void onOrientationChanged(String str, int i) {
        b(str);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        String str = s;
        Logger.i(str, "onPause, isFinishing=" + isFinishing());
        com.ironsource.environment.e.a.a.b(new u.a((AudioManager) getSystemService("audio")));
        x xVar = this.w;
        if (xVar != null) {
            xVar.b(this);
            if (!this.G) {
                this.w.k();
            }
            this.w.a(false, "main");
            this.w.a(this.A, "onPause");
        }
        if (isFinishing()) {
            this.F = true;
            a();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i(s, "onResume");
        x xVar = this.w;
        if (xVar != null) {
            xVar.a(this);
            if (!this.G) {
                this.w.l();
            }
            this.w.a(true, "main");
            this.w.a(this.A, "onResume");
        }
        com.ironsource.environment.e.a.a.b(new u.b((AudioManager) getSystemService("audio")));
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (TextUtils.isEmpty(this.A) || !d.e.OfferWall.toString().equalsIgnoreCase(this.A)) {
            return;
        }
        com.ironsource.sdk.g.b bVar = this.E;
        bVar.d = true;
        bundle.putParcelable(CallMraidJS.b, bVar);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        Logger.i(s, "onStart");
        x xVar = this.w;
        if (xVar != null) {
            xVar.a(this.A, "onStart");
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        Logger.i(s, "onStop");
        x xVar = this.w;
        if (xVar != null) {
            xVar.a(this.A, "onStop");
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.i(s, "onUserLeaveHint");
        x xVar = this.w;
        if (xVar != null) {
            xVar.a(this.A, "onUserLeaveHint");
        }
    }

    @Override // com.ironsource.sdk.controller.w
    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.sdk.controller.w
    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.sdk.controller.w
    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.sdk.controller.w
    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.sdk.controller.w
    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.z && z) {
            runOnUiThread(this.C);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        if (this.currentRequestedRotation != i) {
            String str = s;
            Logger.i(str, "Rotation: Req = " + i + " Curr = " + this.currentRequestedRotation);
            this.currentRequestedRotation = i;
            super.setRequestedOrientation(i);
        }
    }

    public void toggleKeepScreen(boolean z) {
        runOnUiThread(z ? new c() : new d());
    }
}