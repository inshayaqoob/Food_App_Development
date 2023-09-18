package Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project5.R;


import Models.FoodModel;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {
    private ArrayList<FoodModel> arrlist;
    private Context context;

    public FoodAdapter(ArrayList<FoodModel> arrlist, Context context) {
        this.arrlist = arrlist;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FoodModel model = arrlist.get(position);
        holder.imgview.setImageResource(model.getImages1());
        holder.txtview.setText(model.getText());
    }

    @Override
    public int getItemCount() {
        return arrlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgview;
        TextView txtview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgview = itemView.findViewById(R.id.imgV);
            txtview = itemView.findViewById(R.id.textView);
        }
    }
}
