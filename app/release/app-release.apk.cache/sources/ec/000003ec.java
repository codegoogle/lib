package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.p7700g.p99005.k1;
import com.p7700g.p99005.z1;
import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
public class StringRequest extends Request<String> {
    @z1
    @k1("mLock")
    private Response.Listener<String> mListener;
    private final Object mLock;

    public StringRequest(int i, String str, Response.Listener<String> listener, @z1 Response.ErrorListener errorListener) {
        super(i, str, errorListener);
        this.mLock = new Object();
        this.mListener = listener;
    }

    @Override // com.android.volley.Request
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    @Override // com.android.volley.Request
    public Response<String> parseNetworkResponse(NetworkResponse networkResponse) {
        String str;
        try {
            str = new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers));
        } catch (UnsupportedEncodingException unused) {
            str = new String(networkResponse.data);
        }
        return Response.success(str, HttpHeaderParser.parseCacheHeaders(networkResponse));
    }

    @Override // com.android.volley.Request
    public void deliverResponse(String str) {
        Response.Listener<String> listener;
        synchronized (this.mLock) {
            listener = this.mListener;
        }
        if (listener != null) {
            listener.onResponse(str);
        }
    }

    public StringRequest(String str, Response.Listener<String> listener, @z1 Response.ErrorListener errorListener) {
        this(0, str, listener, errorListener);
    }
}