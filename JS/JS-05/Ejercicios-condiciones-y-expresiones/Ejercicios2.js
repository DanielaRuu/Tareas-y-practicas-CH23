// Ejercicio 1: Optimizar el siguiente codigo

// if(GPAacumulativo > 2.0){
//     if(Unidadestotales >= 1120){
//         console.log("¡Puede graduarse!");
//     }
// }

let GPAacumulativo = 2.1;
let Unidadestotales = 1120;

if (GPAacumulativo > 2.0 && Unidadestotales >= 1120) {
    console.log("¡Puede graduarse!");
}

// Ejercicio 2: Optimizar el siguiente codigo

// if(cspCalificación>= 75){
//     console.log("¡Eres elegible para la graduación!");
// }
// if (progCalificación >= 75){
//     console.log("¡Eres elegible para la graduación")
// }

let cspCalificación = 75;
let progCalificación = 75;
if (cspCalificación >= 75 && progCalificación >= 75) {
    console.log("¡Eres elegible para la graduación!");
}

// Ejercicio 3: La posibilidad de acceder a cada caracter en una cadenaa nos permite lograr efectos interesantes. En el siguiente ejercicio agrega puntos entre las letras de cadaa palabra, pero no entre las palabras
// "H.o.l.a M.u.n.d.o"
// let texto = "Hola Mundo";
// let mensaje1 = "";
// let otrotexto = texto.split("");
// for (let index = 0; index < otrotexto.length; index++){
//     mensaje1 += otrotexto[index] + ".";
// }
// console.log(mensaje1);


function agregarPuntos(frase) {
    let palabras = frase.split(" "); // Dividimos la frase en una lista de palabras
    let resultado = ""; // Creamos una cadena vacía donde almacenaremos el resultado
    for (let i = 0; i < palabras.length; i++) {
        let palabra = palabras[i];
        resultado += palabra.split("").join(".") // Agregamos un punto entre las letras de la palabra actual
        if (i < palabras.length - 1) {
            resultado += " "; // Añadimos un espacio al final de cada palabra excepto la última
        }
    }
    return resultado;
}

let frase = "Hola Mundo";
let fraseConPuntos = agregarPuntos(frase);
console.log(fraseConPuntos);

//   La función split() se utiliza para dividir la cadena en una lista de palabras, utilizando el espacio como separador. Luego, recorremos la lista de palabras con un bucle for, y para cada palabra, usamos el método split() para dividirla en una lista de letras, y el método join() para unir las letras con un punto entre ellas. Si la palabra no es la última, añadimos un espacio al final para separarla de la siguiente palabra. Finalmente, devolvemos la cadena resultante con puntos entre las letras de cada palabra.