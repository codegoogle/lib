package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.6O  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6O implements SensorEventListener {
    public static byte[] A09;
    public static String[] A0A;
    public static final String A0B;
    public C6M A00;
    public final Context A01;
    public final SensorManager A02;
    public final C6J A04;
    public final C6L A05;
    public final EnumC04456m A06;
    public final List<Sensor> A07;
    public final Map<Integer, C6S> A08 = new HashMap();
    public final Handler A03 = new Handler(AnonymousClass73.A00().A04().getLooper());

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0A[3].charAt(12) != 'o') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[7] = "dphTU4VZCJVUxlSWVafH1ZM";
            strArr[1] = "vTUzDZVZybplSM6lZClu7qj";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 84);
            i4++;
        }
    }

    public static void A01() {
        A09 = new byte[]{-3, -17, -8, -3, -7, -4};
    }

    public static void A02() {
        A0A = new String[]{"LMEfueB4gayQvpRN8xXm9AklEevQLqxV", "qKD5N87REqvFR6TOuYJE2bL", "", "yxtXe6d26bGgo70LmfUKAtnwRWe4i0hP", "QGB0NXt3pt8pLttf5OCs6Mo1nTnYeT90", "cpHchmbIsy8OjJq5SMyv1Bjwv0Y4tWtv", "hkg18epqSSQRsZzRGzTmSQr5c5v3YJAV", "CsdF03UMAkfQBN54GO6xo56"};
    }

    static {
        A02();
        A01();
        A0B = C6O.class.getSimpleName();
    }

    public C6O(Context context, C6J c6j, EnumC04456m enumC04456m) {
        this.A01 = context;
        this.A02 = (SensorManager) context.getSystemService(A00(0, 6, 54));
        this.A07 = this.A02.getSensorList(-1);
        this.A04 = c6j;
        this.A05 = new C6L(this.A04, enumC04456m);
        this.A06 = enumC04456m;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.ads.redexgen.X.6M] */
    @SuppressLint({"CatchGeneralException"})
    public final synchronized void A03(List<C6S> list) {
        int A03;
        try {
            for (C6S c6s : list) {
                if (c6s != null && (A03 = c6s.A03()) != -1 && this.A08.get(Integer.valueOf(c6s.ordinal())) == null) {
                    if (A03 == 0) {
                        if (C6N.A00[c6s.ordinal()] == 1) {
                            this.A05.A03(this.A01);
                        }
                    } else {
                        for (Sensor sensor : this.A07) {
                            if (A03 == sensor.getType()) {
                                this.A00 = new SensorEventListener(this) { // from class: com.facebook.ads.redexgen.X.6M
                                    public final SensorEventListener A00;

                                    {
                                        this.A00 = this;
                                    }

                                    @Override // android.hardware.SensorEventListener
                                    @SuppressLint({"CatchGeneralException"})
                                    public final void onAccuracyChanged(Sensor sensor2, int i) {
                                        try {
                                            this.A00.onAccuracyChanged(sensor2, i);
                                        } catch (Throwable th) {
                                            C6B.A04(th);
                                        }
                                    }

                                    @Override // android.hardware.SensorEventListener
                                    @SuppressLint({"CatchGeneralException"})
                                    public final void onSensorChanged(SensorEvent sensorEvent) {
                                        try {
                                            this.A00.onSensorChanged(sensorEvent);
                                        } catch (Throwable th) {
                                            C6B.A04(th);
                                        }
                                    }
                                };
                                this.A02.registerListener(this.A00, sensor, 3, this.A03);
                                this.A08.put(Integer.valueOf(c6s.ordinal()), c6s);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            C6B.A04(th);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public final synchronized void A04(List<C6S> list) {
        try {
        } catch (Throwable t) {
            C6B.A04(t);
        }
        if (this.A08 == null) {
            return;
        }
        if (list == null) {
            this.A02.unregisterListener(this.A00);
            this.A05.A02();
            this.A08.clear();
            return;
        }
        for (C6S c6s : list) {
            int A03 = c6s.A03();
            if (A0A[5].charAt(31) != 'v') {
                Throwable t2 = new RuntimeException();
                throw t2;
            }
            String[] strArr = A0A;
            strArr[2] = "A8Tij6HFi5g0fGh7y9Y4xTKtDJl0XAe";
            strArr[2] = "A8Tij6HFi5g0fGh7y9Y4xTKtDJl0XAe";
            if (A03 != -1) {
                if (c6s.A03() == 0) {
                    this.A08.remove(Integer.valueOf(c6s.ordinal()));
                    if (C6N.A00[c6s.ordinal()] == 1) {
                        this.A05.A02();
                    }
                }
                Iterator<Sensor> it = this.A07.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Sensor next = it.next();
                        if (c6s.A03() == next.getType()) {
                            this.A02.unregisterListener(this.A00, next);
                            this.A08.remove(Integer.valueOf(c6s.ordinal()));
                            break;
                        }
                    }
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r9 != 18) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
        if (r9 == 20) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
        if (r9 == 12) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
        if (r9 == 13) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
        if (r9 != 18) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
        r13.A04.A02(new com.facebook.ads.redexgen.X.WT(r1, r4, r14.values[0]), com.facebook.ads.redexgen.X.C6I.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
        r13.A04.A02(new com.facebook.ads.redexgen.X.WT(r1, r4, r14.values[0]), com.facebook.ads.redexgen.X.C6I.A0C);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c7, code lost:
        r13.A04.A02(new com.facebook.ads.redexgen.X.WZ(r1, r4, new com.facebook.ads.redexgen.X.C6R(new float[]{r14.values[0], r14.values[1], r14.values[2], r14.values[3]})), com.facebook.ads.redexgen.X.C6I.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f4, code lost:
        r13.A04.A02(new com.facebook.ads.redexgen.X.WT(r1, r4, r14.values[0]), com.facebook.ads.redexgen.X.C6I.A0D);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    @Override // android.hardware.SensorEventListener
    @SuppressLint({"CatchGeneralException"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent == null) {
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C04546v c04546v = this.A06 == EnumC04456m.A0G ? null : new C04546v(this.A01 == null ? A00(0, 0, 32) : this.A01.getPackageName());
            int type = sensorEvent.sensor.getType();
            if (type == 1) {
                this.A04.A02(new WZ(elapsedRealtime, c04546v, new C6R(new float[]{sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]})), C6I.A03);
            } else if (type == 2) {
                this.A04.A02(new WZ(elapsedRealtime, c04546v, new C6R(new float[]{sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]})), C6I.A09);
            } else if (A0A[5].charAt(31) != 'v') {
                throw new RuntimeException();
            } else {
                String[] strArr = A0A;
                strArr[0] = "Z9wUmUlFqBx2iM7FQU5MK9bqFyvbextQ";
                strArr[6] = "qAPSTh6NWFJn67KuvhbHHX1Z8TvKPVYB";
                if (type == 4) {
                    this.A04.A02(new WZ(elapsedRealtime, c04546v, new C6R(new float[]{sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]})), C6I.A07);
                } else if (type == 5) {
                    this.A04.A02(new WT(elapsedRealtime, c04546v, sensorEvent.values[0]), C6I.A08);
                } else if (type == 6) {
                    this.A04.A02(new WT(elapsedRealtime, c04546v, sensorEvent.values[0]), C6I.A05);
                } else if (type == 8) {
                    this.A04.A02(new WT(elapsedRealtime, c04546v, sensorEvent.values[0]), C6I.A0B);
                } else {
                    String[] strArr2 = A0A;
                    if (strArr2[7].length() != strArr2[1].length()) {
                        String[] strArr3 = A0A;
                        strArr3[5] = "syyzhZCRGmpOnx7nGxFLeRKG3oOekAvv";
                        strArr3[5] = "syyzhZCRGmpOnx7nGxFLeRKG3oOekAvv";
                    } else {
                        String[] strArr4 = A0A;
                        strArr4[2] = "Y4dCFMF3F";
                        strArr4[2] = "Y4dCFMF3F";
                    }
                }
            }
        } catch (Throwable th) {
            C6B.A04(th);
        }
    }
}