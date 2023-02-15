//Arreglo como un objeto.
//  Propiedades y metodos. 

let lista = [12,5,80,34,7];
console.log(lista.length);
//length indica el largo/tamaño del arreglo

for (let i = 0; i< lista.length; i++){
    console.log("-->"+lista [i]);
}
console.log(lista);

let listaNueva= lista.slice(1,3)
console.log(listaNueva);
// El método slice() devuelve una copia de una parte del array dentro de un nuevo array empezando por inicio hasta fin (fin no incluido).

let msj = lista.join("-");
console.log(msj);
// El método join() une todos los elementos de una matriz (o un objeto similar a una matriz) en una cadena y devuelve esta cadena.

lista.push(100);
console.log(lista);
// El método push se utiliza para agregar uno o más elementos al final de un array y devolver la nueva longitud del array actualizado.

let masElements= lista.concat(100,200,300);
console.log(masElements)

// El método concat se utiliza para concatenar dos o más arrays o cadenas y devolver el resultado como un nuevo array o cadena.

lista.pop();
console.log(lista);
// El método pop se utiliza para eliminar y devolver el último elemento de un array. Este método modifica el array original, reduciendo su longitud en uno.

lista.shift();
console.log(lista);
// El método shift elimina el elemento en el índice cero y desplaza los valores consecutivos hacia abajo, devolviendo el valor eliminado.

let remover = lista.splice(1,2);
console.log(remover);
console.log(lista);
lista.splice(2,0, 100,200,300); //primer numero indica la posicion en que se insertan los nuevos numeros (2) y el segundo indica cuantos se remueven (0)
console.log(lista);
//Metodo splice permite cambiar el contenido del arreglo eliminando o sustituyendo los elementos existentes por otros nuevos.Este método modifica el arreglo original y retorna los elementos eliminados como un nuevo arreglo.

lista.reverse();
console.log(lista);
// El método reverse se utiliza para invertir el orden de los elementos de un array. Este método modifica el array original, y no devuelve un nuevo array con los elementos invertidos.

lista.sort();
console.log(lista);

lista.sort(
    function(valor1,valor2){
        return valor1 > valor2; //esta parte es donde se le da la indiccacion de como ordenarlos, si cambiamos el orden de los valores, el orden será diferente.
    }
);
console.log(lista);

// El método sort se utiliza para ordenar los elementos de un array en su lugar, es decir, modifica el array original para que sus elementos estén en orden ascendente o descendente según el criterio de ordenamiento especificado.
// Este método sort es muy útil cuando se desea ordenar los elementos de un array de acuerdo a un criterio de clasificación específico. También se puede usar para ordenar los elementos de una tabla HTML o una lista de objetos en JavaScript.

let liNueva =lista.map(
    function(valor){
        return valor *2
    }
);
// El método map() en JavaScript se utiliza para iterar sobre cada elemento de un array y crear un nuevo array con los resultados de la operación realizada en cada elemento. Es decir, devuelve un nuevo array con la misma cantidad de elementos que el array original, pero con cada elemento transformado por una función específica.

// La sintaxis del método map() es la siguiente:

// javascript
// Copy code
// array.map(funcion(elemento, indice, array) {
//   // Aquí va el ódigo que transforma el elemento
// });

// La función que se pasa como argumento de map() toma tres parámetros:

// elemento: el valor del elemento actual del array.
// indice (opcional): la posición del elemento actual en el array.
// array (opcional): el array que se está iterando.

// En el ejercicio el método map toma cada uno de los elementos del arreglo y los procesa, es decir multiplica cada uno x el numero que le indiqué y me regresa el resultado.

