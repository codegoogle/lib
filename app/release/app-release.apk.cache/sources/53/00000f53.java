package com.facebook.ads.redexgen.X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.facebook.ads.redexgen.X.8q  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C04928q implements SensorEventListener {
    public C04928q() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        C04938r.A0E(sensorEvent.values);
        C04938r.A05();
    }
}