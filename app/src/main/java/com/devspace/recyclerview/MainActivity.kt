package com.devspace.recyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Data Class (OK)
        //Create list from data class type (OK)
        //Create Adapter (OK)
        //Set Adapter (OK)
        //Linear layout manager (OK)
        //Submeter a lista ao adapter (OK)

        val rvList = findViewById<RecyclerView>(R.id.rv_list)
        val ivList = findViewById<ImageView>(R.id.iv_list)
        val ivGrid = findViewById<ImageView>(R.id.iv_grid)

        val adapter = ContactListAdapter()
        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
        adapter.submitList(contacts)

        ivGrid.setOnClickListener {
            rvList.layoutManager = GridLayoutManager(this, 2)
        }

        ivList.setOnClickListener {
            rvList.layoutManager = LinearLayoutManager(this)
        }

        adapter.setOnClickListener { contact ->

            val intent = Intent(this, ContactDetail::class.java)
            intent.putExtra("name", contact.name)
            intent.putExtra("phone", contact.phone)
            intent.putExtra("icon", contact.icon)

            startActivity(intent)

        }
    }
}

val contacts = listOf(
    Contact(
        "Raissa",
        "(11) 7689-4534",
        R.drawable.sample4
    ),
    Contact(
        "Naomi",
        "(19) 9087-9090",
        R.drawable.sample3
    ),
    Contact(
        "Wesley",
        "(11) 3421-2877",
        R.drawable.sample2
    ),
    Contact(
        "Maya",
        "(13) 8654-5432",
        R.drawable.sample1
    ),
    Contact(
        "Lais",
        "(64) 6575-3567",
        R.drawable.sample5
    ),
    Contact(
        "Aya",
        "(19) 99784-6164",
        R.drawable.sample6
    ),
    Contact(
        "Luna",
        "(19) 5664-7859",
        R.drawable.sample7
    ),
    Contact(
        "Lucca",
        "(19) 8799-4567",
        R.drawable.sample8
    ),
    Contact(
        "Tae",
        "(19) 1231-1321",
        R.drawable.sample9
    ),
    Contact(
        "Bruno",
        "(19) 9875-8178",
        R.drawable.sample10
    ),
    Contact(
        "Danielle",
        "(19) 8318-1882",
        R.drawable.sample11
    ),
    Contact(
        "Eren",
        "(19) 5243-6324",
        R.drawable.sample12
    ),
    Contact(
        "Mikasa",
        "(19) 9234-5654",
        R.drawable.sample13
    ),
    Contact(
        "Armin",
        "(19) 5325-6356",
        R.drawable.sample14
    ),
    Contact(
        "Katia",
        "(19) 9467-6004",
        R.drawable.sample15
    ),
    Contact(
        "Anne",
        "(19) 3245-0677",
        R.drawable.sample16
    ),
)