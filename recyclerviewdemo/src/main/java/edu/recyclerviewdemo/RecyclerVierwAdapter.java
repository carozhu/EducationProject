package edu.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by caro on 2017/2/22.
 */

public class RecyclerVierwAdapter extends RecyclerView.Adapter<RecyclerVierwAdapter.ViewHolder> {

    private List<String> stringList;

    public RecyclerVierwAdapter(List<String> stringList){
        this.stringList = stringList;
    }

    public void setStringList(List<String> stringList){
        this.stringList = stringList;
    }

    /**
     * Create a new view.
     * @param viewGroup
     * @param viewType
     * @return
     */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_row_item, viewGroup, false);

        return new ViewHolder(v);
    }


    // BEGIN_INCLUDE(recyclerViewOnBindViewHolder)
    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        // Get element from your dataset at this position and replace the contents of the view
        // with that element
        viewHolder.render(stringList,position);
    }

    @Override
    public int getItemCount() {
        //return stringList.size();
        return stringList == null ? 0 :stringList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private TextView lableTv;
        public ViewHolder(View v) {
            super(v);
            textView = (TextView) v.findViewById(R.id.textView);
            lableTv = (TextView)v.findViewById(R.id.label);
            // Define click listener for the ViewHolder's View.
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

        }

        public void render(List<String> datalist,int position){
            textView.setText(datalist.get(position));
            lableTv.setText(datalist.get(position));
        }
    }

}
