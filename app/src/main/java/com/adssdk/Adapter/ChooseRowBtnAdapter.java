package com.adssdk.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.adssdk.R;
import com.adssdk.Model.ChooseRowModel;



import java.util.ArrayList;

public class ChooseRowBtnAdapter extends RecyclerView.Adapter<ChooseRowBtnAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<ChooseRowModel> unselectedList;
    private ArrayList<ChooseRowModel> selectedList;
    private ChooseRowBtnAdapter_Click chooseRowBtnAdapter_click;
    private Integer layoutId;

    public ChooseRowBtnAdapter(Context context, ArrayList<ChooseRowModel> unselectedList, ArrayList<ChooseRowModel> selectedList, Integer layoutId, ChooseRowBtnAdapter_Click chooseRowBtnAdapter_click) {
        this.context = context;
        this.unselectedList = unselectedList;
        this.selectedList = selectedList;
        this.layoutId = layoutId;
        this.chooseRowBtnAdapter_click = chooseRowBtnAdapter_click;
    }

    public interface ChooseRowBtnAdapter_Click {
        public void clickOnRecycerViewAdapter(View v, Integer pos);
    }

    @NonNull
    @Override
    public ChooseRowBtnAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(layoutId, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ChooseRowModel chooseRowModel = unselectedList.get(position);
        if (chooseRowModel.getSelected()) {
            holder.imageView.setImageResource(selectedList.get(position).getId());
        } else {
            holder.imageView.setImageResource(unselectedList.get(position).getId());
        }


        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (unselectedList.get(holder.getAdapterPosition()).getSelected()) {
                    unselectedList.get(holder.getAdapterPosition()).setSelected(false);
                } else {
                    unselectedList.get(holder.getAdapterPosition()).setSelected(true);
                }
                notifyDataSetChanged();
                chooseRowBtnAdapter_click.clickOnRecycerViewAdapter(view, holder.getAdapterPosition());
            }
        });

    }

    @Override
    public int getItemCount() {
        return unselectedList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
