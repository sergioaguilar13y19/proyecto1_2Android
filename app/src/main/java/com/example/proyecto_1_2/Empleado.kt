package com.example.proyecto_1_2

class Empleado(val DNI: Int, val nombre: String) {
    var salario = 0
    val peridoPago = "mensual"
    var area = ""
    var edad = 0

    var bodega = Bodega()
    var vendidos = 0
    var dineroTotal = 0.0
    fun cargarStock(article: Product, cantidad: Int = article.stock) {
        bodega.addProduct(article,cantidad)
    }
    fun venderProducto(article: Product, cantidad: Int = article.stock ) {
        if (cantidad > article.stock || article.stock == 0 || cantidad < 0) {
            println("producto insuficiente para ser vendido")
            return
        }
        bodega.deleteProduct(article, cantidad)
        vendidos += cantidad
        dineroTotal += (article.price * cantidad)
    }
}