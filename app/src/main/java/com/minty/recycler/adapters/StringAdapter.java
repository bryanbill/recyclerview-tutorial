package com.minty.recycler.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.minty.recycler.R;

import java.util.List;

public class StringAdapter extends RecyclerView.Adapter<StringAdapter.Viewholder> {
    private List<String> mData;
    private Context mContext;
    // Provide a reference to the views for each data item
    public StringAdapter(Context context, List<String> data) {
        mData = data;
        mContext = context;
    }

    // Create new views (invoked by the layout manager)
    //Inflate the layout for each item in the list
    @Override
    public StringAdapter.Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(mContext, R.layout.string_item, null);
        return new Viewholder(view);
    }

    // Called by the layout manager when it needs a new view
    @Override
    public void onBindViewHolder(StringAdapter.Viewholder holder, int position) {
        holder.mTextView.setText(mData.get(position));
    }

    //Returns the number of items in the list
    @Override
    public int getItemCount() {
        return mData.size();
    }

    //Holds the current View Item, and the View Item's position in the RecyclerView
    public class Viewholder extends RecyclerView.ViewHolder {
        private TextView mTextView;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.textView);
        }
    }

}
