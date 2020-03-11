package Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.elab.bhojan.MainActivity;
import com.elab.bhojan.R;

import java.util.List;

import Model.listitem;

import static android.media.CamcorderProfile.get;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    int count=0;
    private Context context;
    private List<listitem> listitems;

    public MyAdapter(Context context, List listitem) {
        this.context = context;
        this.listitems = listitem;

    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        listitem items = listitems.get(position);
        holder.name.setText(items.getName());
        holder.price.setText(items.getPrice());
        holder.quantity.setText(items.getqu());
    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView name;
        public TextView price;
        public TextView quantity;
        public Button submit;
        public Button addButton;
        public Button minusbutton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            name = (TextView) itemView.findViewById(R.id.name);
            price = (TextView) itemView.findViewById(R.id.price);
            quantity = (TextView) itemView.findViewById(R.id.quantity);
            addButton = (Button) itemView.findViewById(R.id.add);
            minusbutton = (Button) itemView.findViewById(R.id.minus);
            //submit = (Button) itemView.findViewById(R.id.place);
           /* submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context,"Order placed...Returning to main menu",Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(context, MainActivity.class);
                    context.startActivity(intent);
                }
            });
*/

            addButton.setOnClickListener(this);
            minusbutton.setOnClickListener(this);
        }
        public void onClick(View view) {
            switch (view.getId())
            {
                case R.id.add :
                    int position = getAdapterPosition();
                    listitem items = listitems.get(position);
                    editItem(items);

                    break;
                case R.id.minus :
                     position = getAdapterPosition();
                     items = listitems.get(position);

                    editminusItem(items);
                    break;
            }

        }

        private void editminusItem(final listitem items) {
            if(items.getqu().equals("0"))
            {
             Toast.makeText(context,"wrong",Toast.LENGTH_LONG).show();
            }
            else {
                --count;
                String c = Integer.toString(count);
                items.setqu(c);
            }
            addtofirebase();

        }



        private void editItem(final listitem items) {
            ++count;
            String c=Integer.toString(count);
            Toast.makeText(context,c,Toast.LENGTH_LONG).show();
            items.setqu(c);
            //addtofirebase();


        }
        private void addtofirebase() {

        }



    }
}