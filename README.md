# pattern-adapter

## La era Tesla

En la consecionaria tenemos un sistema que trabaja con diferentes tipos de motores (Común, Económico) que comparten características comunes así como su funcionamiento, esto permite a los clientes realizar un test drive de un vehiculo en especifico. 

Desde California, Estados unidos. Tesla, Inc. nos envía su nuevo motor eléctrico para modernizar nuestros vehículos.
Deducimos que si bien es un motor no puede tener un tratamiento igual al de los demás, ya que el modo de encenderlo, ponerlo en funcionamiento y hasta apagarlo podría ser muy distinto y podría afectar la lógica establecida.

Se desea vincular al sistema una clase de tipo motor Eléctrico con un funcionamiento diferente al de los demás, se debe adaptar la nueva clase sin que esto afecte la lógica inicial de la aplicación...

**IMPORTANTE**

El motor llega  ya ensamblado de fabrica, por lo cual, no podemos modificarlo ya que esto afecta la garantia del mismo.
