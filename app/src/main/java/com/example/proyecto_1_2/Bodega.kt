package com.example.proyecto_1_2

class Bodega {
    val products: MutableList<Product> = mutableListOf()

    fun addProduct(product: Product, cantidad: Int) {
        if (product.name == "") {
            println("Ingrese un nombre valido")
            return
        }
        if (products.contains(product)) {
            product.stock += cantidad
            println("Nuevo stock ${product.stock} ${product.name}")
            return
        }
        products.add(product)
        product.stock = cantidad
        println("producto agregado ${product.name}, ${product.stock} ${product.price}")
    }

    fun getProduct(): String {
        var name = ""
        products.forEach {
            name = name + it.name + "."
        }

        return name
    }

    fun getStock(): Number {
        var stock = 0
        products.forEach {
           stock = stock + it.stock
        }
        println("es este $stock")
        return stock
    }

    fun deleteProduct(product: Product, cantidad: Int) {
        if (!products.contains(product)) {
            return println("El producto ${product.name} no fue encontrado")
        }
        product.stock -= cantidad
        println("El producto ${product.name} ha sido vendido")
        println("Stock actualizado = ${product.stock} ${product.name}")
    }
}