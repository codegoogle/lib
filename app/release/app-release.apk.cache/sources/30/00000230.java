package androidx.palette.graphics;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.SparseBooleanArray;
import com.p7700g.p99005.c2;
import com.p7700g.p99005.f14;
import com.p7700g.p99005.fj;
import com.p7700g.p99005.q7;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.w0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.zg2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class Palette {
    public static final int DEFAULT_CALCULATE_NUMBER_COLORS = 16;
    public static final Filter DEFAULT_FILTER = new Filter() { // from class: androidx.palette.graphics.Palette.1
        private static final float BLACK_MAX_LIGHTNESS = 0.05f;
        private static final float WHITE_MIN_LIGHTNESS = 0.95f;

        private boolean isBlack(float[] fArr) {
            return fArr[2] <= BLACK_MAX_LIGHTNESS;
        }

        private boolean isNearRedILine(float[] fArr) {
            return fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f;
        }

        private boolean isWhite(float[] fArr) {
            return fArr[2] >= WHITE_MIN_LIGHTNESS;
        }

        @Override // androidx.palette.graphics.Palette.Filter
        public boolean isAllowed(int i, float[] fArr) {
            return (isWhite(fArr) || isBlack(fArr) || isNearRedILine(fArr)) ? false : true;
        }
    };
    public static final int DEFAULT_RESIZE_BITMAP_AREA = 12544;
    public static final String LOG_TAG = "Palette";
    public static final boolean LOG_TIMINGS = false;
    public static final float MIN_CONTRAST_BODY_TEXT = 4.5f;
    public static final float MIN_CONTRAST_TITLE_TEXT = 3.0f;
    private final List<Swatch> mSwatches;
    private final List<Target> mTargets;
    private final SparseBooleanArray mUsedColors = new SparseBooleanArray();
    private final Map<Target, Swatch> mSelectedSwatches = new q7();
    @z1
    private final Swatch mDominantSwatch = findDominantSwatch();

    /* loaded from: classes.dex */
    public interface Filter {
        boolean isAllowed(@w0 int i, @x1 float[] fArr);
    }

    /* loaded from: classes.dex */
    public interface PaletteAsyncListener {
        void onGenerated(@z1 Palette palette);
    }

    public Palette(List<Swatch> list, List<Target> list2) {
        this.mSwatches = list;
        this.mTargets = list2;
    }

    @z1
    private Swatch findDominantSwatch() {
        int size = this.mSwatches.size();
        int i = Integer.MIN_VALUE;
        Swatch swatch = null;
        for (int i2 = 0; i2 < size; i2++) {
            Swatch swatch2 = this.mSwatches.get(i2);
            if (swatch2.getPopulation() > i) {
                i = swatch2.getPopulation();
                swatch = swatch2;
            }
        }
        return swatch;
    }

    @x1
    public static Builder from(@x1 Bitmap bitmap) {
        return new Builder(bitmap);
    }

    @Deprecated
    public static Palette generate(Bitmap bitmap) {
        return from(bitmap).generate();
    }

    @Deprecated
    public static AsyncTask<Bitmap, Void, Palette> generateAsync(Bitmap bitmap, PaletteAsyncListener paletteAsyncListener) {
        return from(bitmap).generate(paletteAsyncListener);
    }

    private float generateScore(Swatch swatch, Target target) {
        float[] hsl = swatch.getHsl();
        Swatch swatch2 = this.mDominantSwatch;
        int population = swatch2 != null ? swatch2.getPopulation() : 1;
        return (target.getSaturationWeight() > 0.0f ? (1.0f - Math.abs(hsl[1] - target.getTargetSaturation())) * target.getSaturationWeight() : 0.0f) + (target.getLightnessWeight() > 0.0f ? (1.0f - Math.abs(hsl[2] - target.getTargetLightness())) * target.getLightnessWeight() : 0.0f) + (target.getPopulationWeight() > 0.0f ? (swatch.getPopulation() / population) * target.getPopulationWeight() : 0.0f);
    }

    @z1
    private Swatch generateScoredTarget(Target target) {
        Swatch maxScoredSwatchForTarget = getMaxScoredSwatchForTarget(target);
        if (maxScoredSwatchForTarget != null && target.isExclusive()) {
            this.mUsedColors.append(maxScoredSwatchForTarget.getRgb(), true);
        }
        return maxScoredSwatchForTarget;
    }

    @z1
    private Swatch getMaxScoredSwatchForTarget(Target target) {
        int size = this.mSwatches.size();
        float f = 0.0f;
        Swatch swatch = null;
        for (int i = 0; i < size; i++) {
            Swatch swatch2 = this.mSwatches.get(i);
            if (shouldBeScoredForTarget(swatch2, target)) {
                float generateScore = generateScore(swatch2, target);
                if (swatch == null || generateScore > f) {
                    swatch = swatch2;
                    f = generateScore;
                }
            }
        }
        return swatch;
    }

    private boolean shouldBeScoredForTarget(Swatch swatch, Target target) {
        float[] hsl = swatch.getHsl();
        return hsl[1] >= target.getMinimumSaturation() && hsl[1] <= target.getMaximumSaturation() && hsl[2] >= target.getMinimumLightness() && hsl[2] <= target.getMaximumLightness() && !this.mUsedColors.get(swatch.getRgb());
    }

    @w0
    public int getColorForTarget(@x1 Target target, @w0 int i) {
        Swatch swatchForTarget = getSwatchForTarget(target);
        return swatchForTarget != null ? swatchForTarget.getRgb() : i;
    }

    @w0
    public int getDarkMutedColor(@w0 int i) {
        return getColorForTarget(Target.DARK_MUTED, i);
    }

    @z1
    public Swatch getDarkMutedSwatch() {
        return getSwatchForTarget(Target.DARK_MUTED);
    }

    @w0
    public int getDarkVibrantColor(@w0 int i) {
        return getColorForTarget(Target.DARK_VIBRANT, i);
    }

    @z1
    public Swatch getDarkVibrantSwatch() {
        return getSwatchForTarget(Target.DARK_VIBRANT);
    }

    @w0
    public int getDominantColor(@w0 int i) {
        Swatch swatch = this.mDominantSwatch;
        return swatch != null ? swatch.getRgb() : i;
    }

    @z1
    public Swatch getDominantSwatch() {
        return this.mDominantSwatch;
    }

    @w0
    public int getLightMutedColor(@w0 int i) {
        return getColorForTarget(Target.LIGHT_MUTED, i);
    }

    @z1
    public Swatch getLightMutedSwatch() {
        return getSwatchForTarget(Target.LIGHT_MUTED);
    }

    @w0
    public int getLightVibrantColor(@w0 int i) {
        return getColorForTarget(Target.LIGHT_VIBRANT, i);
    }

    @z1
    public Swatch getLightVibrantSwatch() {
        return getSwatchForTarget(Target.LIGHT_VIBRANT);
    }

    @w0
    public int getMutedColor(@w0 int i) {
        return getColorForTarget(Target.MUTED, i);
    }

    @z1
    public Swatch getMutedSwatch() {
        return getSwatchForTarget(Target.MUTED);
    }

    @z1
    public Swatch getSwatchForTarget(@x1 Target target) {
        return this.mSelectedSwatches.get(target);
    }

    @x1
    public List<Swatch> getSwatches() {
        return Collections.unmodifiableList(this.mSwatches);
    }

    @x1
    public List<Target> getTargets() {
        return Collections.unmodifiableList(this.mTargets);
    }

    @w0
    public int getVibrantColor(@w0 int i) {
        return getColorForTarget(Target.VIBRANT, i);
    }

    @z1
    public Swatch getVibrantSwatch() {
        return getSwatchForTarget(Target.VIBRANT);
    }

    @x1
    public static Palette from(@x1 List<Swatch> list) {
        return new Builder(list).generate();
    }

    @Deprecated
    public static Palette generate(Bitmap bitmap, int i) {
        return from(bitmap).maximumColorCount(i).generate();
    }

    @Deprecated
    public static AsyncTask<Bitmap, Void, Palette> generateAsync(Bitmap bitmap, int i, PaletteAsyncListener paletteAsyncListener) {
        return from(bitmap).maximumColorCount(i).generate(paletteAsyncListener);
    }

    public void generate() {
        int size = this.mTargets.size();
        for (int i = 0; i < size; i++) {
            Target target = this.mTargets.get(i);
            target.normalizeWeights();
            this.mSelectedSwatches.put(target, generateScoredTarget(target));
        }
        this.mUsedColors.clear();
    }

    /* loaded from: classes.dex */
    public static final class Swatch {
        private final int mBlue;
        private int mBodyTextColor;
        private boolean mGeneratedTextColors;
        private final int mGreen;
        @z1
        private float[] mHsl;
        private final int mPopulation;
        private final int mRed;
        private final int mRgb;
        private int mTitleTextColor;

        public Swatch(@w0 int i, int i2) {
            this.mRed = Color.red(i);
            this.mGreen = Color.green(i);
            this.mBlue = Color.blue(i);
            this.mRgb = i;
            this.mPopulation = i2;
        }

        private void ensureTextColorsGenerated() {
            int B;
            int B2;
            if (this.mGeneratedTextColors) {
                return;
            }
            int n = fj.n(-1, this.mRgb, 4.5f);
            int n2 = fj.n(-1, this.mRgb, 3.0f);
            if (n != -1 && n2 != -1) {
                this.mBodyTextColor = fj.B(-1, n);
                this.mTitleTextColor = fj.B(-1, n2);
                this.mGeneratedTextColors = true;
                return;
            }
            int n3 = fj.n(sr.t, this.mRgb, 4.5f);
            int n4 = fj.n(sr.t, this.mRgb, 3.0f);
            if (n3 != -1 && n4 != -1) {
                this.mBodyTextColor = fj.B(sr.t, n3);
                this.mTitleTextColor = fj.B(sr.t, n4);
                this.mGeneratedTextColors = true;
                return;
            }
            if (n != -1) {
                B = fj.B(-1, n);
            } else {
                B = fj.B(sr.t, n3);
            }
            this.mBodyTextColor = B;
            if (n2 != -1) {
                B2 = fj.B(-1, n2);
            } else {
                B2 = fj.B(sr.t, n4);
            }
            this.mTitleTextColor = B2;
            this.mGeneratedTextColors = true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Swatch.class != obj.getClass()) {
                return false;
            }
            Swatch swatch = (Swatch) obj;
            return this.mPopulation == swatch.mPopulation && this.mRgb == swatch.mRgb;
        }

        @w0
        public int getBodyTextColor() {
            ensureTextColorsGenerated();
            return this.mBodyTextColor;
        }

        @x1
        public float[] getHsl() {
            if (this.mHsl == null) {
                this.mHsl = new float[3];
            }
            fj.d(this.mRed, this.mGreen, this.mBlue, this.mHsl);
            return this.mHsl;
        }

        public int getPopulation() {
            return this.mPopulation;
        }

        @w0
        public int getRgb() {
            return this.mRgb;
        }

        @w0
        public int getTitleTextColor() {
            ensureTextColorsGenerated();
            return this.mTitleTextColor;
        }

        public int hashCode() {
            return (this.mRgb * 31) + this.mPopulation;
        }

        public String toString() {
            return Swatch.class.getSimpleName() + " [RGB: #" + Integer.toHexString(getRgb()) + f14.v + " [HSL: " + Arrays.toString(getHsl()) + f14.v + " [Population: " + this.mPopulation + f14.v + " [Title Text: #" + Integer.toHexString(getTitleTextColor()) + f14.v + " [Body Text: #" + Integer.toHexString(getBodyTextColor()) + f14.v;
        }

        public Swatch(int i, int i2, int i3, int i4) {
            this.mRed = i;
            this.mGreen = i2;
            this.mBlue = i3;
            this.mRgb = Color.rgb(i, i2, i3);
            this.mPopulation = i4;
        }

        public Swatch(float[] fArr, int i) {
            this(fj.a(fArr), i);
            this.mHsl = fArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        @z1
        private final Bitmap mBitmap;
        private final List<Filter> mFilters;
        private int mMaxColors;
        @z1
        private Rect mRegion;
        private int mResizeArea;
        private int mResizeMaxDimension;
        @z1
        private final List<Swatch> mSwatches;
        private final List<Target> mTargets;

        public Builder(@x1 Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.mTargets = arrayList;
            this.mMaxColors = 16;
            this.mResizeArea = 12544;
            this.mResizeMaxDimension = -1;
            ArrayList arrayList2 = new ArrayList();
            this.mFilters = arrayList2;
            if (bitmap != null && !bitmap.isRecycled()) {
                arrayList2.add(Palette.DEFAULT_FILTER);
                this.mBitmap = bitmap;
                this.mSwatches = null;
                arrayList.add(Target.LIGHT_VIBRANT);
                arrayList.add(Target.VIBRANT);
                arrayList.add(Target.DARK_VIBRANT);
                arrayList.add(Target.LIGHT_MUTED);
                arrayList.add(Target.MUTED);
                arrayList.add(Target.DARK_MUTED);
                return;
            }
            throw new IllegalArgumentException("Bitmap is not valid");
        }

        private int[] getPixelsFromBitmap(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.mRegion;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.mRegion.height();
            int[] iArr2 = new int[width2 * height2];
            for (int i = 0; i < height2; i++) {
                Rect rect2 = this.mRegion;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }

        private Bitmap scaleBitmapDown(Bitmap bitmap) {
            int max;
            int i;
            double d = -1.0d;
            if (this.mResizeArea > 0) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                int i2 = this.mResizeArea;
                if (height > i2) {
                    d = Math.sqrt(i2 / height);
                }
            } else if (this.mResizeMaxDimension > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.mResizeMaxDimension)) {
                d = i / max;
            }
            return d <= zg2.s ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
        }

        @x1
        public Builder addFilter(Filter filter) {
            if (filter != null) {
                this.mFilters.add(filter);
            }
            return this;
        }

        @x1
        public Builder addTarget(@x1 Target target) {
            if (!this.mTargets.contains(target)) {
                this.mTargets.add(target);
            }
            return this;
        }

        @x1
        public Builder clearFilters() {
            this.mFilters.clear();
            return this;
        }

        @x1
        public Builder clearRegion() {
            this.mRegion = null;
            return this;
        }

        @x1
        public Builder clearTargets() {
            List<Target> list = this.mTargets;
            if (list != null) {
                list.clear();
            }
            return this;
        }

        @x1
        public Palette generate() {
            List<Swatch> list;
            Filter[] filterArr;
            Bitmap bitmap = this.mBitmap;
            if (bitmap != null) {
                Bitmap scaleBitmapDown = scaleBitmapDown(bitmap);
                Rect rect = this.mRegion;
                if (scaleBitmapDown != this.mBitmap && rect != null) {
                    double width = scaleBitmapDown.getWidth() / this.mBitmap.getWidth();
                    rect.left = (int) Math.floor(rect.left * width);
                    rect.top = (int) Math.floor(rect.top * width);
                    rect.right = Math.min((int) Math.ceil(rect.right * width), scaleBitmapDown.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(rect.bottom * width), scaleBitmapDown.getHeight());
                }
                int[] pixelsFromBitmap = getPixelsFromBitmap(scaleBitmapDown);
                int i = this.mMaxColors;
                if (this.mFilters.isEmpty()) {
                    filterArr = null;
                } else {
                    List<Filter> list2 = this.mFilters;
                    filterArr = (Filter[]) list2.toArray(new Filter[list2.size()]);
                }
                ColorCutQuantizer colorCutQuantizer = new ColorCutQuantizer(pixelsFromBitmap, i, filterArr);
                if (scaleBitmapDown != this.mBitmap) {
                    scaleBitmapDown.recycle();
                }
                list = colorCutQuantizer.getQuantizedColors();
            } else {
                list = this.mSwatches;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            Palette palette = new Palette(list, this.mTargets);
            palette.generate();
            return palette;
        }

        @x1
        public Builder maximumColorCount(int i) {
            this.mMaxColors = i;
            return this;
        }

        @x1
        public Builder resizeBitmapArea(int i) {
            this.mResizeArea = i;
            this.mResizeMaxDimension = -1;
            return this;
        }

        @x1
        @Deprecated
        public Builder resizeBitmapSize(int i) {
            this.mResizeMaxDimension = i;
            this.mResizeArea = -1;
            return this;
        }

        @x1
        public Builder setRegion(@c2 int i, @c2 int i2, @c2 int i3, @c2 int i4) {
            if (this.mBitmap != null) {
                if (this.mRegion == null) {
                    this.mRegion = new Rect();
                }
                this.mRegion.set(0, 0, this.mBitmap.getWidth(), this.mBitmap.getHeight());
                if (!this.mRegion.intersect(i, i2, i3, i4)) {
                    throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
                }
            }
            return this;
        }

        public Builder(@x1 List<Swatch> list) {
            this.mTargets = new ArrayList();
            this.mMaxColors = 16;
            this.mResizeArea = 12544;
            this.mResizeMaxDimension = -1;
            ArrayList arrayList = new ArrayList();
            this.mFilters = arrayList;
            if (list != null && !list.isEmpty()) {
                arrayList.add(Palette.DEFAULT_FILTER);
                this.mSwatches = list;
                this.mBitmap = null;
                return;
            }
            throw new IllegalArgumentException("List of Swatches is not valid");
        }

        @x1
        public AsyncTask<Bitmap, Void, Palette> generate(@x1 final PaletteAsyncListener paletteAsyncListener) {
            if (paletteAsyncListener != null) {
                return new AsyncTask<Bitmap, Void, Palette>() { // from class: androidx.palette.graphics.Palette.Builder.1
                    @Override // android.os.AsyncTask
                    @z1
                    public Palette doInBackground(Bitmap... bitmapArr) {
                        try {
                            return Builder.this.generate();
                        } catch (Exception unused) {
                            return null;
                        }
                    }

                    @Override // android.os.AsyncTask
                    public void onPostExecute(@z1 Palette palette) {
                        paletteAsyncListener.onGenerated(palette);
                    }
                }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.mBitmap);
            }
            throw new IllegalArgumentException("listener can not be null");
        }
    }
}