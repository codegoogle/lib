package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;
import com.p7700g.p99005.au;
import com.p7700g.p99005.fq;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.x2;

@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    private static final int[] s = {16842912};
    private boolean t;
    private boolean u;
    private boolean v;

    /* loaded from: classes3.dex */
    public class a extends fq {
        public a() {
        }

        @Override // com.p7700g.p99005.fq
        public void f(View view, @x1 AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // com.p7700g.p99005.fq
        public void g(View view, @x1 ls lsVar) {
            super.g(view, lsVar);
            lsVar.U0(CheckableImageButton.this.a());
            lsVar.V0(CheckableImageButton.this.isChecked());
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends au {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public boolean s;

        /* loaded from: classes3.dex */
        public class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.Creator
            @x1
            /* renamed from: a */
            public b createFromParcel(@x1 Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @x1
            /* renamed from: b */
            public b createFromParcel(@x1 Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @x1
            /* renamed from: c */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void c(@x1 Parcel parcel) {
            this.s = parcel.readInt() == 1;
        }

        @Override // com.p7700g.p99005.au, android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.s ? 1 : 0);
        }

        public b(@x1 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            c(parcel);
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public boolean a() {
        return this.u;
    }

    public boolean b() {
        return this.v;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.t;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.t) {
            int[] iArr = s;
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setChecked(bVar.s);
    }

    @Override // android.view.View
    @x1
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.s = this.t;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.u != z) {
            this.u = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.u || this.t == z) {
            return;
        }
        this.t = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.v = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.v) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.t);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x2.b.K1);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = true;
        this.v = true;
        sr.A1(this, new a());
    }
}