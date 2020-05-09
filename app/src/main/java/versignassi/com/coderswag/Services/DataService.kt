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
        Product("Boné bonito","$15", image = "hat01"),
        Product("Boné bonito vermelho","$12", image = "hat02"),
        Product("Boné bonito preto","$16", image = "hat03"),
        Product("Boné bonito branco","$10", image = "hat04")
    )

    val hoodies = listOf(
        Product("Deveslopes Hoodie Gray", "$28", "hoodie01"),
        Product("Deveslopes Hoodie ", "$28", "hoodie02"),
        Product("Deveslopes Gray Hoodie ", "$28", "hoodie03"),
        Product("Deveslopes Red Hoodie", "$28", "hoodie04")
    )

    val shirts = listOf(
        Product("Deveslopes Shirt Gray", "$28", "shirt01"),
        Product("Deveslopes Shirt ", "$28", "shirt02"),
        Product("Deveslopes Logo shirt  ", "$28", "shirt03"),
        Product("Deveslopes Hustles", "$28", "shirt04"),
        Product("Kickflip Studios", "$18", "shirt05")
    )
}