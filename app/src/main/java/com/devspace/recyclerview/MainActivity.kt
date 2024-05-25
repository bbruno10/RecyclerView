package com.devspace.recyclerview

import android.annotation.SuppressLint
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
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvList = findViewById<RecyclerView>(R.id.rv_list)
        val ivGrid = findViewById<ImageView>(R.id.iv_grid)
        val ivList = findViewById<ImageView>(R.id.iv_list)
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
    }
}

val contacts = listOf(
    Contact(
        "James",
        "(55) 9784-6164",
        R.drawable.sample5
    ),

    Contact(
        "William",
        "(55) 9344-6164",
        R.drawable.sample12
    ),

    Contact(
        "Lucca",
        "(55) 9684-1664",
        R.drawable.sample2
    ),

    Contact(
        "John",
        "(55) 8743-1234",
        R.drawable.sample1
    ),

    Contact(
        "Bruna",
        "(55) 1234-8765",
        R.drawable.sample3
    ),

    Contact(
        "Bruna",
        "(55) 9784-6164",
        R.drawable.sample7
    ),

    Contact(
        "Danielle",
        "(55) 9784-6164",
        R.drawable.sample4
    ),

    Contact(
        "Eduardo",
        "(55) 9784-6164",
        R.drawable.sample8
    ),

    Contact(
        "Bia",
        "(55) 9784-6164",
        R.drawable.sample9
    ),

    Contact(
        "Lucas",
        "(55) 9784-6164",
        R.drawable.sample10
    ),

    Contact(
        "Katia",
        "(55) 9784-6164",
        R.drawable.sample11
    ),

    Contact(
        "Henzo",
        "(55) 9784-6164",
        R.drawable.sample13
    ),
)