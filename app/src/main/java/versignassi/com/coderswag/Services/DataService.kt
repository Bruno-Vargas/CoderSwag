package versignassi.com.coderswag.Services

import versignassi.com.coderswag.Model.Category
import versignassi.com.coderswag.Model.Product

//will implement
object DataService {
    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )
    val hats = listOf(
        Product("Boné bonito","$15", image = "hat1"),
        Product("Boné bonito vermelho","$12", image = "hat2"),
        Product("Boné bonito preto","$16", image = "hat3"),
        Product("Boné bonito branco","$10", image = "hat4")
    )

    val hoodies = listOf(
        Product("Deveslopes Hoodie Gray", "$28", "hoodie1"),
        Product("Deveslopes Hoodie ", "$28", "hoodie2"),
        Product("Deveslopes Gray Hoodie ", "$28", "hoodie3"),
        Product("Deveslopes Red Hoodie", "$28", "hoodie4")
    )

    val shirts = listOf(
        Product("Deveslopes Shirt Gray", "$28", "shirt1"),
        Product("Deveslopes Shirt ", "$28", "shirt2"),
        Product("Deveslopes Logo shirt  ", "$28", "shirt3"),
        Product("Deveslopes Hustles", "$28", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        when (category){
            "SHIRTS" -> return shirts
            "HATS" -> return hats
            "HOODIES" -> return hoodies
            else -> return digitalGood

        }
    }


}