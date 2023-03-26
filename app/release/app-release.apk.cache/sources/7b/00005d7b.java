package com.p7700g.p99005;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.browser.browseractions.BrowserActionsFallbackMenuView;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.p5;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BrowserActionsFallbackMenuUi.java */
@Deprecated
/* loaded from: classes.dex */
public class t5 implements AdapterView.OnItemClickListener {
    private static final String s = "BrowserActionskMenuUi";
    public final Context t;
    public final Uri u;
    private final List<q5> v;
    @z1
    public d w;
    @z1
    private s5 x;

    /* compiled from: BrowserActionsFallbackMenuUi.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((ClipboardManager) t5.this.t.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("url", t5.this.u.toString()));
            Toast.makeText(t5.this.t, t5.this.t.getString(p5.e.a), 0).show();
        }
    }

    /* compiled from: BrowserActionsFallbackMenuUi.java */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnShowListener {
        public final /* synthetic */ View a;

        public b(View view) {
            this.a = view;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            d dVar = t5.this.w;
            if (dVar == null) {
                return;
            }
            dVar.a(this.a);
        }
    }

    /* compiled from: BrowserActionsFallbackMenuUi.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ TextView s;

        public c(TextView textView) {
            this.s = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (nt.k(this.s) == Integer.MAX_VALUE) {
                this.s.setMaxLines(1);
                this.s.setEllipsize(TextUtils.TruncateAt.END);
                return;
            }
            this.s.setMaxLines(Integer.MAX_VALUE);
            this.s.setEllipsize(null);
        }
    }

    /* compiled from: BrowserActionsFallbackMenuUi.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @r2
    /* loaded from: classes.dex */
    public interface d {
        void a(View view);
    }

    public t5(@x1 Context context, @x1 Uri uri, @x1 List<q5> list) {
        this.t = context;
        this.u = uri;
        this.v = b(list);
    }

    private Runnable a() {
        return new a();
    }

    @x1
    private List<q5> b(List<q5> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new q5(this.t.getString(p5.e.c), c()));
        arrayList.add(new q5(this.t.getString(p5.e.b), a()));
        arrayList.add(new q5(this.t.getString(p5.e.d), d()));
        arrayList.addAll(list);
        return arrayList;
    }

    private PendingIntent c() {
        return PendingIntent.getActivity(this.t, 0, new Intent("android.intent.action.VIEW", this.u), 67108864);
    }

    private PendingIntent d() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", this.u.toString());
        intent.setType("text/plain");
        return PendingIntent.getActivity(this.t, 0, intent, 67108864);
    }

    private BrowserActionsFallbackMenuView f(View view) {
        BrowserActionsFallbackMenuView browserActionsFallbackMenuView = (BrowserActionsFallbackMenuView) view.findViewById(p5.c.e);
        TextView textView = (TextView) view.findViewById(p5.c.a);
        textView.setText(this.u.toString());
        textView.setOnClickListener(new c(textView));
        ListView listView = (ListView) view.findViewById(p5.c.d);
        listView.setAdapter((ListAdapter) new r5(this.v, this.t));
        listView.setOnItemClickListener(this);
        return browserActionsFallbackMenuView;
    }

    public void e() {
        View inflate = LayoutInflater.from(this.t).inflate(p5.d.a, (ViewGroup) null);
        s5 s5Var = new s5(this.t, f(inflate));
        this.x = s5Var;
        s5Var.setContentView(inflate);
        if (this.w != null) {
            this.x.setOnShowListener(new b(inflate));
        }
        this.x.show();
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @r2
    public void g(@z1 d dVar) {
        this.w = dVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        q5 q5Var = this.v.get(i);
        if (q5Var.a() != null) {
            try {
                q5Var.a().send();
            } catch (PendingIntent.CanceledException unused) {
            }
        } else if (q5Var.d() != null) {
            q5Var.d().run();
        }
        s5 s5Var = this.x;
        if (s5Var == null) {
            return;
        }
        s5Var.dismiss();
    }
}