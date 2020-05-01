# pattern-adapter

## La era Tesla
Tenemos un sistema que trabaja con diferentes tipos de motores (Común, Económico) que comparten características comunes así como su funcionamiento, se desea vincular al sistema una clase de tipo motor Eléctrico con un funcionamiento diferente al de los demás, se debe adaptar la nueva clase sin que esto afecte la lógica inicial de la aplicación...

Deducimos que si bien es un motor no puede tener un tratamiento igual al de los demás, ya que el modo de encenderlo, ponerlo en funcionamiento y hasta apagarlo podría ser muy distinto y podría afectar la lógica establecida.
