package com.example.proyecto_1_2

class Empleado(val DNI: Int, val nombre: String) {
    var salario = 0
    val peridoPago = "mensual"
    var area = ""
    var edad = 0

    var bodega = Bodega()
    var vendidos = 0
    var dineroTotal = 0.0
    fun cargarStock(product: Product, cantidad: Int) {
        bodega.addProduct(product, cantidad)
    }

    fun venderProducto(product: Product, cantidad: Int) {
        if (cantidad > product.stock || product.stock == 0) {
            println("producto insuficiente para ser vendido")
        } else {
            bodega.deleteProduct(product, cantidad)
            dineroTotal = dineroTotal + (product.price * cantidad)
        }
        // dineroObtenido(product)

    }

    private fun dineroObtenido(product: Product) {
        val total = product.price * product.stock
        dineroTotal = total
    }

    fun corteCaja() {
        println("Dinero total obtenido $dineroTotal")
    }
}