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
        bodega.addProduct(product,cantidad)
    }
    fun venderProducto(product: Product, cantidad: Int) {
        if (cantidad > product.stock || product.stock == 0 || cantidad < 0) {
            println("producto insuficiente para ser vendido")
            return
        }
        bodega.deleteProduct(product, cantidad)
        vendidos += cantidad
        dineroTotal += (product.price * cantidad)
    }
}