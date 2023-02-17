/*Que encontramos en el árbol de DOM?

-Nodes: Es la unidad más básica dentro del documento. Puede ser una etiqueta, un texto dentro de una etiqueta o un comentario, etc.

<title> NODO
Manipulacion DOM// Es un nodo, pero es hijo del title
</title>

-Document: También es un nodo, del tipo documento, en el nodo raíz a partir del cual se desarrollan o generan todos los demas nodos.

-Element: son todos aquellos definidos por etiquetas <div>, <img>, <h1>, <p>

-Attributes: Nodos que dan información asociada al tipo de elemento

-Comentario: Comentarios y otros elementos que estan dentro del HTML,  son considerados nodos.



*Cómo leer nodos de mi Document Onject Model (DOM)

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



//Para poner elementos o nodos en el html se usa append
document.body.append(imagenPerrito);

//Para actualizar nodos se puede de 2 formas, una es:
//1er paso: identificar el nodo que quiero cambiar (outer)
//2do paso; Modificar el nodo (inner)

//Y la otra, que es la que aplicamos:
//Identificar el nodo con un metodo para tomarlo (getElement o QuerySelector y modificarlo con inner.HTML)

var resultadoQuecambia = document.getElementById("resultado");

resultadoQuecambia.innerHTML = "Saludos, cambie el texto juas juas";




// Construir nuestra calculadora

var input = document.getElementById("input1");
var input = document.getElementById("input2");

var botonSuma = document.getElementById("botonSuma");
var botonResta = document.getElementById("botonResta");
var botonMultiplicacion = document.getElementById("botonMultiplicacion");
var botonDivision = document.getElementById("botonDivision");

var resultado = document.getElementById("resultado")