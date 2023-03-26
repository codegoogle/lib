package com.lib.adssdk.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.lib.adssdk.R;

public class QurekaSSAdapter extends RecyclerView.Adapter<QurekaSSAdapter.MyViewHolder> {

    String[] adsIdsList;
    Context context;
    QurekaSSAdapterClick qurekaSSAdapterClick;

    public QurekaSSAdapter(Context context, String[] adsIdsList, QurekaSSAdapterClick qurekaSSAdapterClick) {
        this.context = context;
        this.adsIdsList = adsIdsList;
        this.qurekaSSAdapterClick = qurekaSSAdapterClick;
    }


    public interface QurekaSSAdapterClick {
        public void click();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.qurekass_adapter, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Glide.with(context).load(adsIdsList[position]).centerCrop().into(holder.imageViewSS);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qurekaSSAdapterClick.click();
            }
        });
    }

    @Override
    public int getItemCount() {
        return adsIdsList.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewSS;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewSS = itemView.findViewById(R.id.imageViewSS);
        }
    }
}
