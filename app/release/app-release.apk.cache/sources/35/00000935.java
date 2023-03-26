package com.anythink.expressad.shake;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* loaded from: classes2.dex */
public abstract class b implements SensorEventListener {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public long g = 0;
    private int h;
    private int i;

    public b(int i, int i2) {
        this.h = 0;
        this.i = 0;
        this.h = i;
        this.i = i2;
    }

    public abstract void a();

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (java.lang.Math.abs(r10 - r2) > r9.h) goto L5;
     */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f = -fArr[0];
        float f2 = -fArr[1];
        float f3 = -fArr[2];
        float f4 = this.d;
        if (f4 == 0.0f || Math.abs(f - f4) <= this.h) {
            float f5 = this.e;
            if (f5 == 0.0f || Math.abs(f2 - f5) <= this.h) {
                float f6 = this.f;
                if (f6 != 0.0f) {
                }
                this.d = f;
                this.e = f2;
                this.f = f3;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.g > this.i) {
            this.g = currentTimeMillis;
            a();
        }
        this.d = f;
        this.e = f2;
        this.f = f3;
    }
}