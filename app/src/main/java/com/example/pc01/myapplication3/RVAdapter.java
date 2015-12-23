package com.example.pc01.myapplication3;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by teguh on 29/06/2015.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder>implements View.OnClickListener {

    List<FeedItem> mItem;

   // private List<FeedItem> persons;

    public RVAdapter(){
        super();
        String nama = new String("Masakan");
        int harga = 1000;
        mItem = new ArrayList<FeedItem>();

        FeedItem FI = new FeedItem();
        FI.setName(nama+"1");
        FI.setThumbnail(R.drawable.i01);
        FI.setPrice(harga);
        mItem.add(FI);

        FI = new FeedItem();
        FI.setName(nama+"2");
        FI.setThumbnail(R.drawable.i02);
        FI.setPrice(harga);
        mItem.add(FI);

        FI = new FeedItem();
        FI.setName(nama+"3");
        FI.setThumbnail(R.drawable.i03);
        FI.setPrice(harga);
        mItem.add(FI);

        FI = new FeedItem();
        FI.setName(nama+"4");
        FI.setThumbnail(R.drawable.i04);
        FI.setPrice(harga);
        mItem.add(FI);

        FI = new FeedItem();
        FI.setName(nama+"5");
        FI.setThumbnail(R.drawable.i05);
        FI.setPrice(harga);
        mItem.add(FI);



    }

//    public RVAdapter(Context context, List<Page3Activity.FeedItem> I) {
//
//        this.persons = persons;
//        this.mContext = context;
//
//    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_main_item, parent, false);
    //  v.setOnClickListener(this);
        ViewHolder pvh = new ViewHolder(v);
        return pvh;
    }
//
//    @Override
//    public void onClick(View view) {
//        int itemPosition = vRecycle.getChildPosition(view);
//        //And use itemPosition to get the item from your collection. This way you dont restrain the ViewHolder with a OnClick callback
//    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        FeedItem FI = mItem.get(position);

        holder.personName.setText(FI.getName());
       // holder.personPrice.setText(FI.getPrice());
        holder.personPhoto.setImageResource(FI.getThumbnail());


    }

    @Override
    public int getItemCount() {
        return mItem.size();
    }

    @Override
    public void onClick(View v) {
        Snackbar sb = Snackbar.make(v, "test click", Snackbar.LENGTH_INDEFINITE);
        sb.show();
    }

    //    @Override
//    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
//        super.onAttachedToRecyclerView(recyclerView);
//    }
    class ViewHolder extends RecyclerView.ViewHolder {
        //  CardView cv;
        TextView personName;
        //   TextView personAge;
        ImageView personPhoto;
        TextView personPrice;
        int count=0;

        public ViewHolder(final View itemView) {
            super(itemView);

            mItem = new ArrayList<FeedItem>();
            final FeedItem feed = new FeedItem();
            // cv = (CardView)itemView.findViewById(R.id.cv);
            personName = (TextView)itemView.findViewById(R.id.tv_species);
            personPrice = (TextView) itemView.findViewById(R.id.prices);
            personPhoto = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            personPhoto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Snackbar sb = Snackbar.make(v, "Photo Click", Snackbar.LENGTH_INDEFINITE);
                    sb.show();
                }
            });
            ImageButton btn = (ImageButton) itemView.findViewById(R.id.imageButtonPlus);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

//                    feed.setPesanan(count,personName.getText());
                    count++;
                    Snackbar sb = Snackbar.make(v, personName.getText()+"jumlah pesanan"+count, Snackbar.LENGTH_INDEFINITE);
                    sb.show();
                }
            });
            ImageButton btnd = (ImageButton) itemView.findViewById(R.id.imageButtonMin);
            btnd.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    count--;
                    Snackbar sb = Snackbar.make(v, "jumlah pesanan"+count, Snackbar.LENGTH_INDEFINITE);
                    sb.show();
                }
            });

        }
}
}
