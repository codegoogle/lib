package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.p7700g.p99005.b91;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a implements c {
    public final d a;
    private BroadcastReceiver b = new C0134a();

    /* renamed from: com.ironsource.sdk.service.Connectivity.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0134a extends BroadcastReceiver {
        public C0134a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String a = com.ironsource.d.a.a(context);
            if (a.equals("none")) {
                a.this.a.a();
                return;
            }
            d dVar = a.this.a;
            new JSONObject();
            dVar.a(a);
        }
    }

    public a(d dVar) {
        this.a = dVar;
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final void a() {
        this.b = null;
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final void a(Context context) {
        try {
            context.registerReceiver(this.b, new IntentFilter(b91.a));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final void b(Context context) {
        try {
            context.unregisterReceiver(this.b);
        } catch (IllegalArgumentException unused) {
        } catch (Exception e) {
            String str = "unregisterConnectionReceiver - " + e;
        }
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final JSONObject c(Context context) {
        return new JSONObject();
    }
}