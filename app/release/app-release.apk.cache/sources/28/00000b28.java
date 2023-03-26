package com.anythink.expressad.widget;

import android.view.View;
import java.util.Calendar;

/* loaded from: classes2.dex */
public abstract class a implements View.OnClickListener {
    public static final int d = 2000;
    private long a = 0;

    public abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this.a > 2000) {
            this.a = timeInMillis;
            a(view);
        }
    }
}