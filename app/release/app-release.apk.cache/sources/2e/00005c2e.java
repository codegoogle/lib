package com.p7700g.p99005;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes3.dex */
public abstract class sl2 extends pl2 implements tl2 {
    public static tl2 O1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return queryLocalInterface instanceof tl2 ? (tl2) queryLocalInterface : new rl2(iBinder);
    }
}