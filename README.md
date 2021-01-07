# MundoPC
El objetivo de este ejercicio es crear objetos de tipo computadora. Cada objeto computadora se compone de 3 objetos más, que son Monitor, Teclado y Ratón. Y a su vez los objetos Teclado y Ratón descienden de la clase DispositivoEntrada, la cual abstrae varias características, las cuales heredan directamente las clases Teclado y Ratón. Finalmente la clase Orden contiene un arreglo de computadoras como parte de sus atributos, y será la encargada de ir agregando cada computadora al arreglo de computadoras. La clase MundoPC será la encargada de crear los objetos respectivos para formar tanto los objetos Computadora e irlos agregando a un objeto Orden.
Algunos de los conceptos que se ponen en prectica:
- Herencia y llamadas a constructores padre por medio de la palabra super.
- Uso de atributos estáticos, con el objetivo de tener un contador que nos proporcione id únicos para cada objeto creado, para los objetos:
Orden, Computadora, Monitor, Ratón y Teclado.
- Encapsulamiento de atributos en cada clase.
- Constructores privados llamados desde otros constructores por medio de la palabra this
- Paso de parámetros por referencia en el método agregarComputadora de la clase Orden
- Uso del método toString, y dentro de este método super.toString() para complementar la información heredada de la clase padre
- Uso de paquetes
- Uso de arreglos que almacenan tipos Object
- Entre varios temas más.
