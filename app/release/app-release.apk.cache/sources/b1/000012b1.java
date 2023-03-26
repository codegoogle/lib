package com.facebook.ads.redexgen.X;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.p7700g.p99005.bx;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Set;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public class NJ extends WebViewClient {
    public static byte[] A02;
    public final WeakReference<C1080Wh> A00;
    public final WeakReference<NH> A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-67, -33, -16, -27, -14, -27, -16, -11, -100, -22, -21, -16, -100, -30, -21, -15, -22, -32, -100, -16, -21, -100, -28, -35, -22, -32, -24, bx.j7, -100, -47, -50, -59, -86, bx.W5, 67, 64, 67, 68, 76, 67, -11, 58, 77, 56, 58, 69, 73, 62, 68, 67, -11, 68, 56, 56, 74, 71, 71, 58, 57, -11, 76, 61, 58, 67, -11, 73, 71, 78, 62, 67, 60, -11, 73, 68, -11, 61, 54, 67, 57, 65, 58, -11, bx.W5, 39, 30, 3, 39, 52, bx.W5, 56, 53, 47, bx.W5, -12, 47, 52, 58, 43, 52, 58, -12, 39, 41, 58, 47, 53, 52, -12, 28, 15, Flags.CD, 29, 73, 55, 52, 49, 72, 59, 55, 73};
    }

    public NJ(WeakReference<NH> weakReference, WeakReference<C1080Wh> weakReference2) {
        this.A01 = weakReference;
        this.A00 = weakReference2;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.A01.get() != null) {
            this.A01.get().AAL(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (this.A01.get() != null) {
            this.A01.get().AAN(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Set set;
        String str2;
        String str3;
        Uri parse = Uri.parse(str);
        set = XS.A09;
        if (!set.contains(parse.getScheme()) && this.A00.get() != null) {
            try {
                return C0783Kq.A0C(this.A00.get(), new Intent(A00(86, 26, 101), parse));
            } catch (Exception e) {
                if (e instanceof ActivityNotFoundException) {
                    str3 = XS.A08;
                    Log.w(str3, A00(0, 33, 27), e);
                } else {
                    str2 = XS.A08;
                    Log.e(str2, A00(33, 53, 116), e);
                }
                C1080Wh c1080Wh = this.A00.get();
                if (c1080Wh != null) {
                    c1080Wh.A04().A83(A00(112, 8, 113), C04848i.A2C, new C04858j(e));
                    return false;
                }
                return false;
            }
        }
        return false;
    }
}