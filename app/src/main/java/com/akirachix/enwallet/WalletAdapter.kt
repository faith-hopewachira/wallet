package com.akirachix.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class WalletAdapter(var walletList: List<Wallet>): RecyclerView.Adapter<WalletViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.categories_wallet,parent,false)
        return WalletViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: WalletViewHolder, position: Int) {
        val wallet = walletList[position]
        holder.tvDescription.text = wallet.description
        holder.tvPrice.text = wallet.price
        holder.tvDate.text = wallet.date

    }

    override fun getItemCount(): Int {
        return walletList.size
    }
}

class WalletViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvDescription = itemView.findViewById<TextView>(R.id.tvDescription)
    var tvPrice = itemView.findViewById<TextView>(R.id.tvPrice)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)

}
