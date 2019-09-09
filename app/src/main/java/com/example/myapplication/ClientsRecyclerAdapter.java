package com.example.myapplication;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ClientsRecyclerAdapter extends RecyclerView.Adapter<ClientsRecyclerAdapter.MyViewHolder> {

    private List<Clients> clients;
    private Activity activity;
    private ClientCardClickListener cardClickListener;

    public ClientsRecyclerAdapter(List<Clients> clients, Activity activity, ClientCardClickListener cardClickListener) {
        this.clients = clients;
        this.activity = activity;
        this.cardClickListener = cardClickListener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.clients_card,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
       holder.clientLogo.setImageResource(clients.get(position).getLogo());
       holder.clientName.setText(clients.get(position).getClientName());
       holder.totalAmount.setText("Total: "+clients.get(position).getTotal().toString());
       holder.date.setText("Date: "+clients.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        return clients.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView clientLogo;
        TextView clientName, totalAmount, date;


        public MyViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            clientLogo = itemView.findViewById(R.id.client_logo);
            clientName = itemView.findViewById(R.id.clinet_name);
            totalAmount = itemView.findViewById(R.id.totalprice);
            date = itemView.findViewById(R.id.bill_date);
        }

        @Override
        public void onClick(View view) {
            cardClickListener.cardClicked(view,getLayoutPosition(),clients.get(getLayoutPosition()));
        }
    }
}
