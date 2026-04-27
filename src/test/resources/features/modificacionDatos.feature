#language:es
Característica: Actualizacion de datos del usuario

  Escenario: Actualizacion de datos exitosa
    Dado que el usuario ha iniciado sesión
    Y accede a su cuenta
    Cuando modifica sus datos personales
    Y guarda los cambios
    Entonces deberia ver un mensaje de confirmacion
    Y los datos deberian actualizarse correctamente