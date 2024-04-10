package com.example.proyecto_1_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyecto_1_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var television = Product("television", 500.00, 20)
        var licuadora = Product("licuadora", 200.00, 40)
        var refrigerador = Product("refrigerador", 600.00, 20)

        var negocio1 = Empleado(123, "Sergio")
        var negocio2 = Empleado(456, "Antonio")
        var negocio3 = Empleado(789, "Beatriz")

        negocio1.cargarStock(Product("television", 500.00, 20))
        negocio2.cargarStock(Product("licuadora", 200.00, 40))
        negocio3.cargarStock(Product("refrigerador", 600.00, 20))

        //dia 1
        //negocio2.venderProducto(Product("licuadora", 200.00, 40),15)
        //dia 2
        //negocio3.cargarStock(Product("refrigerador", 600.00, 20), 10)
        //dia 3
        //negocio1.venderProducto(Product("television", 500.00, 20), 5)
        //dia 4
        //negocio1.cargarStock(Product("television", 500.00, 20), 1)
        //dia 5
        //negocio2.venderProducto(Product("licuadora", 200.00, 40), 10)
        //dia 6
        //negocio3.venderProducto(Product("refrigerador", 600.00, 20), 10)
        //dia 7
        //negocio2.cargarStock(Product("licuadora", 200.00, 40), 10)
        //dia 8
        //negocio3.venderProducto(Product("refrigerador", 600.00, 20), 5)
        //negocio1.cargarStock(Product("refrigerador", 600.00, 20), 5)

        //dia 9
            //negocio2.cargarStock(television, 7)
            //negocio1.venderProducto(television, 7)
        //negocio2.cargarStock(Product("refrigerador", 600.00, 20),7)
        //negocio3.venderProducto(Product("refrigerador", 600.00, 20), 7)

        //dia 10
        //negocio1.venderProducto(Product("refrigerador", 600.00, 20),5)
        //negocio2.venderProducto(Product("refrigerador", 600.00, 20),5)
        //negocio3.venderProducto(Product("refrigerador", 600.00, 20),5)

        binding.tvName.text = "Negocio 1"
        binding.tvProduct.text = negocio1.bodega.getProduct()
        binding.tvStock.text = negocio1.bodega.getStock().toString()
        binding.tvCorte.text = negocio1.dineroTotal.toString()
        binding.tvProductV1.text = negocio1.vendidos.toString()

        //
        binding.tvName2.text = "Negocio 2"
        binding.tvProduct2.text = negocio2.bodega.getProduct()
        binding.tvStock2.text = negocio2.bodega.getStock().toString()
        binding.tvCorte2.text = negocio2.dineroTotal.toString()
        binding.tvProductV2.text = negocio2.vendidos.toString()
        //
        binding.tvName3.text = "Negocio 3"
        binding.tvProduct3.text = negocio3.bodega.getProduct()
        binding.tvStock3.text = negocio3.bodega.getStock().toString()
        binding.tvCorte3.text = negocio3.dineroTotal.toString()
        binding.tvProductV3.text = negocio3.vendidos.toString()
    }
}