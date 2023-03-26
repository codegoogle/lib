package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PrintHelper.java */
/* loaded from: classes.dex */
public final class m20 {
    private static final String a = "PrintHelper";
    private static final int b = 3500;
    public static final boolean c;
    public static final boolean d;
    public static final int e = 1;
    public static final int f = 2;
    @SuppressLint({"InlinedApi"})
    public static final int g = 1;
    @SuppressLint({"InlinedApi"})
    public static final int h = 2;
    public static final int i = 1;
    public static final int j = 2;
    public final Context k;
    public BitmapFactory.Options l = null;
    public final Object m = new Object();
    public int n = 2;
    public int o = 2;
    public int p = 1;

    /* compiled from: PrintHelper.java */
    /* loaded from: classes.dex */
    public class a extends AsyncTask<Void, Void, Throwable> {
        public final /* synthetic */ CancellationSignal a;
        public final /* synthetic */ PrintAttributes b;
        public final /* synthetic */ Bitmap c;
        public final /* synthetic */ PrintAttributes d;
        public final /* synthetic */ int e;
        public final /* synthetic */ ParcelFileDescriptor f;
        public final /* synthetic */ PrintDocumentAdapter.WriteResultCallback g;

        public a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int i, ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            this.a = cancellationSignal;
            this.b = printAttributes;
            this.c = bitmap;
            this.d = printAttributes2;
            this.e = i;
            this.f = parcelFileDescriptor;
            this.g = writeResultCallback;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Throwable doInBackground(Void... voidArr) {
            RectF rectF;
            try {
                if (this.a.isCanceled()) {
                    return null;
                }
                PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(m20.this.k, this.b);
                Bitmap a = m20.a(this.c, this.b.getColorMode());
                if (this.a.isCanceled()) {
                    return null;
                }
                PdfDocument.Page startPage = printedPdfDocument.startPage(1);
                boolean z = m20.d;
                if (z) {
                    rectF = new RectF(startPage.getInfo().getContentRect());
                } else {
                    PrintedPdfDocument printedPdfDocument2 = new PrintedPdfDocument(m20.this.k, this.d);
                    PdfDocument.Page startPage2 = printedPdfDocument2.startPage(1);
                    RectF rectF2 = new RectF(startPage2.getInfo().getContentRect());
                    printedPdfDocument2.finishPage(startPage2);
                    printedPdfDocument2.close();
                    rectF = rectF2;
                }
                Matrix d = m20.d(a.getWidth(), a.getHeight(), rectF, this.e);
                if (!z) {
                    d.postTranslate(rectF.left, rectF.top);
                    startPage.getCanvas().clipRect(rectF);
                }
                startPage.getCanvas().drawBitmap(a, d, null);
                printedPdfDocument.finishPage(startPage);
                if (this.a.isCanceled()) {
                    printedPdfDocument.close();
                    ParcelFileDescriptor parcelFileDescriptor = this.f;
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (a != this.c) {
                        a.recycle();
                    }
                    return null;
                }
                printedPdfDocument.writeTo(new FileOutputStream(this.f.getFileDescriptor()));
                printedPdfDocument.close();
                ParcelFileDescriptor parcelFileDescriptor2 = this.f;
                if (parcelFileDescriptor2 != null) {
                    try {
                        parcelFileDescriptor2.close();
                    } catch (IOException unused2) {
                    }
                }
                if (a != this.c) {
                    a.recycle();
                }
                return null;
            } catch (Throwable th) {
                return th;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(Throwable th) {
            if (this.a.isCanceled()) {
                this.g.onWriteCancelled();
            } else if (th == null) {
                this.g.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            } else {
                this.g.onWriteFailed(null);
            }
        }
    }

    /* compiled from: PrintHelper.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* compiled from: PrintHelper.java */
    @e2(19)
    /* loaded from: classes.dex */
    public class c extends PrintDocumentAdapter {
        private final String a;
        private final int b;
        private final Bitmap c;
        private final b d;
        private PrintAttributes e;

        public c(String str, int i, Bitmap bitmap, b bVar) {
            this.a = str;
            this.b = i;
            this.c = bitmap;
            this.d = bVar;
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            b bVar = this.d;
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.e = printAttributes2;
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            m20.this.r(this.e, this.b, this.c, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    /* compiled from: PrintHelper.java */
    @e2(19)
    /* loaded from: classes.dex */
    public class d extends PrintDocumentAdapter {
        public final String a;
        public final Uri b;
        public final b c;
        public final int d;
        public PrintAttributes e;
        public AsyncTask<Uri, Boolean, Bitmap> f;
        public Bitmap g = null;

        /* compiled from: PrintHelper.java */
        /* loaded from: classes.dex */
        public class a extends AsyncTask<Uri, Boolean, Bitmap> {
            public final /* synthetic */ CancellationSignal a;
            public final /* synthetic */ PrintAttributes b;
            public final /* synthetic */ PrintAttributes c;
            public final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback d;

            /* compiled from: PrintHelper.java */
            /* renamed from: com.p7700g.p99005.m20$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0215a implements CancellationSignal.OnCancelListener {
                public C0215a() {
                }

                @Override // android.os.CancellationSignal.OnCancelListener
                public void onCancel() {
                    d.this.a();
                    a.this.cancel(false);
                }
            }

            public a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
                this.a = cancellationSignal;
                this.b = printAttributes;
                this.c = printAttributes2;
                this.d = layoutResultCallback;
            }

            @Override // android.os.AsyncTask
            /* renamed from: a */
            public Bitmap doInBackground(Uri... uriArr) {
                try {
                    d dVar = d.this;
                    return m20.this.i(dVar.b);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            /* renamed from: b */
            public void onCancelled(Bitmap bitmap) {
                this.d.onLayoutCancelled();
                d.this.f = null;
            }

            @Override // android.os.AsyncTask
            /* renamed from: c */
            public void onPostExecute(Bitmap bitmap) {
                PrintAttributes.MediaSize mediaSize;
                super.onPostExecute(bitmap);
                if (bitmap != null && (!m20.c || m20.this.p == 0)) {
                    synchronized (this) {
                        mediaSize = d.this.e.getMediaSize();
                    }
                    if (mediaSize != null && mediaSize.isPortrait() != m20.g(bitmap)) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90.0f);
                        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                }
                d.this.g = bitmap;
                if (bitmap != null) {
                    this.d.onLayoutFinished(new PrintDocumentInfo.Builder(d.this.a).setContentType(1).setPageCount(1).build(), true ^ this.b.equals(this.c));
                } else {
                    this.d.onLayoutFailed(null);
                }
                d.this.f = null;
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
                this.a.setOnCancelListener(new C0215a());
            }
        }

        public d(String str, Uri uri, b bVar, int i) {
            this.a = str;
            this.b = uri;
            this.c = bVar;
            this.d = i;
        }

        public void a() {
            synchronized (m20.this.m) {
                BitmapFactory.Options options = m20.this.l;
                if (options != null) {
                    if (Build.VERSION.SDK_INT < 24) {
                        options.requestCancelDecode();
                    }
                    m20.this.l = null;
                }
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            super.onFinish();
            a();
            AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.f;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            b bVar = this.c;
            if (bVar != null) {
                bVar.a();
            }
            Bitmap bitmap = this.g;
            if (bitmap != null) {
                bitmap.recycle();
                this.g = null;
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
                this.e = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.g != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                this.f = new a(cancellationSignal, printAttributes2, printAttributes, layoutResultCallback).execute(new Uri[0]);
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            m20.this.r(this.e, this.d, this.g, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        c = i2 > 23;
        d = i2 != 23;
    }

    public m20(@x1 Context context) {
        this.k = context;
    }

    public static Bitmap a(Bitmap bitmap, int i2) {
        if (i2 != 1) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    @e2(19)
    private static PrintAttributes.Builder b(PrintAttributes printAttributes) {
        PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        if (Build.VERSION.SDK_INT >= 23 && printAttributes.getDuplexMode() != 0) {
            minMargins.setDuplexMode(printAttributes.getDuplexMode());
        }
        return minMargins;
    }

    public static Matrix d(int i2, int i3, RectF rectF, int i4) {
        float min;
        Matrix matrix = new Matrix();
        float f2 = i2;
        float width = rectF.width() / f2;
        if (i4 == 2) {
            min = Math.max(width, rectF.height() / i3);
        } else {
            min = Math.min(width, rectF.height() / i3);
        }
        matrix.postScale(min, min);
        matrix.postTranslate((rectF.width() - (f2 * min)) / 2.0f, (rectF.height() - (i3 * min)) / 2.0f);
        return matrix;
    }

    public static boolean g(Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }

    private Bitmap h(Uri uri, BitmapFactory.Options options) throws FileNotFoundException {
        Context context;
        InputStream openInputStream;
        if (uri != null && (context = this.k) != null) {
            InputStream inputStream = null;
            try {
                openInputStream = context.getContentResolver().openInputStream(uri);
            } catch (Throwable th) {
                th = th;
            }
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return decodeStream;
            } catch (Throwable th2) {
                th = th2;
                inputStream = openInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }
        throw new IllegalArgumentException("bad argument to loadBitmap");
    }

    public static boolean q() {
        return true;
    }

    public int c() {
        return this.o;
    }

    public int e() {
        int i2 = this.p;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public int f() {
        return this.n;
    }

    public Bitmap i(Uri uri) throws FileNotFoundException {
        BitmapFactory.Options options;
        if (uri != null && this.k != null) {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            h(uri, options2);
            int i2 = options2.outWidth;
            int i3 = options2.outHeight;
            if (i2 > 0 && i3 > 0) {
                int max = Math.max(i2, i3);
                int i4 = 1;
                while (max > 3500) {
                    max >>>= 1;
                    i4 <<= 1;
                }
                if (i4 > 0 && Math.min(i2, i3) / i4 > 0) {
                    synchronized (this.m) {
                        options = new BitmapFactory.Options();
                        this.l = options;
                        options.inMutable = true;
                        options.inSampleSize = i4;
                    }
                    try {
                        Bitmap h2 = h(uri, options);
                        synchronized (this.m) {
                            this.l = null;
                        }
                        return h2;
                    } catch (Throwable th) {
                        synchronized (this.m) {
                            this.l = null;
                            throw th;
                        }
                    }
                }
            }
            return null;
        }
        throw new IllegalArgumentException("bad argument to getScaledBitmap");
    }

    public void j(@x1 String str, @x1 Bitmap bitmap) {
        k(str, bitmap, null);
    }

    public void k(@x1 String str, @x1 Bitmap bitmap, @z1 b bVar) {
        PrintAttributes.MediaSize mediaSize;
        if (bitmap == null) {
            return;
        }
        PrintManager printManager = (PrintManager) this.k.getSystemService("print");
        if (g(bitmap)) {
            mediaSize = PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
        } else {
            mediaSize = PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
        }
        printManager.print(str, new c(str, this.n, bitmap, bVar), new PrintAttributes.Builder().setMediaSize(mediaSize).setColorMode(this.o).build());
    }

    public void l(@x1 String str, @x1 Uri uri) throws FileNotFoundException {
        m(str, uri, null);
    }

    public void m(@x1 String str, @x1 Uri uri, @z1 b bVar) throws FileNotFoundException {
        d dVar = new d(str, uri, bVar, this.n);
        PrintManager printManager = (PrintManager) this.k.getSystemService("print");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.o);
        int i2 = this.p;
        if (i2 == 1 || i2 == 0) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        } else if (i2 == 2) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager.print(str, dVar, builder.build());
    }

    public void n(int i2) {
        this.o = i2;
    }

    public void o(int i2) {
        this.p = i2;
    }

    public void p(int i2) {
        this.n = i2;
    }

    @e2(19)
    public void r(PrintAttributes printAttributes, int i2, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        new a(cancellationSignal, d ? printAttributes : b(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build(), bitmap, printAttributes, i2, parcelFileDescriptor, writeResultCallback).execute(new Void[0]);
    }
}