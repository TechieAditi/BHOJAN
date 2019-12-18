package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.elab.bhojan.R;

import java.util.List;

import Model.listitem;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
private Context context;
private  List<listitem> listitems;
  public MyAdapter(Context context, List listitem)
  {
      this.context=context;
      this.listitems=listitem;

  }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row,parent,false);
      return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
      listitem items=listitems.get(position);
     holder.name.setText(items.getName());
     holder.price.setText(items.getPrice());
    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        public TextView name;
        public TextView price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            name=(TextView)itemView.findViewById(R.id.name);
            price=(TextView)itemView.findViewById(R.id.price);

        }

        @Override
        public void onClick(View view) {

            //get position of the row click
            int pos=getAdapterPosition();
            listitem item=listitems.get(pos);
            Toast.makeText(context,item.getName(),Toast.LENGTH_LONG).show();
            Toast.makeText(context,item.getPrice(),Toast.LENGTH_LONG).show();
        }
    }
}
