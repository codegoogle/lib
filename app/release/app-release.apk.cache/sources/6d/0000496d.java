package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

/* compiled from: ListFragment.java */
/* loaded from: classes.dex */
public class iy extends Fragment {
    public static final int s = 16711681;
    public static final int t = 16711682;
    public static final int u = 16711683;
    public View A;
    public TextView B;
    public View C;
    public View D;
    public CharSequence E;
    public boolean F;
    private final Handler v = new Handler();
    private final Runnable w = new a();
    private final AdapterView.OnItemClickListener x = new b();
    public ListAdapter y;
    public ListView z;

    /* compiled from: ListFragment.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = iy.this.z;
            listView.focusableViewAvailable(listView);
        }
    }

    /* compiled from: ListFragment.java */
    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemClickListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            iy.this.h((ListView) adapterView, view, i, j);
        }
    }

    private void b() {
        if (this.z != null) {
            return;
        }
        View view = getView();
        if (view != null) {
            if (view instanceof ListView) {
                this.z = (ListView) view;
            } else {
                TextView textView = (TextView) view.findViewById(s);
                this.B = textView;
                if (textView == null) {
                    this.A = view.findViewById(16908292);
                } else {
                    textView.setVisibility(8);
                }
                this.C = view.findViewById(t);
                this.D = view.findViewById(u);
                View findViewById = view.findViewById(16908298);
                if (!(findViewById instanceof ListView)) {
                    if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    }
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                ListView listView = (ListView) findViewById;
                this.z = listView;
                View view2 = this.A;
                if (view2 != null) {
                    listView.setEmptyView(view2);
                } else {
                    CharSequence charSequence = this.E;
                    if (charSequence != null) {
                        this.B.setText(charSequence);
                        this.z.setEmptyView(this.B);
                    }
                }
            }
            this.F = true;
            this.z.setOnItemClickListener(this.x);
            ListAdapter listAdapter = this.y;
            if (listAdapter != null) {
                this.y = null;
                l(listAdapter);
            } else if (this.C != null) {
                n(false, false);
            }
            this.v.post(this.w);
            return;
        }
        throw new IllegalStateException("Content view not yet created");
    }

    private void n(boolean z, boolean z2) {
        b();
        View view = this.C;
        if (view != null) {
            if (this.F == z) {
                return;
            }
            this.F = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                    this.D.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                } else {
                    view.clearAnimation();
                    this.D.clearAnimation();
                }
                this.C.setVisibility(8);
                this.D.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                this.D.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
            } else {
                view.clearAnimation();
                this.D.clearAnimation();
            }
            this.C.setVisibility(0);
            this.D.setVisibility(8);
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    @z1
    public ListAdapter d() {
        return this.y;
    }

    @x1
    public ListView e() {
        b();
        return this.z;
    }

    public long f() {
        b();
        return this.z.getSelectedItemId();
    }

    public int g() {
        b();
        return this.z.getSelectedItemPosition();
    }

    public void h(@x1 ListView listView, @x1 View view, int i, long j) {
    }

    @x1
    public final ListAdapter i() {
        ListAdapter d = d();
        if (d != null) {
            return d;
        }
        throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
    }

    public void k(@z1 CharSequence charSequence) {
        b();
        TextView textView = this.B;
        if (textView != null) {
            textView.setText(charSequence);
            if (this.E == null) {
                this.z.setEmptyView(this.B);
            }
            this.E = charSequence;
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    public void l(@z1 ListAdapter listAdapter) {
        boolean z = this.y != null;
        this.y = listAdapter;
        ListView listView = this.z;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.F || z) {
                return;
            }
            n(true, requireView().getWindowToken() != null);
        }
    }

    public void m(boolean z) {
        n(z, true);
    }

    public void o(boolean z) {
        n(z, false);
    }

    @Override // androidx.fragment.app.Fragment
    @z1
    public View onCreateView(@x1 LayoutInflater layoutInflater, @z1 ViewGroup viewGroup, @z1 Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(t);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(u);
        TextView textView = new TextView(requireContext);
        textView.setId(s);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.v.removeCallbacks(this.w);
        this.z = null;
        this.F = false;
        this.D = null;
        this.C = null;
        this.A = null;
        this.B = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@x1 View view, @z1 Bundle bundle) {
        super.onViewCreated(view, bundle);
        b();
    }

    public void p(int i) {
        b();
        this.z.setSelection(i);
    }
}