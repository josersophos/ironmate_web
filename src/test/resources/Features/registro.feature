Feature: Agregar un nuevo registro

  Scenario: Agregar un nuevo registro
    Given El cliente debe estar en la pagina principal de demoqa
      | strUrl              |
      ##@externaldata@./src/test/resources/data/Testdata.xlsx@url@1
   |https://demoqa.com/|

    When ingresar datos del usuario
      | strNombre    | strApellido      | strEmail                   | strEdad | strSalario | strDepartamento |
       ##@externaldata@./src/test/resources/data/Testdata.xlsx@data@1


    Then se visualiza que quede ingresado el registro
      | strEmail                   |
      ##@externaldata@./src/test/resources/data/Testdata.xlsx@Validate@1
   |Jesus.Goyeneche@sophos.com|




