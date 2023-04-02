package com.appninjas.cryptoandstocks.presentation.screens.crypto

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.appninjas.cryptoandstocks.databinding.FragmentCryptoBinding
import com.appninjas.cryptoandstocks.domain.model.Crypto
import com.appninjas.cryptoandstocks.presentation.adapters.CryptoAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class CryptoFragment : Fragment() {

    private lateinit var binding: FragmentCryptoBinding
    private val viewModel by viewModel<CryptoViewModel>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentCryptoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initCryptoList()
    }

    private fun initCryptoList() {
        viewModel.getCourses()
        viewModel.cryptoCourse.observe(viewLifecycleOwner) { cryptoList ->
            val rvAdapter = CryptoAdapter(cryptoList)
            binding.cryptoRecyclerView.apply {
                adapter = rvAdapter
                layoutManager = LinearLayoutManager(context)
            }
        }
    }

}