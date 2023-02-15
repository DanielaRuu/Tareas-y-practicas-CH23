let texto = "Hola Mundo";
let mensaje = "El texto tiene " + texto.length + " caracteres";
console.log(mensaje);

let mensaje1 = ""
for (let index = 0; index < texto.length; index++){
    mensaje1 += texto[index] + " ";
    // += es para concatenar
}
mensaje1 = mensaje1.trim();
console.log(mensaje1);

// length se utiliza para obtener la longitud (número de caracteres) de una cadena o el número de elementos de un array. Es importante tener claaro que length es una propiedad y no un método en sí, por lo tanto, no se utiliza como un método con paréntesis, sino que se accede directamente a la propiedad. 

// El método trim() en JavaScript se utiliza para eliminar los espacios en blanco al principio y al final de una cadena de texto.

let mensaje2 = texto.toUpperCase();
console.log(mensaje2);
// El método toUpperCase() no modifica la cadena original, sino que devuelve una nueva cadena con todas las letras convertidas a mayúsculas. 

let palabra = texto.substr(0, 4)
console.log(palabra);

// El método substr()se utiliza para extraer una parte de una cadena a partir de un índice especificado y con una longitud determinada.Este método toma dos argumentos: el índice inicial y la longitud de la subcadena que se desea extraer. El índice inicial especifica la posición en la cadena donde se debe iniciar la extracción (0), y la longitud especifica cuántos caracteres se deben extraer a partir de esa posición(4).Si se omite el segundo argumento, el método substr() extraerá la subcadena desde el índice especificado hasta el final de la cadena.
// También se puede utilizar un valor negativo para el índice inicial, lo que significa que la extracción se iniciará a partir del final de la cadena. 

let palabra1 = texto.substring(5,7);
console.log(palabra1);

// El método substring() se utiliza para extraer una parte de una cadena a partir de un índice especificado y hasta otro índice especificado, sin incluir este último. Este metodo toma dos argumentos: el índice inicial y el índice final de la subcadena que se desea extraer. El índice inicial especifica la posición en la cadena donde se debe iniciar la extracción y el índice final especifica la posición en la cadena donde se debe detener la extracción (sin incluir este último).Si se omite el segundo argumento, el método substring() extraerá la subcadena desde el índice especificado hasta el final de la cadena.
// También se puede utilizar un valor negativo para los índices, lo que significa que la extracción se iniciará a partir del final de la cadena.

// Funcion split manipula palabras
let palabra2 = texto.split(" "); //aqui identifica el espacio en blanco que se le especifica en el parentesis
 console.log(palabra2[0]+" / " + palabra2[1]); //acá se le esta especificando la primer palabra en el indice 0 y la segunda palabra en indice 1  
//  El método split() se utiliza para dividir una cadena en un array de subcadenas, utilizando un delimitador especificado. El delimitador puede ser una cadena o una expresión regular.El método split() toma un argumento opcional que especifica el delimitador a utilizar. Si se omite este argumento, el método split() dividirá la cadena en un array de caracteres.

if (texto.includes("l")) {
    console.log("---> L ");
} else{
    console.log("Ese caracter no está en el texto");
}

// El método includes() se utiliza para determinar si una cadena contiene una subcadena especificada. Este método oma un argumento que especifica la subcadena a buscar en la cadena. El método buscará esta subcadena en toda la cadena y devolverá true si la subcadena se encuentra en la cadena y false si no se encuentra.
// También se puede especificar un segundo argumento opcional para el método includes(), que especifica el índice a partir del cual se debe buscar la subcadena. 




