package versignassi.com.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import versignassi.com.coderswag.Adapters.CategoryAdapter
import versignassi.com.coderswag.Model.Category
import versignassi.com.coderswag.R
import versignassi.com.coderswag.Services.DataService

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryAdapter(this,
            DataService.categories)
        categoryListView.adapter = adapter
    }
}
