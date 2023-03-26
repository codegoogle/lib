package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zza uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzju {
    public static final zzju zzA;
    public static final zzju zzB;
    public static final zzju zzC;
    public static final zzju zzD;
    public static final zzju zzE;
    public static final zzju zzF;
    public static final zzju zzG;
    public static final zzju zzH;
    public static final zzju zzI;
    public static final zzju zzJ;
    public static final zzju zzK;
    public static final zzju zzL;
    public static final zzju zzM;
    public static final zzju zzN;
    public static final zzju zzO;
    public static final zzju zzP;
    public static final zzju zzQ;
    public static final zzju zzR;
    public static final zzju zzS;
    public static final zzju zzT;
    public static final zzju zzU;
    public static final zzju zzV;
    public static final zzju zzW;
    public static final zzju zzX;
    public static final zzju zzY;
    private static final zzju[] zzZ;
    public static final zzju zza;
    private static final /* synthetic */ zzju[] zzaa;
    public static final zzju zzb;
    public static final zzju zzc;
    public static final zzju zzd;
    public static final zzju zze;
    public static final zzju zzf;
    public static final zzju zzg;
    public static final zzju zzh;
    public static final zzju zzi;
    public static final zzju zzj;
    public static final zzju zzk;
    public static final zzju zzl;
    public static final zzju zzm;
    public static final zzju zzn;
    public static final zzju zzo;
    public static final zzju zzp;
    public static final zzju zzq;
    public static final zzju zzr;
    public static final zzju zzs;
    public static final zzju zzt;
    public static final zzju zzu;
    public static final zzju zzv;
    public static final zzju zzw;
    public static final zzju zzx;
    public static final zzju zzy;
    public static final zzju zzz;
    private final zzkn zzab;
    private final int zzac;
    private final Class zzad;

    static {
        zzkn zzknVar = zzkn.zze;
        zza = new zzju("DOUBLE", 0, 0, 1, zzknVar);
        zzkn zzknVar2 = zzkn.zzd;
        zzb = new zzju("FLOAT", 1, 1, 1, zzknVar2);
        zzkn zzknVar3 = zzkn.zzc;
        zzc = new zzju("INT64", 2, 2, 1, zzknVar3);
        zzd = new zzju("UINT64", 3, 3, 1, zzknVar3);
        zzkn zzknVar4 = zzkn.zzb;
        zze = new zzju("INT32", 4, 4, 1, zzknVar4);
        zzf = new zzju("FIXED64", 5, 5, 1, zzknVar3);
        zzg = new zzju("FIXED32", 6, 6, 1, zzknVar4);
        zzkn zzknVar5 = zzkn.zzf;
        zzh = new zzju("BOOL", 7, 7, 1, zzknVar5);
        zzkn zzknVar6 = zzkn.zzg;
        zzi = new zzju("STRING", 8, 8, 1, zzknVar6);
        zzkn zzknVar7 = zzkn.zzj;
        zzj = new zzju("MESSAGE", 9, 9, 1, zzknVar7);
        zzkn zzknVar8 = zzkn.zzh;
        zzk = new zzju("BYTES", 10, 10, 1, zzknVar8);
        zzl = new zzju("UINT32", 11, 11, 1, zzknVar4);
        zzkn zzknVar9 = zzkn.zzi;
        zzm = new zzju("ENUM", 12, 12, 1, zzknVar9);
        zzn = new zzju("SFIXED32", 13, 13, 1, zzknVar4);
        zzo = new zzju("SFIXED64", 14, 14, 1, zzknVar3);
        zzp = new zzju("SINT32", 15, 15, 1, zzknVar4);
        zzq = new zzju("SINT64", 16, 16, 1, zzknVar3);
        zzr = new zzju("GROUP", 17, 17, 1, zzknVar7);
        zzs = new zzju("DOUBLE_LIST", 18, 18, 2, zzknVar);
        zzt = new zzju("FLOAT_LIST", 19, 19, 2, zzknVar2);
        zzu = new zzju("INT64_LIST", 20, 20, 2, zzknVar3);
        zzv = new zzju("UINT64_LIST", 21, 21, 2, zzknVar3);
        zzw = new zzju("INT32_LIST", 22, 22, 2, zzknVar4);
        zzx = new zzju("FIXED64_LIST", 23, 23, 2, zzknVar3);
        zzy = new zzju("FIXED32_LIST", 24, 24, 2, zzknVar4);
        zzz = new zzju("BOOL_LIST", 25, 25, 2, zzknVar5);
        zzA = new zzju("STRING_LIST", 26, 26, 2, zzknVar6);
        zzB = new zzju("MESSAGE_LIST", 27, 27, 2, zzknVar7);
        zzC = new zzju("BYTES_LIST", 28, 28, 2, zzknVar8);
        zzD = new zzju("UINT32_LIST", 29, 29, 2, zzknVar4);
        zzE = new zzju("ENUM_LIST", 30, 30, 2, zzknVar9);
        zzF = new zzju("SFIXED32_LIST", 31, 31, 2, zzknVar4);
        zzG = new zzju("SFIXED64_LIST", 32, 32, 2, zzknVar3);
        zzH = new zzju("SINT32_LIST", 33, 33, 2, zzknVar4);
        zzI = new zzju("SINT64_LIST", 34, 34, 2, zzknVar3);
        zzJ = new zzju("DOUBLE_LIST_PACKED", 35, 35, 3, zzknVar);
        zzK = new zzju("FLOAT_LIST_PACKED", 36, 36, 3, zzknVar2);
        zzL = new zzju("INT64_LIST_PACKED", 37, 37, 3, zzknVar3);
        zzM = new zzju("UINT64_LIST_PACKED", 38, 38, 3, zzknVar3);
        zzN = new zzju("INT32_LIST_PACKED", 39, 39, 3, zzknVar4);
        zzO = new zzju("FIXED64_LIST_PACKED", 40, 40, 3, zzknVar3);
        zzP = new zzju("FIXED32_LIST_PACKED", 41, 41, 3, zzknVar4);
        zzQ = new zzju("BOOL_LIST_PACKED", 42, 42, 3, zzknVar5);
        zzR = new zzju("UINT32_LIST_PACKED", 43, 43, 3, zzknVar4);
        zzS = new zzju("ENUM_LIST_PACKED", 44, 44, 3, zzknVar9);
        zzT = new zzju("SFIXED32_LIST_PACKED", 45, 45, 3, zzknVar4);
        zzkn zzknVar10 = zzkn.zzc;
        zzU = new zzju("SFIXED64_LIST_PACKED", 46, 46, 3, zzknVar10);
        zzV = new zzju("SINT32_LIST_PACKED", 47, 47, 3, zzknVar4);
        zzW = new zzju("SINT64_LIST_PACKED", 48, 48, 3, zzknVar10);
        zzX = new zzju("GROUP_LIST", 49, 49, 2, zzknVar7);
        zzY = new zzju("MAP", 50, 50, 4, zzkn.zza);
        zzaa = new zzju[]{zza, zzb, zzc, zzd, zze, zzf, zzg, zzh, zzi, zzj, zzk, zzl, zzm, zzn, zzo, zzp, zzq, zzr, zzs, zzt, zzu, zzv, zzw, zzx, zzy, zzz, zzA, zzB, zzC, zzD, zzE, zzF, zzG, zzH, zzI, zzJ, zzK, zzL, zzM, zzN, zzO, zzP, zzQ, zzR, zzS, zzT, zzU, zzV, zzW, zzX, zzY};
        zzju[] values = values();
        zzZ = new zzju[51];
        for (int i = 0; i < 51; i++) {
            zzju zzjuVar = values[i];
            zzZ[zzjuVar.zzac] = zzjuVar;
        }
    }

    private zzju(String str, int i, int i2, int i3, zzkn zzknVar) {
        this.zzac = i2;
        this.zzab = zzknVar;
        zzkn zzknVar2 = zzkn.zza;
        int i4 = i3 - 1;
        if (i4 == 1) {
            this.zzad = zzknVar.zza();
        } else if (i4 != 3) {
            this.zzad = null;
        } else {
            this.zzad = zzknVar.zza();
        }
        if (i3 == 1) {
            zzknVar.ordinal();
        }
    }

    public static zzju[] values() {
        return (zzju[]) zzaa.clone();
    }

    public final int zza() {
        return this.zzac;
    }
}