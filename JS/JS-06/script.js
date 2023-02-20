
/*Que encontramos en el árbol de DOM?

-Nodes: Es la unidad más básica dentro del documento. Puede ser una etiqueta, un texto dentro de una etiqueta o un comentario, etc.

<title> NODO
Manipulacion DOM// Es un nodo, pero es hijo del title
</title>

-Document: También es un nodo, del tipo documento, en el nodo raíz a partir del cual se desarrollan o generan todos los demas nodos.

-Element: son todos aquellos definidos por etiquetas <div>, <img>, <h1>, <p>

-Attributes: Nodos que dan información asociada al tipo de elemento

-Comentario: Comentarios y otros elementos que estan dentro del HTML,  son considerados nodos.



*Cómo leer nodos de mi Document Object Model (DOM)

Métodos tradicionales (que se usan en versiones antiguas de JS)

-document.getElementById (botonSuma)
-document.getElementByTagName (<button>)
-document.getElementByClaasName (botones)

*/

// var elemento = document.getElementById("botonSuma");
// console.log(elementoId);

// var elementoEtiqueta = document.getElementsByTagName("button");
// console.log(elementoEtiqueta);
// console.log("Este es el primer elemento de mi coleccion de botones", elementoEtiqueta[0])

// var elementoClassName = document.getElementsByClassName("botones");
// console.log(elementoClassName);


// // Metodos recientes

// // -document.querySelector(#botonSuma)
// // -document.querySelectorAll(.botones)

// var unElemento = document.querySelector("#input1");
// console.log(unElemento);

// var variosElementos = document.querySelectorAll(".botones");
// console.log(variosElementos);



/*Creacion de nodos 

-document.createElement(tipoNodo)
*/

//Creacion de una etiqueta del tipo imagen
var imagenPerrito = document.createElement("img");

//Creamos atributos a la etiqueta
imagenPerrito.src = "https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg";
imagenPerrito.alt = "Imagen de perrito tierno";
imagenPerrito.style.width = "150px";
imagenPerrito.style.borderRadius = "100px";



//Para poner/insertar los elementos o nodos en el html se usa append
document.body.append(imagenPerrito);

//Para actualizar nodos se puede de 2 formas, una es:
//1er paso: identificar el nodo que quiero cambiar (outer)
//2do paso; Modificar el nodo (inner)

//Y la otra, que es la que aplicamos:
//Identificar el nodo con un metodo para tomarlo (getElement o QuerySelector y modificarlo con inner.HTML)

var resultadoQuecambia = document.getElementById("resultado");

resultadoQuecambia.innerHTML = "Saludos, cambie el texto juas juas";




// Construir nuestra calculadora

var input1 = document.getElementById("input1");
var input2 = document.getElementById("input2");

var botonSuma = document.getElementById("botonSuma");
var botonResta = document.getElementById("botonResta");
var botonMultiplicacion = document.getElementById("botonMultiplicacion");
var botonDivision = document.getElementById("botonDivision");

var resultado = document.getElementById("resultado")

//Construimos las funciones de nuestra calculadora
function suma() {
    let valor1 = parseInt(input1.value); //pido numero 1
    let valor2 = parseInt(input2.value); //pido num 2. NOTA: es importantes poner el value porque es la propiedad que se estrae del elemento input2
    let suma = valor1 + valor2; //calculo la suma
    resultado.innerHTML = suma; //pongo el resultado en su lugar
}

function resta() {
    let valor1 = parseInt(input1.value);
    let valor2 = parseInt(input2.value);
    let resta = valor1 - valor2;
    resultado.innerHTML = resta;

}

function multiplicacion() {
    let valor1 = parseInt(input1.value);
    let valor2 = parseInt(input2.value);
    let multiplicacion = valor1 * valor2;
    resultado.innerHTML = multiplicacion;

}

function division() {
    let valor1 = parseInt(input1.value);
    let valor2 = parseInt(input2.value);
    let division = valor1 / valor2;
    resultado.innerHTML = division;

}

/*Cómo se crea un evento (addEventListener)
Sintaxis:
-node.addEvenListener ("evento a escuchar", lo que quiero que haga cuando se escuche)

   -node(nodo donde aterrizo el evento)
   -addEventListener(palabra reservada para usar el evento)
   -evento a escuchar (click, mouseover, etc)
   -Lo que quiero que haga (la llamada de la funcion)

*/

botonSuma.addEventListener("click", suma);
botonResta.addEventListener("click", resta);
botonMultiplicacion.addEventListener("click", multiplicacion);
botonDivision.addEventListener("click", division);


/**Manipulaciòn del DOM
-Metodos para acceder a elementos
  *document.getElementById
  *document.getElementByTagName
  *document.getElementByClassName

-Metodos para crear elementos
  *document.createElement(etiqueta)
  *document.createTexNode (texto)

-Metodos para insertaar elementos
  *parentElement.append
  *parentElement.insertBefore
  *parentElement.inserAdjacentElement

-Metodos para modificar elementos
  *node.outerHTML (leer o referenciar el elemento)
  *node.innerHTML (modificar el elemento)
 */




//   En malas practicas se incrusta un evento desde HTML (revolviendo entre html y JS):

//   Esto iria en HTML:  <button onmouseover="cambiarColor(blue)" id="botonSuma" class="botones">Suma</button>
//    esto aquí:
//  //Primer paso: Definir con que voy a interactuar (almaceno en una variable)
// const textoAModificar = document.querySelector("#h1")

// //Creo una funcion que cambia de color, segun el color que le paso como parametro
// function cambiarColor(color){
//     textoAModificar.style.color = color;
// }