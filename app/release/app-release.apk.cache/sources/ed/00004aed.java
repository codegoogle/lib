package com.p7700g.p99005;

import android.content.Context;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataResponse;
import com.onesignal.OSUtils;
import com.p7700g.p99005.jm3;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TrackAmazonPurchase.java */
/* loaded from: classes3.dex */
public class jn3 {
    private Context a;
    private boolean b;
    private c c;
    private boolean d;
    private Object e;
    private Field f;

    /* compiled from: TrackAmazonPurchase.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PurchasingService.registerListener(jn3.this.a, jn3.this.c);
        }
    }

    /* compiled from: TrackAmazonPurchase.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ProductDataResponse.RequestStatus.values().length];
            a = iArr;
            try {
                iArr[ProductDataResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: TrackAmazonPurchase.java */
    /* loaded from: classes3.dex */
    public class c implements PurchasingListener {
        public PurchasingListener a;
        private RequestId b;
        private String c;

        private c() {
        }

        private String a(String str) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case 2100:
                    if (str.equals("AU")) {
                        c = 0;
                        break;
                    }
                    break;
                case 2128:
                    if (str.equals("BR")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2142:
                    if (str.equals("CA")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2177:
                    if (str.equals("DE")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2222:
                    if (str.equals("ES")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2252:
                    if (str.equals("FR")) {
                        c = 5;
                        break;
                    }
                    break;
                case 2267:
                    if (str.equals("GB")) {
                        c = 6;
                        break;
                    }
                    break;
                case 2347:
                    if (str.equals("IT")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2374:
                    if (str.equals("JP")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 2718:
                    if (str.equals("US")) {
                        c = '\t';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return "AUD";
                case 1:
                    return "BRL";
                case 2:
                    return "CDN";
                case 3:
                case 4:
                case 5:
                case 7:
                    return "EUR";
                case 6:
                    return "GBP";
                case '\b':
                    return "JPY";
                case '\t':
                    return "USD";
                default:
                    return "";
            }
        }

        public void b(ProductDataResponse productDataResponse) {
            RequestId requestId = this.b;
            if (requestId != null && requestId.toString().equals(productDataResponse.getRequestId().toString())) {
                try {
                    if (b.a[productDataResponse.getRequestStatus().ordinal()] != 1) {
                        return;
                    }
                    JSONArray jSONArray = new JSONArray();
                    Map productData = productDataResponse.getProductData();
                    for (String str : productData.keySet()) {
                        Product product = (Product) productData.get(str);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sku", product.getSku());
                        jSONObject.put("iso", a(this.c));
                        String price = product.getPrice();
                        if (!price.matches("^[0-9]")) {
                            price = price.substring(1);
                        }
                        jSONObject.put("amount", price);
                        jSONArray.put(jSONObject);
                    }
                    jm3.E2(jSONArray, false, null);
                    return;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            }
            PurchasingListener purchasingListener = this.a;
            if (purchasingListener != null) {
                purchasingListener.onProductDataResponse(productDataResponse);
            }
        }

        public void c(PurchaseResponse purchaseResponse) {
            if (purchaseResponse.getRequestStatus() == PurchaseResponse.RequestStatus.SUCCESSFUL) {
                this.c = purchaseResponse.getUserData().getMarketplace();
                HashSet hashSet = new HashSet();
                hashSet.add(purchaseResponse.getReceipt().getSku());
                this.b = PurchasingService.getProductData(hashSet);
            }
            PurchasingListener purchasingListener = this.a;
            if (purchasingListener != null) {
                purchasingListener.onPurchaseResponse(purchaseResponse);
            }
        }

        public void d(PurchaseUpdatesResponse purchaseUpdatesResponse) {
            PurchasingListener purchasingListener = this.a;
            if (purchasingListener != null) {
                purchasingListener.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
            }
        }

        public void e(UserDataResponse userDataResponse) {
            PurchasingListener purchasingListener = this.a;
            if (purchasingListener != null) {
                purchasingListener.onUserDataResponse(userDataResponse);
            }
        }

        public /* synthetic */ c(jn3 jn3Var, a aVar) {
            this();
        }
    }

    public jn3(Context context) {
        this.b = false;
        this.d = false;
        this.a = context;
        try {
            Class<?> cls = Class.forName("com.amazon.device.iap.internal.d");
            try {
                this.e = cls.getMethod("d", new Class[0]).invoke(null, new Object[0]);
            } catch (NullPointerException unused) {
                this.e = cls.getMethod("e", new Class[0]).invoke(null, new Object[0]);
                this.d = true;
            }
            Field declaredField = cls.getDeclaredField("f");
            this.f = declaredField;
            declaredField.setAccessible(true);
            c cVar = new c(this, null);
            this.c = cVar;
            cVar.a = (PurchasingListener) this.f.get(this.e);
            this.b = true;
            e();
        } catch (ClassCastException e) {
            d(e);
        } catch (ClassNotFoundException e2) {
            d(e2);
        } catch (IllegalAccessException e3) {
            d(e3);
        } catch (NoSuchFieldException e4) {
            d(e4);
        } catch (NoSuchMethodException e5) {
            d(e5);
        } catch (InvocationTargetException e6) {
            d(e6);
        }
    }

    private static void d(Exception exc) {
        jm3.b(jm3.u0.ERROR, "Error adding Amazon IAP listener.", exc);
        exc.printStackTrace();
    }

    private void e() {
        if (this.d) {
            OSUtils.V(new a());
        } else {
            PurchasingService.registerListener(this.a, this.c);
        }
    }

    public void c() {
        if (this.b) {
            try {
                PurchasingListener purchasingListener = (PurchasingListener) this.f.get(this.e);
                c cVar = this.c;
                if (purchasingListener != cVar) {
                    cVar.a = purchasingListener;
                    e();
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}