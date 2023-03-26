package com.adssdk.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.adssdk.AnimationObject;
import com.adssdk.R;
import com.lib.adssdk.AdsManager.AdsManager;

import java.util.ArrayList;

public class RecycerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<Integer> list;
    private RecycerViewAdapter_Click recycerViewAdapter_click;
    private boolean isTop = true;
    Integer layoutId;
    AnimationObject.AnimationType animationType;

    public RecycerViewAdapter(Context context, ArrayList<Integer> list, Integer layoutId, AnimationObject.AnimationType animationType, RecycerViewAdapter_Click recycerViewAdapter_click) {
        this.context = context;
        this.list = list;
        this.recycerViewAdapter_click = recycerViewAdapter_click;
        this.layoutId = layoutId;
        this.animationType = animationType;
    }

    public interface RecycerViewAdapter_Click {
        public void clickOnRecycerViewAdapter(View v);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if (viewType == -1) {
            return new MyAdsViewHolder(LayoutInflater.from(context).inflate(R.layout.ads_viewholder, parent, false));
        }
        return new MyViewHolder(LayoutInflater.from(context).inflate(layoutId, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        AnimationObject.setAnimation(context, holder.itemView, animationType);
        int type = holder.getItemViewType();

        if (type == -1) {

            MyAdsViewHolder adsViewHolder = (MyAdsViewHolder) holder;

            if (isTop) {
                isTop = false;
                AdsManager.showNativeExtraTop((Activity) context, adsViewHolder.ads);
            } else {
                isTop = true;
                AdsManager.showNativeExtraBottom((Activity) context, adsViewHolder.ads);
            }

        } else {
            MyViewHolder myViewHolder = (MyViewHolder) holder;
            myViewHolder.imageView.setImageResource(list.get(position));
            myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    recycerViewAdapter_click.clickOnRecycerViewAdapter(view);
                }
            });
        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    @Override
    public int getItemViewType(int position) {
        if (list.get(position) == -1 ) {
            return -1;
        } else {
            return 1;
        }
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }

    public class MyAdsViewHolder extends RecyclerView.ViewHolder {


        LinearLayout ads;

        public MyAdsViewHolder(@NonNull View itemView) {
            super(itemView);

            ads = itemView.findViewById(R.id.ads);
        }
    }
}
