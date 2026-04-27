#language: es
Característica: Inicio de sesion

  @inicioSesionExitosa
  Escenario: Inicio de sesion exitoso
    Dado que el usuario esta en la pagina de login
    Cuando ingresa un documento y clave valido
    Entonces accede al panel principal

  @inicioSesionInvalido
  Escenario: Inicio de sesión fallido con credenciales incorrectas
    Dado que el usuario está en la pagina de login
    Cuando ingresa un documento y clave invalido
    Entonces se visualiza mensaje de error