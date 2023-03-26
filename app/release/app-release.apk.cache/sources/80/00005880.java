package com.p7700g.p99005;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import com.p7700g.p99005.tn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: FontProvider.java */
/* loaded from: classes.dex */
public class qn {
    private static final Comparator<byte[]> a = mn.s;

    /* compiled from: FontProvider.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    private qn() {
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> c(rn rnVar, Resources resources) {
        if (rnVar.b() != null) {
            return rnVar.b();
        }
        return li.c(resources, rnVar.c());
    }

    @x1
    public static tn.b d(@x1 Context context, @x1 rn rnVar, @z1 CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo e = e(context.getPackageManager(), rnVar, context.getResources());
        if (e == null) {
            return tn.b.a(1, null);
        }
        return tn.b.a(0, g(context, rnVar, e.authority, cancellationSignal));
    }

    @r2
    @z1
    public static ProviderInfo e(@x1 PackageManager packageManager, @x1 rn rnVar, @z1 Resources resources) throws PackageManager.NameNotFoundException {
        String f = rnVar.f();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(f, 0);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.packageName.equals(rnVar.g())) {
                List<byte[]> a2 = a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(a2, a);
                List<List<byte[]>> c = c(rnVar, resources);
                for (int i = 0; i < c.size(); i++) {
                    ArrayList arrayList = new ArrayList(c.get(i));
                    Collections.sort(arrayList, a);
                    if (b(a2, arrayList)) {
                        return resolveContentProvider;
                    }
                }
                return null;
            }
            StringBuilder M = wo1.M("Found content provider ", f, ", but package was not ");
            M.append(rnVar.g());
            throw new PackageManager.NameNotFoundException(M.toString());
        }
        throw new PackageManager.NameNotFoundException(wo1.t("No package found for authority: ", f));
    }

    public static /* synthetic */ int f(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        if (bArr.length != bArr2.length) {
            i = bArr.length;
            i2 = bArr2.length;
        } else {
            for (int i3 = 0; i3 < bArr.length; i3++) {
                if (bArr[i3] != bArr2[i3]) {
                    i = bArr[i3];
                    i2 = bArr2[i3];
                }
            }
            return 0;
        }
        return i - i2;
    }

    @x1
    @r2
    public static tn.c[] g(Context context, rn rnVar, String str, CancellationSignal cancellationSignal) {
        int i;
        Uri withAppendedId;
        int i2;
        boolean z;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath(o31.b).build();
        Cursor cursor = null;
        try {
            cursor = a.a(context.getContentResolver(), build, new String[]{"_id", tn.a.a, tn.a.b, tn.a.c, tn.a.d, tn.a.e, tn.a.f}, "query = ?", new String[]{rnVar.h()}, null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex(tn.a.f);
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex(tn.a.a);
                int columnIndex4 = cursor.getColumnIndex(tn.a.b);
                int columnIndex5 = cursor.getColumnIndex(tn.a.d);
                int columnIndex6 = cursor.getColumnIndex(tn.a.e);
                while (cursor.moveToNext()) {
                    int i3 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i4 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        i = i3;
                        withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        i = i3;
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    int i5 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        i2 = i;
                        z = false;
                    } else {
                        i2 = i;
                        z = true;
                    }
                    arrayList2.add(tn.c.a(withAppendedId, i4, i5, z, i2));
                }
                arrayList = arrayList2;
            }
            return (tn.c[]) arrayList.toArray(new tn.c[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}