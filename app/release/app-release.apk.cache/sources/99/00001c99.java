package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzamr {
    public static boolean zza = false;
    private static MessageDigest zzc;
    private static final Object zzd = new Object();
    private static final Object zze = new Object();
    public static final CountDownLatch zzb = new CountDownLatch(1);

    public static String zza(zzaly zzalyVar, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] zzg;
        byte[] zzaw = zzalyVar.zzaw();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcu)).booleanValue()) {
            Vector zzb2 = zzb(zzaw, 255);
            if (zzb2 != null && zzb2.size() != 0) {
                zzamk zza2 = zzaml.zza();
                int size = zzb2.size();
                for (int i = 0; i < size; i++) {
                    zza2.zza(zzgji.zzv(zzg((byte[]) zzb2.get(i), str, false)));
                }
                zza2.zzb(zzgji.zzv(zze(zzaw)));
                zzg = ((zzaml) zza2.zzal()).zzaw();
            } else {
                zzg = zzg(zzf(4096).zzaw(), str, true);
            }
        } else if (zzapd.zza != null) {
            byte[] zza3 = zzapd.zza.zza(zzaw, str != null ? str.getBytes() : new byte[0]);
            zzamk zza4 = zzaml.zza();
            zza4.zza(zzgji.zzv(zza3));
            zza4.zzc(3);
            zzg = ((zzaml) zza4.zzal()).zzaw();
        } else {
            throw new GeneralSecurityException();
        }
        return zzamn.zza(zzg, true);
    }

    public static Vector zzb(byte[] bArr, int i) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i2 = (length + 254) / 255;
        Vector vector = new Vector();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static void zzd() {
        synchronized (zze) {
            if (!zza) {
                zza = true;
                new Thread(new zzamq(null)).start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x001e, code lost:
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.zzamr.zzc.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] zze(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] digest;
        MessageDigest messageDigest;
        synchronized (zzd) {
            zzd();
            MessageDigest messageDigest2 = null;
            try {
                if (zzb.await(2L, TimeUnit.SECONDS) && (messageDigest = zzc) != null) {
                    messageDigest2 = messageDigest;
                }
            } catch (InterruptedException unused) {
            }
            throw new NoSuchAlgorithmException("Cannot compute hash");
        }
        return digest;
        throw new NoSuchAlgorithmException("Cannot compute hash");
    }

    public static zzaly zzf(int i) {
        zzali zza2 = zzaly.zza();
        zza2.zzC(PlaybackStateCompat.E);
        return (zzaly) zza2.zzal();
    }

    private static byte[] zzg(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] array;
        int i = true != z ? 255 : 239;
        if (bArr.length > i) {
            bArr = zzf(4096).zzaw();
        }
        int length = bArr.length;
        if (length < i) {
            byte[] bArr2 = new byte[i - length];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).array();
        }
        if (z) {
            array = ByteBuffer.allocate(256).put(zze(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        zzams[] zzamsVarArr = new zzanr().zzcG;
        int length2 = zzamsVarArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            zzamsVarArr[i2].zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzgip(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}