package com.app.MysportcityApp.adapters;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.MysportcityApp.R;
import com.app.MysportcityApp.objects.Category;
import com.app.MysportcityApp.objects.CategorySer;
import com.app.MysportcityApp.objects.Item;
import com.app.MysportcityApp.utils.Opener;
import com.app.MysportcityApp.view_holder.CategoryViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bugatti on 18/11/16.
 */

public class CatAdapter extends RecyclerView.Adapter<CategoryViewHolder> {

    List<Item> items = new ArrayList<>();
    Context mContext;

    public CatAdapter(List<Item> items, Context mContext) {
        this.items = items;
        this.mContext = mContext;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_cats, null, false);
//        CategoryViewHolder categoryViewHolder = new CategoryViewHolder(parent);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, final int position) {

        final Item category = items.get(position);
        holder.tvCatTitle.setText(category.getTitle());
        holder.tvCatTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Opener.CategoryNewsListing((Activity) mContext, position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
