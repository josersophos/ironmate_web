Feature: Agregar un nuevo registro

  Scenario Outline: Agregar un nuevo registro
    Given El cliente debe estar en la pagina principal de demoqa
      | strUrl              |
      ##@externaldata@./src/test/resources/data/Testdata.xlsx@url@1
   |https://demoqa.com/|

    When ingresar datos del usuario
      | strNombre | strApellido | strEmail | strEdad | strSalario | strDepartamento |
      | <Nombre>  | <Apellido>  | <Email>  | <Edad>  | <Salario>  | <Departamento>  |

    Then se visualiza que quede ingresado el registro
      | strEmail |
      | <Email>  |

    Examples:
      | Nombre        | Apellido       | Email                     | Edad | Salario | Departamento |
      ##@externaldata@./src/test/resources/data/Testdata.xlsx@data
   |Andres Felipe   |Uruburu Berrio   |andres.uruburu@sophos.com   |27   |4000000   |QA|
   |Sara   |Alvarez   |sara@sophos.com   |32   |4100000   |Dev|
   |Laura   |Neira   |laura.neira@sophos.com   |24   |5000000   |Dev|





