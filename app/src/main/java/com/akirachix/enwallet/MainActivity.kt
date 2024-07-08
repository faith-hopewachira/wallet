package com.akirachix.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvWallets.layoutManager = LinearLayoutManager(this)
        displayWallets()

    }
        fun displayWallets(){
            val wallet1= Wallet("Salary","40000","1 July 2024")
            val wallet2= Wallet("Rent","16000","2 July 2024")
            val wallet3= Wallet("Dividends","2400","4 July 2024")
            val wallet4= Wallet("Electricity","800","5 July 2024")
            val wallet5= Wallet("Internet","2500","5 July 2024")
            val wallet6= Wallet("Shopping","3500","6 July 2024")
            val wallet7= Wallet("Food","4000","7 July 2024")
            val wallet8= Wallet("Leisure","3000","7 July 2024")
            val wallet9= Wallet("Water","2000","8 July 2024")
            val wallet10= Wallet("Savings","3000","9 July 2024")

            val myWallets = listOf(wallet1,wallet2,wallet3,wallet4,wallet5,wallet6,wallet7,wallet8,wallet9,wallet10)

            val walletAdapter= WalletAdapter(myWallets)
            binding.rvWallets.adapter = walletAdapter


        }
}