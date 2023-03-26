package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.p7700g.p99005.z1;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class JsonObjectRequest extends JsonRequest<JSONObject> {
    public JsonObjectRequest(String str, Response.Listener<JSONObject> listener, @z1 Response.ErrorListener errorListener) {
        super(0, str, null, listener, errorListener);
    }

    @Override // com.android.volley.toolbox.JsonRequest, com.android.volley.Request
    public Response<JSONObject> parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            return Response.success(new JSONObject(new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers, "utf-8"))), HttpHeaderParser.parseCacheHeaders(networkResponse));
        } catch (UnsupportedEncodingException e) {
            return Response.error(new ParseError(e));
        } catch (JSONException e2) {
            return Response.error(new ParseError(e2));
        }
    }

    @Deprecated
    public JsonObjectRequest(String str, @z1 JSONObject jSONObject, Response.Listener<JSONObject> listener, @z1 Response.ErrorListener errorListener) {
        super(jSONObject == null ? 0 : 1, str, jSONObject != null ? jSONObject.toString() : null, listener, errorListener);
    }

    public JsonObjectRequest(int i, String str, @z1 JSONObject jSONObject, Response.Listener<JSONObject> listener, @z1 Response.ErrorListener errorListener) {
        super(i, str, jSONObject != null ? jSONObject.toString() : null, listener, errorListener);
    }
}