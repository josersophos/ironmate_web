Feature: Agregar un nuevo registro

#  Scenario Outline: Agregar un nuevo registro
#    Given El cliente debe estar en la pagina principal de demoqa
#      | strUrl              |
#      ##@externaldata@./src/test/resources/data/Testdata.xlsx@url@1
#   |https://demoqa.com/|
#
#    When ingresar datos del usuario
#      | strNombre | strApellido | strEmail | strEdad | strSalario | strDepartamento |
#     #@externaldata@./src/test/resources/data/Testdata.xlsx@data@1
#      | <Nombre>  | <Apellido>  | <Email>  | <Edad>  | <Salario>  | <Departamento>  |
#
#    Then se visualiza que quede ingresado el registro
#      | strEmail |
#     ##@externaldata@./src/test/resources/data/Testdata.xlsx@Validate@1
#   |andres.uruburu@sophos.com|
#
#    Examples:
#      | Nombre        | Apellido       | Email                     | Edad | Salario | Departamento |
#      #@externaldata@./src/test/resources/data/Testdata.xlsx@data@1
#      | Andres Felipe | Uruburu Berrio | andres.uruburu@sophos.com | 27   | 4000000 | QA           |
#      | Sara          | Alvarez        | sara@sophos.com           | 32   | 4100000 | Dev          |
#
