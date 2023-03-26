package com.android.volley;

import com.android.volley.Cache;
import com.p7700g.p99005.z1;

/* loaded from: classes2.dex */
public class Response<T> {
    @z1
    public final Cache.Entry cacheEntry;
    @z1
    public final VolleyError error;
    public boolean intermediate;
    @z1
    public final T result;

    /* loaded from: classes2.dex */
    public interface ErrorListener {
        void onErrorResponse(VolleyError volleyError);
    }

    /* loaded from: classes2.dex */
    public interface Listener<T> {
        void onResponse(T t);
    }

    private Response(@z1 T t, @z1 Cache.Entry entry) {
        this.intermediate = false;
        this.result = t;
        this.cacheEntry = entry;
        this.error = null;
    }

    public static <T> Response<T> error(VolleyError volleyError) {
        return new Response<>(volleyError);
    }

    public static <T> Response<T> success(@z1 T t, @z1 Cache.Entry entry) {
        return new Response<>(t, entry);
    }

    public boolean isSuccess() {
        return this.error == null;
    }

    private Response(VolleyError volleyError) {
        this.intermediate = false;
        this.result = null;
        this.cacheEntry = null;
        this.error = volleyError;
    }
}