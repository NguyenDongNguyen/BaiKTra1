package com.example.baiktra1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SignerAdapter extends RecyclerView.Adapter<SignerAdapter.UserViewHolder>{
    private Context mContext;
    private List<Singer> mListSinger;

    public SignerAdapter(List<Singer> mListComputer) {
        this.mListSinger = mListComputer;
    }


    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_singer,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        Singer singer = mListSinger.get(position);
        if (singer == null) {
            return;
        }

        holder.imageUser.setImageResource(singer.getAnh());
        holder.tvName.setText(singer.getTen());
        holder.tvNgheDanh.setText(singer.getNghedanh());
        holder.tvQuocGia.setText(singer.getQuocgia());
    }

    @Override
    public int getItemCount() {
        if (mListSinger != null) {
            return mListSinger.size();
        }
        return 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageUser;
        private TextView tvName,tvNgheDanh,tvQuocGia;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            imageUser = itemView.findViewById(R.id.img_user);
            tvName = itemView.findViewById(R.id.tv_name);
            tvNgheDanh = itemView.findViewById(R.id.tv_nghedanh);
            tvQuocGia = itemView.findViewById(R.id.tv_quocgia);
        }
    }
}
