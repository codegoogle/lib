package com.anythink.expressad.shake;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.anythink.core.common.b.m;

/* loaded from: classes2.dex */
public final class a {
    public Sensor a;
    private SensorManager b;

    /* renamed from: com.anythink.expressad.shake.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0073a {
        public static a a = new a((byte) 0);

        private C0073a() {
        }
    }

    public /* synthetic */ a(byte b) {
        this();
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            aVar = C0073a.a;
        }
        return aVar;
    }

    public final boolean b() {
        return this.a != null;
    }

    private a() {
        Context e = m.a().e();
        if (e != null) {
            try {
                if (this.b == null) {
                    this.b = (SensorManager) e.getSystemService("sensor");
                }
                if (this.a == null) {
                    this.a = this.b.getDefaultSensor(1);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(SensorEventListener sensorEventListener) {
        try {
            this.b.registerListener(sensorEventListener, this.a, 2);
        } catch (Throwable unused) {
        }
    }

    public final void b(SensorEventListener sensorEventListener) {
        SensorManager sensorManager = this.b;
        if (sensorManager != null) {
            try {
                sensorManager.unregisterListener(sensorEventListener);
            } catch (Throwable unused) {
            }
        }
    }
}