package com.p7700g.p99005;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.li;
import com.p7700g.p99005.tn;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: TypefaceCompatApi29Impl.java */
@e2(29)
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ak extends bk {
    private Font k(@x1 FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? aa.h.j : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int l = l(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int l2 = l(fontStyle, font2.getStyle());
            if (l2 < l) {
                font = font2;
                l = l2;
            }
        }
        return font;
    }

    private static int l(@x1 FontStyle fontStyle, @x1 FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // com.p7700g.p99005.bk
    @z1
    public Typeface b(Context context, li.d dVar, Resources resources, int i) {
        li.e[] a;
        try {
            FontFamily.Builder builder = null;
            for (li.e eVar : dVar.a()) {
                try {
                    Font build = new Font.Builder(resources, eVar.b()).setWeight(eVar.e()).setSlant(eVar.f() ? 1 : 0).setTtcIndex(eVar.c()).setFontVariationSettings(eVar.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(k(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.p7700g.p99005.bk
    @z1
    public Typeface c(Context context, @z1 CancellationSignal cancellationSignal, @x1 tn.c[] cVarArr, int i) {
        int i2;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = cVarArr.length;
            FontFamily.Builder builder = null;
            while (i2 < length) {
                tn.c cVar = cVarArr[i2];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(cVar.d(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(cVar.e()).setSlant(cVar.f() ? 1 : 0).setTtcIndex(cVar.c()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                } else {
                    i2 = openFileDescriptor == null ? i2 + 1 : 0;
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(k(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.p7700g.p99005.bk
    public Typeface d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // com.p7700g.p99005.bk
    @z1
    public Typeface e(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p7700g.p99005.bk
    public tn.c h(tn.c[] cVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}