import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val productos = mutableListOf<Producto>()



    while (true){
        println("""
            Menu disponible
            1->Crear Producto
            2->Vender Producto
            3->Reponer Stock
            4->Aplicar Descuento
            5->Mostar Informacion De Producto
            6->Aumentar Precio
            7->Valor Total En Inventario
            8->Eliminar Producto
        """.trimIndent())
        val opcion= readln().toInt()
        when(opcion){
            1->{

                print("Ingrese código del producto: ")
                val codigo = readln()
                print("Ingrese nombre del producto: ")
                val nombre = readln()
                print("Ingrese precio del producto: ")
                val precio = readln().toInt()
                print("Ingrese cantidad en stock: ")
                val stock = readln().toInt()

                // Se crea un nuevo producto
                productos.add(Producto(codigo, nombre, precio, stock))
                println(" Producto creado exitosamente.")
            }
            2->{
                print("Ingrese el código del producto a vender: ")
                val codigoVenta = readln()

                // Buscar el producto en la lista
                val producto = productos.find { it.getCodigo() == codigoVenta }
                if (producto != null) {
                    producto.VenderProducto()
                } else {
                    println(" Producto no encontrado en el inventario.")
                }
            }
            3->{
                print("Ingrese el código del producto a reponer: ")
                val codigoReponer = readln()
                val producto = productos.find { it.getCodigo() == codigoReponer }
                if (producto != null) {
                    print("Ingrese la cantidad a reponer: ")
                    val cantidad = readln().toInt()
                    producto.ReponerProducto(cantidad)
                } else {
                    println(" Producto no encontrado en el inventario.")
                }
            }
            4->{
                print("Ingrese el código del producto para aplicar descuento: ")
                val codigoDescuento = readln()
                val producto = productos.find { it.getCodigo() == codigoDescuento }
                if (producto != null) {
                    producto.AplicarDescuento()
                } else {
                    println(" Producto no encontrado en el inventario.")
                }

            }
            5->{
                if (productos.isEmpty()) {
                    println("No hay productos en el inventario.")
                } else {
                    println("Lista de productos en inventario:")
                    productos.forEach { it.MostrarInformacion() }
                }

            }
            6->{
                print("Ingrese el código del producto para aumentar precio: ")
                val codigoAumento = readln()
                val producto = productos.find { it.getCodigo() == codigoAumento }
                if (producto != null) {
                    producto.AumentarPrecio()
                } else {
                    println("Producto no encontrado en el inventario.")
                }



            }
            7->{
                val valorTotal = productos.sumOf { it.CalcularTotalInventario() }
                println(" Valor total del inventario: $valorTotal")
            }
            8->{
                print("Ingrese el código del producto a eliminar: ")
                val codigoEliminar = readln()
                val producto = productos.find { it.getCodigo() == codigoEliminar }
                if (producto != null) {
                    productos.remove(producto)
                    println("Producto eliminado del inventario.")
                } else {
                    println("roducto no encontrado.")
                }
            }
            9->{
                println("Salir del sistema...")
            }
            else -> println(" Opción no válida. Intente de nuevo.")

        }
    }







}