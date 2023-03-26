package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfxk {
    private static final Logger zza = Logger.getLogger(zzfxk.class.getName());
    private static final ConcurrentMap zzb = new ConcurrentHashMap();
    private static final ConcurrentMap zzc = new ConcurrentHashMap();
    private static final ConcurrentMap zzd = new ConcurrentHashMap();
    private static final ConcurrentMap zze = new ConcurrentHashMap();
    private static final ConcurrentMap zzf = new ConcurrentHashMap();
    private static final ConcurrentMap zzg = new ConcurrentHashMap();

    private zzfxk() {
    }

    @Deprecated
    public static zzfwi zza(String str) throws GeneralSecurityException {
        if (str != null) {
            ConcurrentMap concurrentMap = zze;
            Locale locale = Locale.US;
            zzfwi zzfwiVar = (zzfwi) concurrentMap.get(str.toLowerCase(locale));
            if (zzfwiVar == null) {
                String format = String.format("no catalogue found for %s. ", str);
                if (str.toLowerCase(locale).startsWith("tinkaead")) {
                    format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
                }
                if (!str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
                    if (!str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
                        if (!str.toLowerCase(locale).startsWith("tinkhybriddecrypt") && !str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
                            if (!str.toLowerCase(locale).startsWith("tinkmac")) {
                                if (!str.toLowerCase(locale).startsWith("tinkpublickeysign") && !str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
                                    if (str.toLowerCase(locale).startsWith("tink")) {
                                        format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
                                    }
                                } else {
                                    format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
                                }
                            } else {
                                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
                            }
                        } else {
                            format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
                        }
                    } else {
                        format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
                    }
                } else {
                    format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
                }
                throw new GeneralSecurityException(format);
            }
            return zzfwiVar;
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    public static zzfwo zzb(String str) throws GeneralSecurityException {
        return zzp(str).zzb();
    }

    public static synchronized zzgfj zzc(zzgfo zzgfoVar) throws GeneralSecurityException {
        zzgfj zza2;
        synchronized (zzfxk.class) {
            zzfwo zzb2 = zzb(zzgfoVar.zzf());
            if (((Boolean) zzd.get(zzgfoVar.zzf())).booleanValue()) {
                zza2 = zzb2.zza(zzgfoVar.zze());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgfoVar.zzf())));
            }
        }
        return zza2;
    }

    public static synchronized zzgma zzd(zzgfo zzgfoVar) throws GeneralSecurityException {
        zzgma zzb2;
        synchronized (zzfxk.class) {
            zzfwo zzb3 = zzb(zzgfoVar.zzf());
            if (((Boolean) zzd.get(zzgfoVar.zzf())).booleanValue()) {
                zzb2 = zzb3.zzb(zzgfoVar.zze());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgfoVar.zzf())));
            }
        }
        return zzb2;
    }

    public static Class zze(Class cls) {
        zzfxd zzfxdVar = (zzfxd) zzf.get(cls);
        if (zzfxdVar == null) {
            return null;
        }
        return zzfxdVar.zza();
    }

    public static Object zzf(zzgfj zzgfjVar, Class cls) throws GeneralSecurityException {
        return zzq(zzgfjVar.zzf(), zzgfjVar.zze(), cls);
    }

    public static Object zzg(String str, zzgma zzgmaVar, Class cls) throws GeneralSecurityException {
        return zzo(str, cls).zze(zzgmaVar);
    }

    public static Object zzh(String str, byte[] bArr, Class cls) throws GeneralSecurityException {
        return zzq(str, zzgji.zzv(bArr), cls);
    }

    public static Object zzi(zzfxc zzfxcVar, Class cls) throws GeneralSecurityException {
        zzfxd zzfxdVar = (zzfxd) zzf.get(cls);
        if (zzfxdVar != null) {
            if (zzfxdVar.zza().equals(zzfxcVar.zzd())) {
                return zzfxdVar.zzc(zzfxcVar);
            }
            throw new GeneralSecurityException(wo1.v("Wrong input primitive class, expected ", zzfxdVar.zza().toString(), ", got ", zzfxcVar.zzd().toString()));
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(zzfxcVar.zzd().getName()));
    }

    public static synchronized Map zzj() {
        Map unmodifiableMap;
        synchronized (zzfxk.class) {
            unmodifiableMap = Collections.unmodifiableMap(zzg);
        }
        return unmodifiableMap;
    }

    public static synchronized void zzk(zzgau zzgauVar, zzgas zzgasVar, boolean z) throws GeneralSecurityException {
        Class zzd2;
        synchronized (zzfxk.class) {
            String zzc2 = zzgauVar.zzc();
            String zzc3 = zzgasVar.zzc();
            zzr(zzc2, zzgauVar.getClass(), zzgauVar.zza().zzc(), true);
            zzr(zzc3, zzgasVar.getClass(), Collections.emptyMap(), false);
            if (!zzc2.equals(zzc3)) {
                int zze2 = zzgasVar.zze();
                if (zzfze.zza(1)) {
                    if (zzfze.zza(zze2)) {
                        ConcurrentMap concurrentMap = zzb;
                        if (concurrentMap.containsKey(zzc2) && (zzd2 = ((zzfxj) concurrentMap.get(zzc2)).zzd()) != null && !zzd2.getName().equals(zzgasVar.getClass().getName())) {
                            Logger logger = zza;
                            Level level = Level.WARNING;
                            logger.logp(level, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + zzc2 + " with inconsistent public key type " + zzc3);
                            throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", zzgauVar.getClass().getName(), zzd2.getName(), zzgasVar.getClass().getName()));
                        }
                        if (!concurrentMap.containsKey(zzc2) || ((zzfxj) concurrentMap.get(zzc2)).zzd() == null) {
                            concurrentMap.put(zzc2, new zzfxh(zzgauVar, zzgasVar));
                            zzc.put(zzc2, new zzfxi(zzgauVar));
                            zzs(zzgauVar.zzc(), zzgauVar.zza().zzc());
                        }
                        ConcurrentMap concurrentMap2 = zzd;
                        concurrentMap2.put(zzc2, Boolean.TRUE);
                        if (!concurrentMap.containsKey(zzc3)) {
                            concurrentMap.put(zzc3, new zzfxg(zzgasVar));
                        }
                        concurrentMap2.put(zzc3, Boolean.FALSE);
                    } else {
                        String valueOf = String.valueOf(zzgasVar.getClass());
                        throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
                    }
                } else {
                    String valueOf2 = String.valueOf(zzgauVar.getClass());
                    throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
                }
            } else {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
        }
    }

    public static synchronized void zzl(zzfwo zzfwoVar, boolean z) throws GeneralSecurityException {
        synchronized (zzfxk.class) {
            try {
                if (zzfwoVar != null) {
                    if (zzfze.zza(1)) {
                        String zzf2 = zzfwoVar.zzf();
                        zzr(zzf2, zzfwoVar.getClass(), Collections.emptyMap(), z);
                        zzb.putIfAbsent(zzf2, new zzfxf(zzfwoVar));
                        zzd.put(zzf2, Boolean.valueOf(z));
                    } else {
                        throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
                    }
                } else {
                    throw new IllegalArgumentException("key manager must be non-null.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void zzm(zzgas zzgasVar, boolean z) throws GeneralSecurityException {
        synchronized (zzfxk.class) {
            String zzc2 = zzgasVar.zzc();
            zzr(zzc2, zzgasVar.getClass(), zzgasVar.zza().zzc(), true);
            if (zzfze.zza(zzgasVar.zze())) {
                ConcurrentMap concurrentMap = zzb;
                if (!concurrentMap.containsKey(zzc2)) {
                    concurrentMap.put(zzc2, new zzfxg(zzgasVar));
                    zzc.put(zzc2, new zzfxi(zzgasVar));
                    zzs(zzc2, zzgasVar.zza().zzc());
                }
                zzd.put(zzc2, Boolean.TRUE);
            } else {
                String valueOf = String.valueOf(zzgasVar.getClass());
                throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
            }
        }
    }

    public static synchronized void zzn(zzfxd zzfxdVar) throws GeneralSecurityException {
        synchronized (zzfxk.class) {
            if (zzfxdVar != null) {
                Class zzb2 = zzfxdVar.zzb();
                ConcurrentMap concurrentMap = zzf;
                if (concurrentMap.containsKey(zzb2)) {
                    zzfxd zzfxdVar2 = (zzfxd) concurrentMap.get(zzb2);
                    if (!zzfxdVar.getClass().getName().equals(zzfxdVar2.getClass().getName())) {
                        zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(zzb2.toString()));
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", zzb2.getName(), zzfxdVar2.getClass().getName(), zzfxdVar.getClass().getName()));
                    }
                }
                concurrentMap.put(zzb2, zzfxdVar);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    private static zzfwo zzo(String str, Class cls) throws GeneralSecurityException {
        zzfxj zzp = zzp(str);
        if (zzp.zze().contains(cls)) {
            return zzp.zza(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzp.zzc());
        Set<Class> zze2 = zzp.zze();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : zze2) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder N = wo1.N("Primitive type ", name, " not supported by key manager of type ", valueOf, ", supported primitives: ");
        N.append(sb2);
        throw new GeneralSecurityException(N.toString());
    }

    private static synchronized zzfxj zzp(String str) throws GeneralSecurityException {
        zzfxj zzfxjVar;
        synchronized (zzfxk.class) {
            ConcurrentMap concurrentMap = zzb;
            if (concurrentMap.containsKey(str)) {
                zzfxjVar = (zzfxj) concurrentMap.get(str);
            } else {
                throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
            }
        }
        return zzfxjVar;
    }

    private static Object zzq(String str, zzgji zzgjiVar, Class cls) throws GeneralSecurityException {
        return zzo(str, cls).zzd(zzgjiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
        r6 = com.google.android.gms.internal.ads.zzfxk.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
        if (r6.containsKey(r5) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
        if (((java.lang.Boolean) r6.get(r5)).booleanValue() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
        throw new java.security.GeneralSecurityException("New keys are already disallowed for key type ".concat(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
        if (r1.containsKey(r5) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
        r6 = r7.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (r6.hasNext() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
        r7 = (java.util.Map.Entry) r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
        if (com.google.android.gms.internal.ads.zzfxk.zzg.containsKey(r7.getKey()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
        throw new java.security.GeneralSecurityException("Attempted to register a new key template " + ((java.lang.String) r7.getKey()) + " from an existing key manager of type " + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bc, code lost:
        r5 = r7.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
        if (r5.hasNext() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
        r6 = (java.util.Map.Entry) r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00da, code lost:
        if (com.google.android.gms.internal.ads.zzfxk.zzg.containsKey(r6.getKey()) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f2, code lost:
        throw new java.security.GeneralSecurityException("Attempted overwrite of a registered key template ".concat(java.lang.String.valueOf((java.lang.String) r6.getKey())));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static synchronized void zzr(String str, Class cls, Map map, boolean z) throws GeneralSecurityException {
        synchronized (zzfxk.class) {
            ConcurrentMap concurrentMap = zzb;
            zzfxj zzfxjVar = (zzfxj) concurrentMap.get(str);
            if (zzfxjVar != null && !zzfxjVar.zzc().equals(cls)) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, zzfxjVar.zzc().getName(), cls.getName()));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, com.google.android.gms.internal.ads.zzgma] */
    private static void zzs(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzg.put((String) entry.getKey(), zzfwr.zze(str, ((zzgaq) entry.getValue()).zza.zzaw(), ((zzgaq) entry.getValue()).zzb));
        }
    }
}