package com.example.tugas_day06;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class adapterhp extends RecyclerView.Adapter<adapterhp.ViewHolder> {

    private ArrayList<allhp> allhps;
    private OnItemClickListener mListener;


    public interface OnItemClickListener {
        void onItemClick(int position);
    }


    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public adapterhp(ArrayList<allhp> allhps) {
        this.allhps = allhps;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        allhp currentItem = allhps.get(position);
        holder.s24a.setText(currentItem.getNamahp());
        holder.hp2.setImageResource(currentItem.getLogohp());
    }

    @Override
    public int getItemCount() {
        return allhps.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView s24a;
        ImageView hp2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            s24a = itemView.findViewById(R.id.s24a);
            hp2 = itemView.findViewById(R.id.hp2);


            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            if (position != RecyclerView.NO_POSITION && mListener != null) {
                mListener.onItemClick(position);
            }
        }
    }
}
