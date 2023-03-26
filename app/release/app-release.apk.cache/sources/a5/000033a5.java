package com.iab.omid.library.ironsrc.walking.a;

import com.iab.omid.library.ironsrc.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e extends a {
    public e(b.InterfaceC0107b interfaceC0107b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0107b, hashSet, jSONObject, j);
    }

    private void b(String str) {
        com.iab.omid.library.ironsrc.b.a a = com.iab.omid.library.ironsrc.b.a.a();
        if (a != null) {
            for (com.iab.omid.library.ironsrc.adsession.a aVar : a.b()) {
                if (((a) this).a.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.c);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.b.toString();
    }

    @Override // com.iab.omid.library.ironsrc.walking.a.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}