package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzil;
import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
public abstract class zzil<MessageType extends zzil<MessageType, BuilderType>, BuilderType extends zzik<MessageType, BuilderType>> implements zzlj {
    public int zzb = 0;

    public static void zzbw(Iterable iterable, List list) {
        zzkk.zze(iterable);
        if (iterable instanceof zzkr) {
            List zzh = ((zzkr) iterable).zzh();
            zzkr zzkrVar = (zzkr) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    int size2 = zzkrVar.size();
                    StringBuilder G = wo1.G("Element at index ");
                    G.append(size2 - size);
                    G.append(" is null.");
                    String sb = G.toString();
                    int size3 = zzkrVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            break;
                        }
                        zzkrVar.remove(size3);
                    }
                    throw new NullPointerException(sb);
                } else if (obj instanceof zzjb) {
                    zzkrVar.zzi((zzjb) obj);
                } else {
                    zzkrVar.add((String) obj);
                }
            }
        } else if (!(iterable instanceof zzlq)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size4 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    int size5 = list.size();
                    StringBuilder G2 = wo1.G("Element at index ");
                    G2.append(size5 - size4);
                    G2.append(" is null.");
                    String sb2 = G2.toString();
                    int size6 = list.size();
                    while (true) {
                        size6--;
                        if (size6 < size4) {
                            break;
                        }
                        list.remove(size6);
                    }
                    throw new NullPointerException(sb2);
                }
                list.add(obj2);
            }
        } else {
            list.addAll((Collection) iterable);
        }
    }

    public int zzbu() {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final zzjb zzbv() {
        try {
            int zzbz = zzbz();
            zzjb zzjbVar = zzjb.zzb;
            byte[] bArr = new byte[zzbz];
            zzjj zzC = zzjj.zzC(bArr);
            zzbN(zzC);
            zzC.zzD();
            return new zziy(bArr);
        } catch (IOException e) {
            throw new RuntimeException(wo1.u("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public void zzbx(int i) {
        throw null;
    }

    public final byte[] zzby() {
        try {
            byte[] bArr = new byte[zzbz()];
            zzjj zzC = zzjj.zzC(bArr);
            zzbN(zzC);
            zzC.zzD();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(wo1.u("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}