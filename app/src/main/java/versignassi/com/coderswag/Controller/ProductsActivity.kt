package versignassi.com.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_products.*
import versignassi.com.coderswag.Adapters.ProductsAdapter
import versignassi.com.coderswag.R
import versignassi.com.coderswag.Services.DataService
import versignassi.com.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

        adapter = ProductsAdapter(this, DataService.getProducts(categoryType))

        val layoutManager = GridLayoutManager(this,2)
        productListView.layoutManager = layoutManager
        productListView.adapter = adapter
    }
}
