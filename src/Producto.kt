class Producto {
    //codigo, nombre del producto, precioProducto, cantidadStock
    //Metodos Crear producto.Vender producto. ReponerStock. AplicarDesctuento. MostarInformacion del producto. Aumentar precio 6%. calcular valor total en inventario multiplica stock*disponibles. Elimina productos por codigo
    private var codigo:String=""
    private var nombreProducto:String=""
    private var precioProducto:Int=0
    private var cantidadStock=0

    constructor()

    constructor(codigo: String, nombreProducto: String, precioProducto: Int, cantidadStock: Int) {
        this.codigo = codigo
        this.nombreProducto = nombreProducto
        this.precioProducto = precioProducto
        this.cantidadStock = cantidadStock
    }


    public fun CrearProducto(){
        this.codigo=codigo
        this.nombreProducto= nombreProducto
        this.precioProducto=precioProducto
        this.cantidadStock=cantidadStock
    }


    public fun VenderProducto(){

        if(this.cantidadStock>1){
            var precioVenta = this.precioProducto
            this.cantidadStock-=1
            println("La cantidad Disponible es de ${cantidadStock} y el precio de venta es ${precioVenta}")
        }
        else("No hay cantidad disponible")
    }
    public fun ReponerProducto(cant:Int){
        if (cant > 0) {
            cantidadStock += cant
            println("Se han añadido $cant unidades. Nuevo stock: $cantidadStock")
        } else {
            println("Cantidad inválida para reponer.")
        }
    }
    public fun AplicarDescuento(){
        this.precioProducto = precioProducto-((precioProducto*2)/100)
    }

    public fun MostrarInformacion(){
        this.codigo=codigo
        println(codigo)
        this.nombreProducto=nombreProducto
        println(nombreProducto)
        this.precioProducto=precioProducto
        println(precioProducto)
        this.cantidadStock=cantidadStock
        println(cantidadStock)
    }

    public fun AumentarPrecio(){
        this.precioProducto = precioProducto+((precioProducto*6)/100)
    }
    public fun CalcularTotalInventario():Int{
        return this.cantidadStock * this.precioProducto
    }
    public fun EliminarProducto(){

        codigo = ""
        nombreProducto = ""
        precioProducto = 0
        cantidadStock = 0
        println("Producto eliminado del inventario.")
    }
    fun getCodigo(): String {
        return codigo
    }
}


