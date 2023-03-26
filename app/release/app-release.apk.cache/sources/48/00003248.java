package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import com.p7700g.p99005.af;
import com.p7700g.p99005.ej2;
import com.p7700g.p99005.fq;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.gj2;
import com.p7700g.p99005.l2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.Locale;

/* loaded from: classes3.dex */
public class TimePickerView extends ConstraintLayout implements gj2 {
    public static final String x0 = "android.view.View";
    private final ClockHandView A0;
    private final ClockFaceView B0;
    private final MaterialButtonToggleGroup C0;
    private final View.OnClickListener D0;
    private f E0;
    private g F0;
    private e G0;
    private final Chip y0;
    private final Chip z0;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.F0 != null) {
                TimePickerView.this.F0.e(((Integer) view.getTag(ga2.h.M4)).intValue());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements MaterialButtonToggleGroup.d {
        public b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
            int i2 = i == ga2.h.F2 ? 1 : 0;
            if (TimePickerView.this.E0 == null || !z) {
                return;
            }
            TimePickerView.this.E0.c(i2);
        }
    }

    /* loaded from: classes3.dex */
    public class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            e eVar = TimePickerView.this.G0;
            if (eVar != null) {
                eVar.a();
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public class d implements View.OnTouchListener {
        public final /* synthetic */ GestureDetector s;

        public d(GestureDetector gestureDetector) {
            this.s = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.s.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public interface e {
        void a();
    }

    /* loaded from: classes3.dex */
    public interface f {
        void c(int i);
    }

    /* loaded from: classes3.dex */
    public interface g {
        void e(int i);
    }

    public TimePickerView(Context context) {
        this(context, null);
    }

    private void O() {
        Chip chip = this.y0;
        int i = ga2.h.M4;
        chip.setTag(i, 12);
        this.z0.setTag(i, 10);
        this.y0.setOnClickListener(this.D0);
        this.z0.setOnClickListener(this.D0);
        this.y0.setAccessibilityClassName(x0);
        this.z0.setAccessibilityClassName(x0);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void P() {
        d dVar = new d(new GestureDetector(getContext(), new c()));
        this.y0.setOnTouchListener(dVar);
        this.z0.setOnTouchListener(dVar);
    }

    private void R(Chip chip, boolean z) {
        chip.setChecked(z);
        sr.C1(chip, z ? 2 : 0);
    }

    private void S() {
        if (this.C0.getVisibility() == 0) {
            af afVar = new af();
            afVar.H(this);
            afVar.F(ga2.h.B2, sr.Y(this) == 0 ? 2 : 1);
            afVar.r(this);
        }
    }

    public void F(ClockHandView.d dVar) {
        this.A0.b(dVar);
    }

    public void G(boolean z) {
        this.A0.j(z);
    }

    public void H(float f2, boolean z) {
        this.A0.m(f2, z);
    }

    public void I(fq fqVar) {
        sr.A1(this.y0, fqVar);
    }

    public void J(fq fqVar) {
        sr.A1(this.z0, fqVar);
    }

    public void K(ClockHandView.c cVar) {
        this.A0.o(cVar);
    }

    public void L(@z1 e eVar) {
        this.G0 = eVar;
    }

    public void M(f fVar) {
        this.E0 = fVar;
    }

    public void N(g gVar) {
        this.F0 = gVar;
    }

    public void Q() {
        this.C0.setVisibility(0);
    }

    @Override // com.p7700g.p99005.gj2
    public void a(int i) {
        R(this.y0, i == 12);
        R(this.z0, i == 10);
    }

    @Override // com.p7700g.p99005.gj2
    @SuppressLint({"DefaultLocale"})
    public void b(int i, int i2, int i3) {
        int i4;
        if (i == 1) {
            i4 = ga2.h.F2;
        } else {
            i4 = ga2.h.E2;
        }
        this.C0.e(i4);
        Locale locale = getResources().getConfiguration().locale;
        String format = String.format(locale, ej2.s, Integer.valueOf(i3));
        String format2 = String.format(locale, ej2.s, Integer.valueOf(i2));
        if (!TextUtils.equals(this.y0.getText(), format)) {
            this.y0.setText(format);
        }
        if (TextUtils.equals(this.z0.getText(), format2)) {
            return;
        }
        this.z0.setText(format2);
    }

    @Override // com.p7700g.p99005.gj2
    public void c(String[] strArr, @l2 int i) {
        this.B0.c(strArr, i);
    }

    @Override // com.p7700g.p99005.gj2
    public void e(float f2) {
        this.A0.l(f2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        S();
    }

    @Override // android.view.View
    public void onVisibilityChanged(@x1 View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            S();
        }
    }

    public TimePickerView(Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, @z1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.D0 = new a();
        LayoutInflater.from(context).inflate(ga2.k.h0, this);
        this.B0 = (ClockFaceView) findViewById(ga2.h.C2);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(ga2.h.G2);
        this.C0 = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new b());
        this.y0 = (Chip) findViewById(ga2.h.L2);
        this.z0 = (Chip) findViewById(ga2.h.I2);
        this.A0 = (ClockHandView) findViewById(ga2.h.D2);
        P();
        O();
    }
}