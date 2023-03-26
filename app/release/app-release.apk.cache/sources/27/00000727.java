package com.anythink.expressad.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.OrientationEventListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.anythink.expressad.foundation.f.b;
import com.anythink.expressad.foundation.h.n;
import com.p7700g.p99005.oq;

/* loaded from: classes2.dex */
public abstract class ATBaseActivity extends Activity {
    private static final String a = "ATBaseActivity";
    private OrientationEventListener b;
    private Display c;
    private int d = -1;

    /* renamed from: com.anythink.expressad.activity.ATBaseActivity$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 extends OrientationEventListener {
        public AnonymousClass2(Context context) {
            super(context, 1);
        }

        @Override // android.view.OrientationEventListener
        public final void onOrientationChanged(int i) {
            int rotation = ATBaseActivity.this.c != null ? ATBaseActivity.this.c.getRotation() : 0;
            if (rotation != 1 || ATBaseActivity.this.d == 1) {
                if (rotation != 3 || ATBaseActivity.this.d == 2) {
                    if (rotation != 0 || ATBaseActivity.this.d == 3) {
                        if (rotation != 2 || ATBaseActivity.this.d == 4) {
                            return;
                        }
                        ATBaseActivity.this.d = 4;
                        ATBaseActivity.this.a();
                        n.d(ATBaseActivity.a, "Orientation Bottom");
                        return;
                    }
                    ATBaseActivity.this.d = 3;
                    ATBaseActivity.this.a();
                    n.d(ATBaseActivity.a, "Orientation Top");
                    return;
                }
                ATBaseActivity.this.d = 2;
                ATBaseActivity.this.a();
                n.d(ATBaseActivity.a, "Orientation Right");
                return;
            }
            ATBaseActivity.this.d = 1;
            ATBaseActivity.this.a();
            n.d(ATBaseActivity.a, "Orientation Left");
        }
    }

    public static /* synthetic */ void e(ATBaseActivity aTBaseActivity) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(aTBaseActivity);
        aTBaseActivity.b = anonymousClass2;
        if (anonymousClass2.canDetectOrientation()) {
            aTBaseActivity.b.enable();
            return;
        }
        aTBaseActivity.b.disable();
        aTBaseActivity.b = null;
    }

    public abstract void a(int i, int i2, int i3, int i4, int i5);

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            d();
            c();
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                getWindow().setAttributes(attributes);
            }
        } catch (Exception e) {
            n.d(a, e.getMessage());
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        OrientationEventListener orientationEventListener = this.b;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.b = null;
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (b.c) {
            return;
        }
        a();
        d();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        d();
    }

    private void b() {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this);
        this.b = anonymousClass2;
        if (anonymousClass2.canDetectOrientation()) {
            this.b.enable();
            return;
        }
        this.b.disable();
        this.b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c() {
        if (this.c == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.c = getDisplay();
            } else {
                this.c = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            }
        }
        Display display = this.c;
        if (display != null) {
            return display.getRotation();
        }
        return -1;
    }

    private void d() {
        try {
            getWindow().addFlags(67108864);
            getWindow().getDecorView().setSystemUiVisibility(oq.l);
        } catch (Throwable th) {
            n.d(a, th.getMessage());
        }
    }

    public final void a() {
        getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.anythink.expressad.activity.ATBaseActivity.1
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                int i2;
                int i3;
                DisplayCutout displayCutout;
                int c;
                try {
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 23) {
                        WindowInsets rootWindowInsets = ATBaseActivity.this.getWindow().getDecorView().getRootWindowInsets();
                        int i5 = -1;
                        int i6 = 0;
                        if (rootWindowInsets == null || i4 < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
                            i = 0;
                            i2 = 0;
                            i3 = 0;
                        } else {
                            int safeInsetLeft = displayCutout.getSafeInsetLeft();
                            i = displayCutout.getSafeInsetRight();
                            i2 = displayCutout.getSafeInsetTop();
                            int safeInsetBottom = displayCutout.getSafeInsetBottom();
                            n.d(ATBaseActivity.a, "NOTCH Left:" + safeInsetLeft + " Right:" + i + " Top:" + i2 + " Bottom:" + safeInsetBottom);
                            if (ATBaseActivity.this.c == null) {
                                c = ATBaseActivity.this.c();
                            } else {
                                c = ATBaseActivity.this.c.getRotation();
                            }
                            if (ATBaseActivity.this.d == -1) {
                                ATBaseActivity.this.d = c == 0 ? 3 : c == 1 ? 1 : c == 2 ? 4 : c == 3 ? 2 : -1;
                                StringBuilder sb = new StringBuilder();
                                sb.append(ATBaseActivity.this.d);
                                n.d(ATBaseActivity.a, sb.toString());
                            }
                            if (c != 0) {
                                if (c == 1) {
                                    i5 = 90;
                                } else if (c == 2) {
                                    i5 = 180;
                                } else if (c == 3) {
                                    i5 = 270;
                                }
                                i3 = safeInsetBottom;
                                i6 = safeInsetLeft;
                            } else {
                                i3 = safeInsetBottom;
                                i6 = safeInsetLeft;
                                i5 = 0;
                            }
                        }
                        ATBaseActivity.this.a(i5, i6, i, i2, i3);
                        if (ATBaseActivity.this.b == null) {
                            ATBaseActivity.e(ATBaseActivity.this);
                        }
                    }
                } catch (Exception e) {
                    n.d(ATBaseActivity.a, e.getMessage());
                }
            }
        }, 500L);
    }
}