package com.google.android.gms.internal.ads;

import android.net.Network;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfnr extends zzfnf {
    private zzfpj<Integer> zza;
    private zzfpj<Integer> zzb;
    @z1
    private zzfnq zzc;
    @z1
    private HttpURLConnection zzd;

    public zzfnr() {
        this(zzfno.zza, zzfnp.zza, null);
    }

    public zzfnr(zzfpj<Integer> zzfpjVar, zzfpj<Integer> zzfpjVar2, @z1 zzfnq zzfnqVar) {
        this.zza = zzfpjVar;
        this.zzb = zzfpjVar2;
        this.zzc = zzfnqVar;
    }

    public static /* synthetic */ Integer zzf() {
        return -1;
    }

    public static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static /* synthetic */ Integer zzh(int i) {
        return Integer.valueOf(i);
    }

    public static /* synthetic */ Integer zzi(int i) {
        return Integer.valueOf(i);
    }

    public static /* synthetic */ Integer zzj(int i) {
        return Integer.valueOf(i);
    }

    public static /* synthetic */ Integer zzk(int i) {
        return Integer.valueOf(i);
    }

    public static /* synthetic */ Integer zzl(int i) {
        return Integer.valueOf(i);
    }

    public static /* synthetic */ URLConnection zzp(URL url) throws IOException {
        return url.openConnection();
    }

    public static /* synthetic */ URLConnection zzq(Network network, URL url) throws IOException {
        return network.openConnection(url);
    }

    public static void zzs(@z1 HttpURLConnection httpURLConnection) {
        zzfng.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfng.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfnq zzfnqVar = this.zzc;
        Objects.requireNonNull(zzfnqVar);
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfnqVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfnq zzfnqVar, final int i, final int i2) throws IOException {
        this.zza = new zzfpj() { // from class: com.google.android.gms.internal.ads.zzfnh
            @Override // com.google.android.gms.internal.ads.zzfpj
            public final Object zza() {
                return zzfnr.zzk(i);
            }
        };
        this.zzb = new zzfpj() { // from class: com.google.android.gms.internal.ads.zzfni
            @Override // com.google.android.gms.internal.ads.zzfpj
            public final Object zza() {
                return zzfnr.zzl(i2);
            }
        };
        this.zzc = zzfnqVar;
        return zzm();
    }

    @e2(21)
    public HttpURLConnection zzo(@x1 final Network network, @x1 final URL url, final int i, final int i2) throws IOException {
        this.zza = new zzfpj() { // from class: com.google.android.gms.internal.ads.zzfnj
            @Override // com.google.android.gms.internal.ads.zzfpj
            public final Object zza() {
                return zzfnr.zzi(i);
            }
        };
        this.zzb = new zzfpj() { // from class: com.google.android.gms.internal.ads.zzfnk
            @Override // com.google.android.gms.internal.ads.zzfpj
            public final Object zza() {
                return zzfnr.zzj(i2);
            }
        };
        this.zzc = new zzfnq() { // from class: com.google.android.gms.internal.ads.zzfnl
            @Override // com.google.android.gms.internal.ads.zzfnq
            public final URLConnection zza() {
                return zzfnr.zzq(network, url);
            }
        };
        return zzm();
    }

    public URLConnection zzr(@x1 final URL url, final int i) throws IOException {
        this.zza = new zzfpj() { // from class: com.google.android.gms.internal.ads.zzfnm
            @Override // com.google.android.gms.internal.ads.zzfpj
            public final Object zza() {
                return zzfnr.zzh(i);
            }
        };
        this.zzc = new zzfnq() { // from class: com.google.android.gms.internal.ads.zzfnn
            @Override // com.google.android.gms.internal.ads.zzfnq
            public final URLConnection zza() {
                return zzfnr.zzp(url);
            }
        };
        return zzm();
    }
}