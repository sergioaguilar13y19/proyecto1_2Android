package com.example.proyecto_1_2

class Bodega {
    val products: MutableList<Product> = mutableListOf()

    fun addProduct(article: Product, cantidad: Int = article.stock) {
        if (article.name == "") {
            println("Ingrese un nombre valido")
            return
        }
        products.forEach {
            if (it.name == article.name) {
                it.stock += cantidad
                return
            }
        }
       /*if (products.contains(article)) {
            article.stock += cantidad
            println("Nuevo stock ${article.stock} ${article.name}")
            return
        }*/
        products.add(Product(article.name,article.price,cantidad))
        //article.stock = cantidad
        println("producto agregado ${article.name}, ${article.stock} ${article.price}")
    }

    fun getProduct(): String {
        var name = ""
        products.forEach {
            name = name + it.stock +" "+ it.name +  "."
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

    fun deleteProduct(article: Product, cantidad: Int= article.stock ) {
       /* if (!products.contains(product)) {
            return println("El producto ${product.name} no fue encontrado")
        }*/
        products.forEach {
            if (it.name == article.name) {
                it.stock -= cantidad
                return
            }
        }
        article.stock -= cantidad
        println("El producto ${article.name} ha sido vendido")
        println("Stock actualizado = ${article.stock} ${article.name}")
    }
}