package com.example.happybirthday.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.happybirthday.Domain.CategoryDomain;
import com.example.happybirthday.R;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.viewholder> {

    ArrayList<CategoryDomain> categoryDomains;
public CategoryAdapter(ArrayList<CategoryDomain>categoryDomains){
    this.categoryDomains=categoryDomains;

}
    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_category, parent, false);
        return new viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        holder.categoryName.setText(categoryDomains.get(position).getTitle());
        String picUrl = ""; // Declaración y asignación de la variable picUrl
        switch (position) {
            case 0:
                picUrl = "cat_1";
                break;
            case 1:
                picUrl = "cat_2";
                break;
            case 2:
                picUrl = "cat_3";
                break;
            case 3:
                picUrl = "cat_4";
                break;
            case 4:
                picUrl = "cat_5";
                break;
        }

        // Utilizar Glide para cargar la imagen en el ImageView
       // int resId = holder.itemView.getContext().getResources().getIdentifier(picUrl, "drawable", holder.itemView.getContext().getPackageName());
      //  Glide.with(holder.itemView.getContext()).load(resId).into(holder.categoryPic);


        // Aquí puedes usar la línea para obtener el resourceId si es necesario.
        int drawableResourceId = holder.itemView.getContext().getResources().getIdentifier(picUrl, "drawable", holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.categoryPic);
    }

    @Override
    public int getItemCount() {
        return categoryDomains.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView categoryName;
        ImageView categoryPic;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            categoryName = itemView.findViewById(R.id.categoryName);
            categoryPic = itemView.findViewById(R.id.categoryPic);
        }
    }
}
