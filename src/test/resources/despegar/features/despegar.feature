Feature: Escoger un vuelo en despegar.com
  Luis como estudiante del curso de pruebas de software
  Necesita escoger un vuelo en despegar.com
  Para aprender sobre automatization y el patron ScreenPlay


  Background: Acceso al sitio web despegar.com
    Given "Andres" desea ir a la pagina de despegar

  Scenario Outline: Buscar un vuelo ida y vuelta de forma exitosa
    When Ingresa la informacion de busqueda del vuelo <origen> y <destino>
    Then se valida el mensaje <mensaje>
    Examples:
      | origen   | destino     | mensaje            |
      | "Bogota" | "Cartagena" | "¿Quiénes viajan?" |