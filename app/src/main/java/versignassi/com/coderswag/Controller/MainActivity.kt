package versignassi.com.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import versignassi.com.coderswag.Adapters.CategoryAdapter
import versignassi.com.coderswag.Adapters.CategoryRecycleAdapter
import versignassi.com.coderswag.Model.Category
import versignassi.com.coderswag.R
import versignassi.com.coderswag.Services.DataService

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryRecycleAdapter(this,
            DataService.categories)
        categoryListView.adapter = adapter

        //only to recycleView without this block the view will be empty
        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

    }
}
