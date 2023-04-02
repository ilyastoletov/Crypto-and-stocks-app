package com.appninjas.cryptoandstocks.presentation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.appninjas.cryptoandstocks.R
import com.appninjas.cryptoandstocks.databinding.CryptoListItemBinding
import com.appninjas.cryptoandstocks.domain.model.Crypto
import com.squareup.picasso.Picasso

class CryptoAdapter(private val cryptoList: ArrayList<Crypto>) : RecyclerView.Adapter<CryptoAdapter.Holder>() {

    inner class Holder(private val binding: CryptoListItemBinding, itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(model: Crypto) {
            with(binding) {
                currencyName.text = model.name
                shortName.text = model.shortName
                course.text = model.rate + " $"
                dailyChange.text = "24h change: " + model.dayChange + "$"
                Picasso.get().load(model.imageURL).into(currencyImage)
                ticker.setImageResource(
                    if (model.tickerState) {
                        R.drawable.baseline_arrow_drop_up_24
                    } else {
                        R.drawable.baseline_arrow_drop_down_24
                    }
                )
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = CryptoListItemBinding.inflate(LayoutInflater.from(parent.context))
        return Holder(binding, binding.root)
    }

    override fun getItemCount(): Int = cryptoList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(cryptoList[position])
    }

}