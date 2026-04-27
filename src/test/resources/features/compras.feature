#language:es
Característica: Compra de productos

  Antecedentes:
    Dado que el usuario esta en la pagina de login
    Cuando ingresa un documento y clave valido

  Escenario: Compra exitosa de un producto
    Cuando selecciona y agregue el producto al carito de compra
    Y llene la la informacion del detalle de factura
    Entonces se visualizara mensaje de finalizacion de compra