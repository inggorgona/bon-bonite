#language: es

Característica: Aplicación de bono de regalo

  Escenario: Aplicacion exitosa de bono
    Dado que el usuario tiene un producto en el carrito
    Cuando ingresa un codigo de bono valido
    Y aplica el bono
    Entonces deberia ver el descuento reflejado en el total