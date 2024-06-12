#language:  es
Característica:  yo como usuario de  Senda Medico deseo Registrar un Accidente de Trabajo


  @RadicarAT
    Escenario:  registro exitoso de un Accidente de Trabajo
    Dado    que el usuario realiza el login exitoso
    Y       da clic en el boton RadicarAT
    Y       busca el ID del Afiliado
    Y       da clic en el resuldado de la busqueda de Afiliado
    Cuando  guardamos los datos del formulario diligenciado
    Y       el cliente confirma que desea guardar la infomacion
       #   |<Numero AT>|<Digito V>|<Fecha Rad>|<Hora Rad>|<Fecha Acc>|<Hora Acc>|<Sucursal>|<T Reporte>|<Proviene>|
     Entonces se registra el Accidente de trabajo exitosamente
   # Ejemplos:
    #  |Numero AT|Digito V|Fecha Rad|Hora Rad|Fecha Acc|Hora Acc|Sucursal|T Reporte|Proviene|



  @RadicarAT2.1
  Esquema del escenario: registro exitoso de un Accidente de Trabajo
    Dado que el <usuario> ingresa <contrasena> realiza el login exitoso
    Y da clic en el boton RadicarAT
    Y       busca el <ID> del Afiliado
    Y da clic en el resuldado de la busqueda de Afiliado
    Cuando guardamos los datos del formulario diligenciado <Numero_AT>, <Digito_V>, <Fecha_rad>,<Fecha_Acc>

    Y el cliente confirma que desea guardar la infomacion
    Entonces se registra el Accidente de trabajo exitosamente

    Ejemplos:

    |usuario|       contrasena   |ID|       Numero_AT| Digito_V|Fecha_rad| Fecha_Acc|
    ##@externaldata@./src/test/resources/data/DataFile.xlsx@RadicarAT@1-5
   |false   |falso123   |3599397   |89990221   |2   |/07082022   |/07082022|
   |PRUUSR21029   |Colmena01+   |3599397   |89990222   |3   |/07082022   |/07082022|
   |PRUUSR21029   |Colmena01+   |3599397   |89990223   |4   |/07082022   |/07082022|
   |PRUUSR21029   |Colmena01+   |3599397   |89990224   |5   |/07082022   |/07082022|
   |PRUUSR21029   |Colmena01+   |3599397   |89990225   |1   |/07082022   |/07082022|


   


