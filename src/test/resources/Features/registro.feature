Feature: Agregar un nuevo registro

  Scenario Outline: Agregar un nuevo registro
    Given El cliente debe estar en la pagina principal de demoqa
      | strUrl              |
      ##@externaldata@./src/test/resources/data/Testdata.xlsx@url@1
  

    When ingresar datos del usuario
      | strNombre | strApellido | strEmail | strEdad | strSalario | strDepartamento |
      | <Nombre>  | <Apellido>  | <Email>  | <Edad>  | <Salario>  | <Departamento>  |

    Then se visualiza que quede ingresado el registro
      | strEmail |
      | <Email>  |

    Examples:
      | Nombre        | Apellido       | Email                     | Edad | Salario | Departamento |
      ##@externaldata@./src/test/resources/data/Testdata.xlsx@data
      






