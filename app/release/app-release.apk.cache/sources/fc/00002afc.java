package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfsx extends zzfrm {
    public static final zzfrm zza = new zzfsx(null, new Object[0], 0);
    public final transient Object[] zzb;
    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzfsx(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r5v3 ??, r5v10 ??, r5v6 short[], r5v11 byte[]]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.tryInsertAdditionalMove(TypeInferenceVisitor.java:742)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:109)
        */
    public static com.google.android.gms.internal.ads.zzfsx zzh(int r17, java.lang.Object[] r18, com.google.android.gms.internal.ads.zzfrl r19) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfsx.zzh(int, java.lang.Object[], com.google.android.gms.internal.ads.zzfrl):com.google.android.gms.internal.ads.zzfsx");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzfrm, java.util.Map
    @CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        Object obj3 = this.zzc;
        Object[] objArr = this.zzb;
        int i = this.zzd;
        if (obj != null) {
            if (i == 1) {
                Object obj4 = objArr[0];
                obj4.getClass();
                if (obj4.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                }
            } else if (obj3 != null) {
                if (obj3 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj3;
                    int length = bArr.length - 1;
                    int zza2 = zzfrb.zza(obj.hashCode());
                    while (true) {
                        int i2 = zza2 & length;
                        int i3 = bArr[i2] & 255;
                        if (i3 == 255) {
                            break;
                        } else if (obj.equals(objArr[i3])) {
                            obj2 = objArr[i3 ^ 1];
                            break;
                        } else {
                            zza2 = i2 + 1;
                        }
                    }
                } else if (obj3 instanceof short[]) {
                    short[] sArr = (short[]) obj3;
                    int length2 = sArr.length - 1;
                    int zza3 = zzfrb.zza(obj.hashCode());
                    while (true) {
                        int i4 = zza3 & length2;
                        char c = (char) sArr[i4];
                        if (c == 65535) {
                            break;
                        } else if (obj.equals(objArr[c])) {
                            obj2 = objArr[c ^ 1];
                            break;
                        } else {
                            zza3 = i4 + 1;
                        }
                    }
                } else {
                    int[] iArr = (int[]) obj3;
                    int length3 = iArr.length - 1;
                    int zza4 = zzfrb.zza(obj.hashCode());
                    while (true) {
                        int i5 = zza4 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        } else if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                            break;
                        } else {
                            zza4 = i5 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final zzfre zza() {
        return new zzfsw(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final zzfro zze() {
        return new zzfsu(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final zzfro zzf() {
        return new zzfsv(this, new zzfsw(this.zzb, 0, this.zzd));
    }
}