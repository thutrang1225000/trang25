package sneaker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.store.R;

import java.util.List;
import java.util.Locale;


public class SneakerAdapter extends  RecyclerView.Adapter<SneakerAdapter.SneakerViewHolder>{
    private List<Sneaker> mSneaker;
    public  void setData(List<Sneaker> list){
        this.mSneaker = list;
        notifyDataSetChanged();
    };


    @NonNull
    @Override
    public SneakerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sneaker,parent,false);
        return new SneakerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SneakerViewHolder holder, int position) {
Sneaker sneaker= mSneaker.get(position);
if(sneaker == null){
    return;
}
holder.imgSneaker.setImageResource(sneaker.getResourceId());
holder.tvTitle.setText(sneaker.getTitle());
    }

    @Override
    public int getItemCount() {
        if (mSneaker!= null){
            return mSneaker.size();
        }
        return 0;
    }

    public class SneakerViewHolder extends RecyclerView.ViewHolder{
    private ImageView imgSneaker;
    private TextView tvTitle;

    public SneakerViewHolder(@NonNull View itemView) {
            super(itemView);

            imgSneaker= itemView.findViewById(R.id.img_sneaker);
            tvTitle =itemView.findViewById(R.id.tv_title);

        }
    }
}
