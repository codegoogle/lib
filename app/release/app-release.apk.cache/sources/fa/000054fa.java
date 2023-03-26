package com.p7700g.p99005;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextView.kt */
@vo4(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0083\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022d\b\u0006\u0010\u0003\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00042d\b\u0006\u0010\u000e\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\r0\u00042%\b\u0006\u0010\u0010\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\r0\u0011H\u0086\bø\u0001\u0000\u001a7\u0010\u0013\u001a\u00020\u0001*\u00020\u00022%\b\u0004\u0010\u0014\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\r0\u0011H\u0086\bø\u0001\u0000\u001av\u0010\u0015\u001a\u00020\u0001*\u00020\u00022d\b\u0004\u0010\u0014\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0004H\u0086\bø\u0001\u0000\u001av\u0010\u0016\u001a\u00020\u0001*\u00020\u00022d\b\u0004\u0010\u0014\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\r0\u0004H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"addTextChangedListener", "Landroid/text/TextWatcher;", "Landroid/widget/TextView;", "beforeTextChanged", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "text", "", com.anythink.expressad.foundation.d.c.bR, NewHtcHomeBadger.d, "after", "", "onTextChanged", "before", "afterTextChanged", "Lkotlin/Function1;", "Landroid/text/Editable;", "doAfterTextChanged", "action", "doBeforeTextChanged", "doOnTextChanged", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ot {

    /* compiled from: TextView.kt */
    @vo4(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class a extends e25 implements l05<CharSequence, Integer, Integer, Integer, yq4> {
        public static final a t = new a();

        public a() {
            super(4);
        }

        @Override // com.p7700g.p99005.l05
        public /* bridge */ /* synthetic */ yq4 Z(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            a(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return yq4.a;
        }

        public final void a(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: TextView.kt */
    @vo4(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class b extends e25 implements l05<CharSequence, Integer, Integer, Integer, yq4> {
        public static final b t = new b();

        public b() {
            super(4);
        }

        @Override // com.p7700g.p99005.l05
        public /* bridge */ /* synthetic */ yq4 Z(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            a(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return yq4.a;
        }

        public final void a(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: TextView.kt */
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/text/Editable;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class c extends e25 implements f05<Editable, yq4> {
        public static final c t = new c();

        public c() {
            super(1);
        }

        @Override // com.p7700g.p99005.f05
        public /* bridge */ /* synthetic */ yq4 M(Editable editable) {
            a(editable);
            return yq4.a;
        }

        public final void a(@Nullable Editable editable) {
        }
    }

    /* compiled from: TextView.kt */
    @vo4(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "text", "", com.anythink.expressad.foundation.d.c.bR, "", NewHtcHomeBadger.d, "after", "onTextChanged", "before", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class d implements TextWatcher {
        public final /* synthetic */ f05<Editable, yq4> s;
        public final /* synthetic */ l05<CharSequence, Integer, Integer, Integer, yq4> t;
        public final /* synthetic */ l05<CharSequence, Integer, Integer, Integer, yq4> u;

        /* JADX WARN: Multi-variable type inference failed */
        public d(f05<? super Editable, yq4> f05Var, l05<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, yq4> l05Var, l05<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, yq4> l05Var2) {
            this.s = f05Var;
            this.t = l05Var;
            this.u = l05Var2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable editable) {
            this.s.M(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            this.t.Z(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            this.u.Z(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    /* compiled from: TextView.kt */
    @vo4(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "text", "", com.anythink.expressad.foundation.d.c.bR, "", NewHtcHomeBadger.d, "after", "onTextChanged", "before", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class e implements TextWatcher {
        public final /* synthetic */ f05 s;

        public e(f05 f05Var) {
            this.s = f05Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable editable) {
            this.s.M(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: TextView.kt */
    @vo4(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "text", "", com.anythink.expressad.foundation.d.c.bR, "", NewHtcHomeBadger.d, "after", "onTextChanged", "before", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class f implements TextWatcher {
        public final /* synthetic */ l05 s;

        public f(l05 l05Var) {
            this.s = l05Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            this.s.Z(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: TextView.kt */
    @vo4(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "text", "", com.anythink.expressad.foundation.d.c.bR, "", NewHtcHomeBadger.d, "after", "onTextChanged", "before", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class g implements TextWatcher {
        public final /* synthetic */ l05 s;

        public g(l05 l05Var) {
            this.s = l05Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            this.s.Z(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    @NotNull
    public static final TextWatcher a(@NotNull TextView textView, @NotNull l05<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, yq4> l05Var, @NotNull l05<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, yq4> l05Var2, @NotNull f05<? super Editable, yq4> f05Var) {
        c25.p(textView, "<this>");
        c25.p(l05Var, "beforeTextChanged");
        c25.p(l05Var2, "onTextChanged");
        c25.p(f05Var, "afterTextChanged");
        d dVar = new d(f05Var, l05Var, l05Var2);
        textView.addTextChangedListener(dVar);
        return dVar;
    }

    public static /* synthetic */ TextWatcher b(TextView textView, l05 l05Var, l05 l05Var2, f05 f05Var, int i, Object obj) {
        if ((i & 1) != 0) {
            l05Var = a.t;
        }
        if ((i & 2) != 0) {
            l05Var2 = b.t;
        }
        if ((i & 4) != 0) {
            f05Var = c.t;
        }
        c25.p(textView, "<this>");
        c25.p(l05Var, "beforeTextChanged");
        c25.p(l05Var2, "onTextChanged");
        c25.p(f05Var, "afterTextChanged");
        d dVar = new d(f05Var, l05Var, l05Var2);
        textView.addTextChangedListener(dVar);
        return dVar;
    }

    @NotNull
    public static final TextWatcher c(@NotNull TextView textView, @NotNull f05<? super Editable, yq4> f05Var) {
        c25.p(textView, "<this>");
        c25.p(f05Var, "action");
        e eVar = new e(f05Var);
        textView.addTextChangedListener(eVar);
        return eVar;
    }

    @NotNull
    public static final TextWatcher d(@NotNull TextView textView, @NotNull l05<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, yq4> l05Var) {
        c25.p(textView, "<this>");
        c25.p(l05Var, "action");
        f fVar = new f(l05Var);
        textView.addTextChangedListener(fVar);
        return fVar;
    }

    @NotNull
    public static final TextWatcher e(@NotNull TextView textView, @NotNull l05<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, yq4> l05Var) {
        c25.p(textView, "<this>");
        c25.p(l05Var, "action");
        g gVar = new g(l05Var);
        textView.addTextChangedListener(gVar);
        return gVar;
    }
}