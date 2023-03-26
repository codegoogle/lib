package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.p7700g.p99005.nr;
import com.p7700g.p99005.zg2;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzanz implements zzany {
    public static volatile zzapc zza;
    public MotionEvent zzb;
    public double zzk;
    public float zzl;
    public float zzm;
    public float zzn;
    public float zzo;
    public DisplayMetrics zzq;
    private double zzr;
    private double zzs;
    public final LinkedList zzc = new LinkedList();
    public long zzd = 0;
    public long zze = 0;
    public long zzf = 0;
    public long zzg = 0;
    public long zzh = 0;
    public long zzi = 0;
    public long zzj = 0;
    private boolean zzt = false;
    public boolean zzp = false;

    public zzanz(Context context) {
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcu)).booleanValue()) {
                zzamr.zzd();
            } else {
                zzapd.zza(zza);
            }
            this.zzq = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    private final void zzj() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        if (this.zzc.size() > 0) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.zzc.clear();
        } else {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.zzb = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzm(Context context, String str, int i, View view, Activity activity, byte[] bArr) {
        zzanx zzanxVar;
        String str2;
        int i2;
        Exception exc;
        int i3;
        int i4;
        String zza2;
        int i5;
        int i6 = i;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcb)).booleanValue();
        zzali zzaliVar = null;
        if (booleanValue) {
            zzanxVar = zza != null ? zza.zzd() : null;
            str2 = true != ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcu)).booleanValue() ? "te" : "be";
        } else {
            zzanxVar = null;
            str2 = null;
        }
        try {
            if (i6 == 3) {
                zzaliVar = zzb(context, view, activity);
                try {
                    this.zzt = true;
                    i5 = 1002;
                } catch (Exception e) {
                    exc = e;
                    i2 = 3;
                    if (booleanValue) {
                        if (i6 != i2) {
                        }
                        zzanxVar.zzc(i4, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (zzaliVar != null) {
                        }
                        zza2 = Integer.toString(5);
                        return zza2;
                    }
                    i3 = 2;
                    long currentTimeMillis22 = System.currentTimeMillis();
                    if (zzaliVar != null) {
                    }
                    zza2 = Integer.toString(5);
                    return zza2;
                }
            } else if (i6 == 2) {
                zzaliVar = zzd(context, view, activity);
                i5 = 1008;
            } else {
                zzaliVar = zzc(context, null);
                i5 = 1000;
            }
            if (!booleanValue || zzanxVar == null) {
                i2 = 3;
            } else {
                i2 = 3;
                try {
                    zzanxVar.zzc(i5, -1, System.currentTimeMillis() - currentTimeMillis, str2, null);
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    if (booleanValue && zzanxVar != null) {
                        if (i6 != i2) {
                            i3 = 2;
                            i4 = 1003;
                        } else {
                            i3 = 2;
                            if (i6 == 2) {
                                i4 = nr.j;
                            } else {
                                i6 = 1;
                                i4 = 1001;
                            }
                        }
                        zzanxVar.zzc(i4, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis222 = System.currentTimeMillis();
                        if (zzaliVar != null) {
                        }
                        zza2 = Integer.toString(5);
                        return zza2;
                    }
                    i3 = 2;
                    long currentTimeMillis2222 = System.currentTimeMillis();
                    if (zzaliVar != null) {
                    }
                    zza2 = Integer.toString(5);
                    return zza2;
                }
            }
        } catch (Exception e3) {
            e = e3;
            i2 = 3;
        }
        i3 = 2;
        long currentTimeMillis22222 = System.currentTimeMillis();
        if (zzaliVar != null) {
            try {
            } catch (Exception e4) {
                zza2 = Integer.toString(7);
                if (booleanValue && zzanxVar != null) {
                    zzanxVar.zzc(i6 == i2 ? 1007 : i6 == i3 ? 1011 : 1005, -1, System.currentTimeMillis() - currentTimeMillis22222, str2, e4);
                }
            }
            if (((zzaly) zzaliVar.zzal()).zzax() != 0) {
                zza2 = zzamr.zza((zzaly) zzaliVar.zzal(), str);
                if (booleanValue && zzanxVar != null) {
                    zzanxVar.zzc(i6 == i2 ? 1006 : i6 == i3 ? 1010 : 1004, -1, System.currentTimeMillis() - currentTimeMillis22222, str2, null);
                }
                return zza2;
            }
        }
        zza2 = Integer.toString(5);
        return zza2;
    }

    public abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzaot;

    public abstract zzali zzb(Context context, View view, Activity activity);

    public abstract zzali zzc(Context context, zzalb zzalbVar);

    public abstract zzali zzd(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zze(Context context, String str, View view) {
        return zzm(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zzf(Context context, String str, View view, Activity activity) {
        return zzm(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zzg(Context context) {
        if (!zzapf.zzf()) {
            return zzm(context, null, 1, null, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zzh(Context context, View view, Activity activity) {
        return zzm(context, null, 2, view, activity, null);
    }

    public abstract zzape zzi(MotionEvent motionEvent) throws zzaot;

    @Override // com.google.android.gms.internal.ads.zzany
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l;
        if (this.zzt) {
            zzj();
            this.zzt = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzk = zg2.s;
            this.zzr = motionEvent.getRawX();
            this.zzs = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = rawX - this.zzr;
            double d2 = rawY - this.zzs;
            this.zzk += Math.sqrt((d2 * d2) + (d * d));
            this.zzr = rawX;
            this.zzs = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.zzb = obtain;
                    this.zzc.add(obtain);
                    if (this.zzc.size() > 6) {
                        ((MotionEvent) this.zzc.remove()).recycle();
                    }
                    this.zzf++;
                    this.zzh = zza(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.zze += motionEvent.getHistorySize() + 1;
                    zzape zzi = zzi(motionEvent);
                    Long l2 = zzi.zzd;
                    if (l2 != null && zzi.zzg != null) {
                        this.zzi = l2.longValue() + zzi.zzg.longValue() + this.zzi;
                    }
                    if (this.zzq != null && (l = zzi.zze) != null && zzi.zzh != null) {
                        this.zzj = l.longValue() + zzi.zzh.longValue() + this.zzj;
                    }
                } else if (action2 == 3) {
                    this.zzg++;
                }
            } catch (zzaot unused) {
            }
        } else {
            this.zzl = motionEvent.getX();
            this.zzm = motionEvent.getY();
            this.zzn = motionEvent.getRawX();
            this.zzo = motionEvent.getRawY();
            this.zzd++;
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final synchronized void zzl(int i, int i2, int i3) {
        if (this.zzb != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbZ)).booleanValue()) {
                zzj();
            } else {
                this.zzb.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.zzq;
        if (displayMetrics != null) {
            float f = displayMetrics.density;
            this.zzb = MotionEvent.obtain(0L, i3, 1, i * f, i2 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.zzb = null;
        }
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public void zzn(View view) {
    }
}