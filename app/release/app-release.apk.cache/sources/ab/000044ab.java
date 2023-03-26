package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import com.p7700g.p99005.rs2;
import org.jetbrains.annotations.NotNull;

/* compiled from: ImageDecoder.kt */
@vo4(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aU\u0010\u0000\u001a\u00020\u0001*\u00020\u00022C\b\u0004\u0010\u0003\u001a=\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0002\b\fH\u0087\bø\u0001\u0000\u001aU\u0010\r\u001a\u00020\u000e*\u00020\u00022C\b\u0004\u0010\u0003\u001a=\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0002\b\fH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"decodeBitmap", "Landroid/graphics/Bitmap;", "Landroid/graphics/ImageDecoder$Source;", "action", "Lkotlin/Function3;", "Landroid/graphics/ImageDecoder;", "Landroid/graphics/ImageDecoder$ImageInfo;", "Lkotlin/ParameterName;", "name", "info", rs2.f.b, "", "Lkotlin/ExtensionFunctionType;", "decodeDrawable", "Landroid/graphics/drawable/Drawable;", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class gj {

    /* compiled from: ImageDecoder.kt */
    @vo4(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "decoder", "Landroid/graphics/ImageDecoder;", "info", "Landroid/graphics/ImageDecoder$ImageInfo;", rs2.f.b, "Landroid/graphics/ImageDecoder$Source;", "onHeaderDecoded"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class a implements ImageDecoder.OnHeaderDecodedListener {
        public final /* synthetic */ k05<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, yq4> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(k05<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, yq4> k05Var) {
            this.a = k05Var;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        public final void onHeaderDecoded(@NotNull ImageDecoder imageDecoder, @NotNull ImageDecoder.ImageInfo imageInfo, @NotNull ImageDecoder.Source source) {
            c25.p(imageDecoder, "decoder");
            c25.p(imageInfo, "info");
            c25.p(source, rs2.f.b);
            this.a.I(imageDecoder, imageInfo, source);
        }
    }

    /* compiled from: ImageDecoder.kt */
    @vo4(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "decoder", "Landroid/graphics/ImageDecoder;", "info", "Landroid/graphics/ImageDecoder$ImageInfo;", rs2.f.b, "Landroid/graphics/ImageDecoder$Source;", "onHeaderDecoded"}, k = 3, mv = {1, 6, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final class b implements ImageDecoder.OnHeaderDecodedListener {
        public final /* synthetic */ k05<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, yq4> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(k05<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, yq4> k05Var) {
            this.a = k05Var;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        public final void onHeaderDecoded(@NotNull ImageDecoder imageDecoder, @NotNull ImageDecoder.ImageInfo imageInfo, @NotNull ImageDecoder.Source source) {
            c25.p(imageDecoder, "decoder");
            c25.p(imageInfo, "info");
            c25.p(source, rs2.f.b);
            this.a.I(imageDecoder, imageInfo, source);
        }
    }

    @e2(28)
    @NotNull
    public static final Bitmap a(@NotNull ImageDecoder.Source source, @NotNull k05<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, yq4> k05Var) {
        c25.p(source, "<this>");
        c25.p(k05Var, "action");
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new a(k05Var));
        c25.o(decodeBitmap, "crossinline action: Imag…ction(info, source)\n    }");
        return decodeBitmap;
    }

    @e2(28)
    @NotNull
    public static final Drawable b(@NotNull ImageDecoder.Source source, @NotNull k05<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, yq4> k05Var) {
        c25.p(source, "<this>");
        c25.p(k05Var, "action");
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new b(k05Var));
        c25.o(decodeDrawable, "crossinline action: Imag…ction(info, source)\n    }");
        return decodeDrawable;
    }
}