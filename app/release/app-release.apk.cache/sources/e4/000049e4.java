package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.p7700g.p99005.p7;

/* compiled from: CardViewApi17Impl.java */
@e2(17)
/* loaded from: classes.dex */
public class j7 extends l7 {

    /* compiled from: CardViewApi17Impl.java */
    /* loaded from: classes.dex */
    public class a implements p7.a {
        public a() {
        }

        @Override // com.p7700g.p99005.p7.a
        public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // com.p7700g.p99005.l7, com.p7700g.p99005.n7
    public void j() {
        p7.c = new a();
    }
}