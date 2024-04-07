package com.example.proyecto_1_2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyecto_1_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var television = Product("television", 6500.05, 0)
        var licuadora = Product("licuadora", 2500.05, 0)
        var refrigerador = Product("refrigerador", 5500.00, 0)

        var negocio1 = Empleado(123, "Sergio")
        var negocio2 = Empleado(456, "Antonio")
        var negocio3 = Empleado(789, "Beatriz")

        negocio1.cargarStock(television, 90)
        negocio2.cargarStock(licuadora, 90)
        negocio3.cargarStock(refrigerador, 90)

        //dia 1
        negocio2.venderProducto(licuadora, 15)
        //dia 2
        negocio3.cargarStock(refrigerador, 10)
        //dia 3
        negocio1.venderProducto(television, 5)
        //dia 4
        negocio1.cargarStock(television, 1)
        //dia 5
        negocio2.venderProducto(licuadora, 10)
        //dia 6
        negocio3.venderProducto(refrigerador, 10)
        //dia 7
        negocio2.cargarStock(licuadora, 10)
        //dia 8
        negocio1.cargarStock(refrigerador, 5)
        negocio3.venderProducto(refrigerador, 5)
        //dia 9
        negocio2.cargarStock(television, 7)
        negocio1.venderProducto(television, 7)
        //println("compro al negocio1")
        //negocio2.cargarStock(refrigerador,7)
        negocio3.venderProducto(refrigerador, 7)
    }
}