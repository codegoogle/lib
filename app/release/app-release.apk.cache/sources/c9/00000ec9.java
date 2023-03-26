package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;

/* renamed from: com.facebook.ads.redexgen.X.6P  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6P {
    public static String[] A03;
    public final Context A00;
    public final C6J A01;
    public final EnumC04456m A02;

    static {
        A00();
    }

    public static void A00() {
        A03 = new String[]{"COmePc5O6jQNBThxNrU00eLA0sP62Ofb", "1OlTUJms59QGnZv6uedBszpwZ8CEYVJ", "oD0bBsFyrWHU6", "C7a4pm2tyO8SrXv1cdlxK2sPFdgwB5ae", "g8qGNC4JJd68o", "wdv0nL8gPgDp5YXIgWNDO16SJnt", "h7h0bvqqYit4L8HKMEE", "ho5Id5lQMxy9uaRyjuF"};
    }

    public C6P(Context context, C6J c6j, EnumC04456m enumC04456m) {
        this.A01 = c6j;
        this.A00 = context;
        this.A02 = enumC04456m;
    }

    public final void A01(MotionEvent motionEvent) {
        int i;
        int i2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Context context = this.A00;
        String packageName = context == null ? "" : context.getPackageName();
        EnumC04456m enumC04456m = this.A02;
        EnumC04456m enumC04456m2 = EnumC04456m.A0G;
        if (A03[7].length() != 16) {
            String[] strArr = A03;
            strArr[6] = "q52vtyV4o3lWIqbyVHb";
            strArr[6] = "q52vtyV4o3lWIqbyVHb";
            C04546v c04546v = enumC04456m == enumC04456m2 ? null : new C04546v(packageName);
            float f = 1.0f;
            char c = 1;
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 1:
                case 3:
                case 5:
                case 6:
                    int pointerId = motionEvent.getActionIndex();
                    int pointerId2 = motionEvent.getPointerId(pointerId);
                    if (Build.VERSION.SDK_INT >= 14) {
                        i = motionEvent.getToolType(pointerId);
                    } else {
                        i = -1;
                    }
                    this.A01.A02(new C1074Wb(elapsedRealtime, c04546v, new C6T(motionEvent.getActionMasked(), pointerId2, i, new float[]{motionEvent.getRawX(), motionEvent.getRawY()}, motionEvent.getSize(pointerId), Math.min(motionEvent.getPressure(pointerId), 1.0f), motionEvent.getOrientation(pointerId))), C6I.A0E);
                    return;
                case 2:
                case 4:
                    int i3 = 0;
                    while (i3 < motionEvent.getPointerCount()) {
                        int pointerId3 = motionEvent.getPointerId(i3);
                        String[] strArr2 = A03;
                        if (strArr2[2].length() != strArr2[4].length()) {
                            break;
                        } else {
                            String[] strArr3 = A03;
                            strArr3[1] = "FtxLtPKiBWyCq8d2bMsvLwchXj4m1FL";
                            strArr3[5] = "2ZHjPJSTqIAuT8ks3iUv9R1XL7D";
                            if (Build.VERSION.SDK_INT >= 14) {
                                i2 = motionEvent.getToolType(i3);
                            } else {
                                i2 = -1;
                            }
                            int actionMasked = motionEvent.getActionMasked();
                            float[] fArr = new float[2];
                            fArr[0] = motionEvent.getRawX();
                            fArr[c] = motionEvent.getRawY();
                            this.A01.A02(new C1074Wb(elapsedRealtime, c04546v, new C6T(actionMasked, pointerId3, i2, fArr, motionEvent.getSize(i3), Math.min(motionEvent.getPressure(i3), f), motionEvent.getOrientation(i3))), C6I.A0E);
                            i3++;
                            f = 1.0f;
                            c = 1;
                        }
                    }
                    return;
                default:
                    return;
            }
        }
        throw new RuntimeException();
    }
}