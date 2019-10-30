package com.heni.kampustertua;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListKampusAdapter extends RecyclerView.Adapter<ListKampusAdapter.ListViewHolder> {
    private ArrayList<Kampus> listKampus;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }
    public ListKampusAdapter(ArrayList<Kampus> list){
        this.listKampus = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_kampus, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListKampusAdapter.ListViewHolder holder, int position) {
        Kampus kampus = listKampus.get(position);
        holder.tvKampus.setText(kampus.getName());
        holder.tvDetail.setText(kampus.getDetail());
        Glide.with(holder.itemView.getContext())
                .load(kampus.getPhoto())
                .apply(new RequestOptions().override(60,55))
                .into(holder.Gambar);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listKampus.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listKampus.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvKampus, tvDetail;
        ImageView Gambar;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvKampus = itemView.findViewById(R.id.tv_name);
            tvDetail = itemView.findViewById(R.id.tv_detail);
            Gambar = itemView.findViewById(R.id.img_kampus);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(Kampus data);
    }
}
