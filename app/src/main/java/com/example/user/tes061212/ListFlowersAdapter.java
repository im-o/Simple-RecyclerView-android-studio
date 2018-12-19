package com.example.user.tes061212;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class ListFlowersAdapter extends RecyclerView.Adapter<ListFlowersAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Flowers> listFlowers;

    public ArrayList<Flowers> getListFlowers(){
        return listFlowers;
    }

    public void setListFlowers(ArrayList<Flowers> listFlowers){
        this.listFlowers = listFlowers;
    }

    public ListFlowersAdapter(Context context){
        this.context = context;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemRow = layoutInflater.inflate(R.layout.item_row_flowers, parent, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
        holder.tvName.setText(getListFlowers().get(position).getName());
        holder.tvComment.setText(getListFlowers().get(position).getComment());

        Glide.with(context)
                .load(getListFlowers().get(position).getPhoto())
                .crossFade()
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListFlowers().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder{
        TextView tvName;
        TextView tvComment;
        ImageView imgPhoto;

        public CategoryViewHolder(View itemView){
            super(itemView);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvComment = (TextView) itemView.findViewById(R.id.tv_item_comment);
            imgPhoto = (ImageView) itemView.findViewById(R.id.img_item_photo);
        }
    }
}
