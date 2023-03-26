package com.p7700g.p99005;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.xm3;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TrackGooglePurchase.java */
/* loaded from: classes3.dex */
public class ln3 {
    private static int a = -99;
    private static Class<?> b;
    private ServiceConnection c;
    private Object d;
    private Method e;
    private Method f;
    private Context g;
    private boolean i;
    private boolean j = false;
    private ArrayList<String> h = new ArrayList<>();

    /* compiled from: TrackGooglePurchase.java */
    /* loaded from: classes3.dex */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                Method q = ln3.q(Class.forName("com.android.vending.billing.IInAppBillingService$Stub"));
                q.setAccessible(true);
                ln3.this.d = q.invoke(null, iBinder);
                ln3.this.b();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            int unused = ln3.a = -99;
            ln3.this.d = null;
        }
    }

    /* compiled from: TrackGooglePurchase.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ln3.this.j = true;
            try {
                if (ln3.this.e == null) {
                    ln3.this.e = ln3.r(ln3.b);
                    ln3.this.e.setAccessible(true);
                }
                Bundle bundle = (Bundle) ln3.this.e.invoke(ln3.this.d, 3, ln3.this.g.getPackageName(), "inapp", null);
                if (bundle.getInt("RESPONSE_CODE") == 0) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    for (int i = 0; i < stringArrayList2.size(); i++) {
                        String str = stringArrayList.get(i);
                        String string = new JSONObject(stringArrayList2.get(i)).getString("purchaseToken");
                        if (!ln3.this.h.contains(string) && !arrayList2.contains(string)) {
                            arrayList2.add(string);
                            arrayList.add(str);
                        }
                    }
                    if (arrayList.size() > 0) {
                        ln3.this.t(arrayList, arrayList2);
                    } else if (stringArrayList2.size() == 0) {
                        ln3.this.i = false;
                        vm3.k(vm3.b, vm3.X, false);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            ln3.this.j = false;
        }
    }

    /* compiled from: TrackGooglePurchase.java */
    /* loaded from: classes3.dex */
    public class c extends xm3.g {
        public final /* synthetic */ ArrayList a;

        public c(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // com.p7700g.p99005.xm3.g
        public void b(String str) {
            ln3.this.h.addAll(this.a);
            vm3.o(vm3.b, vm3.W, ln3.this.h.toString());
            vm3.k(vm3.b, vm3.X, true);
            ln3.this.i = false;
            ln3.this.j = false;
        }

        public void c(int i, JSONObject jSONObject, Throwable th) {
            jm3.b(jm3.u0.WARN, "HTTP sendPurchases failed to send.", th);
            ln3.this.j = false;
        }
    }

    public ln3(Context context) {
        this.i = true;
        this.g = context;
        try {
            JSONArray jSONArray = new JSONArray(vm3.g(vm3.b, vm3.W, zq5.e));
            for (int i = 0; i < jSONArray.length(); i++) {
                this.h.add(jSONArray.get(i).toString());
            }
            boolean z = jSONArray.length() == 0;
            this.i = z;
            if (z) {
                this.i = vm3.b(vm3.b, vm3.X, true);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        u();
    }

    public static boolean a(Context context) {
        if (a == -99) {
            a = context.checkCallingOrSelfPermission("com.android.vending.BILLING");
        }
        try {
            if (a == 0) {
                b = Class.forName("com.android.vending.billing.IInAppBillingService");
            }
            return a == 0;
        } catch (Throwable unused) {
            a = 0;
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.j) {
            return;
        }
        new Thread(new b()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method q(Class cls) {
        Method[] methods;
        for (Method method : cls.getMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0] == IBinder.class) {
                return method;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method r(Class cls) {
        Method[] methods;
        for (Method method : cls.getMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == String.class && parameterTypes[2] == String.class && parameterTypes[3] == String.class) {
                return method;
            }
        }
        return null;
    }

    private static Method s(Class cls) {
        Method[] methods;
        for (Method method : cls.getMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?> returnType = method.getReturnType();
            if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == String.class && parameterTypes[2] == String.class && parameterTypes[3] == Bundle.class && returnType == Bundle.class) {
                return method;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        try {
            if (this.f == null) {
                Method s = s(b);
                this.f = s;
                s.setAccessible(true);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Bundle bundle2 = (Bundle) this.f.invoke(this.d, 3, this.g.getPackageName(), "inapp", bundle);
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                HashMap hashMap = new HashMap();
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = new JSONObject(it.next());
                    String string = jSONObject.getString("productId");
                    BigDecimal divide = new BigDecimal(jSONObject.getString("price_amount_micros")).divide(new BigDecimal((int) q95.a));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("sku", string);
                    jSONObject2.put("iso", jSONObject.getString("price_currency_code"));
                    jSONObject2.put("amount", divide.toString());
                    hashMap.put(string, jSONObject2);
                }
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String next = it2.next();
                    if (hashMap.containsKey(next)) {
                        jSONArray.put(hashMap.get(next));
                    }
                }
                if (jSONArray.length() > 0) {
                    jm3.E2(jSONArray, this.i, new c(arrayList2));
                }
            }
        } catch (Throwable th) {
            jm3.b(jm3.u0.WARN, "Failed to track IAP purchases", th);
        }
    }

    public void u() {
        if (this.c == null) {
            this.c = new a();
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            this.g.bindService(intent, this.c, 1);
        } else if (this.d != null) {
            b();
        }
    }
}