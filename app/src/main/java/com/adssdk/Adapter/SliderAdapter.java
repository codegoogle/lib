package com.adssdk.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.adssdk.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class SliderAdapter extends
        SliderViewAdapter<SliderAdapter.SliderAdapterVH> {

    private Context context;
    private List<Integer> mSliderItems = new ArrayList<>();
    Slider_Adapter_Click slider_adapter_click;

    public SliderAdapter(Context context, ArrayList<Integer> mSliderItems, Slider_Adapter_Click slider_adapter_click) {
        this.context = context;
        this.mSliderItems = mSliderItems;
        this.slider_adapter_click = slider_adapter_click;
    }

    public interface Slider_Adapter_Click {
        public void clickOnSliderAdapter(View v);
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_slider, null);
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, final int position) {

        Integer sliderItem = mSliderItems.get(position);
        viewHolder.imageView.setImageResource(sliderItem);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slider_adapter_click.clickOnSliderAdapter(v);
            }
        });
    }

    @Override
    public int getCount() {
        return mSliderItems.size();
    }

    class SliderAdapterVH extends SliderViewAdapter.ViewHolder {

        View itemView;
        ImageView imageView;

        public SliderAdapterVH(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            this.itemView = itemView;
        }
    }

}