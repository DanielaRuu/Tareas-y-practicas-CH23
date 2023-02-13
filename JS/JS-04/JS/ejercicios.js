// Part 1
// There are three people waiting for the bank. Their names, in order, are Sofia, David, and Juan. Create an array that has these three names in order.

const nombres=["Sofia", "David", "Juan"];

console.log(nombres)

// Part 2
// Two more people get added to the back of the line - Sara and Augustin. The first person in line is called to the teller. What does the queue look like?


nombres.shift()
nombres.push("Sara","Agustin")

console.log(nombres)


// Part 3
// It turns out David was saving a spot for his friend Renata. She shows up and goes behind him in the line. One more person (Elena) shows up and goes to the end of the line. What does the queue look like?

nombres.splice(1,0,"Renata")
nombres.push("Elena")

console.log(nombres)



// Ejercicio 2
// Escriba un programa de JavaScript para construir el siguiente patrón, usando un bucle for anidado.

// *  
// * *  
// * * *  
// * * * *  
// * * * * *

for(let i = 1; i <= 6; ++1){
    let resultado = '';

    for(let j = 1; j<=1; ++j){
        resultado += '* ';
    }
    console.log(resultado);
}


// Ejercicio 3
// Escriba bucles while para hacer lo siguiente:

// – Imprimir repetidamente el valor de la variable xValue, disminuyéndolo en 0,5 cada vez,
// siempre que xValue siga siendo positivo.
// - Imprime todos los números impares entre 1 - 100.
// - Escriba un método con un bucle while para imprimir del 1 al n entre corchetes.
// Por ejemplo, si n = 6 imprime [1] [2] [3] [4] [5] [6]
// - Escriba un método con un bucle while que calcule la suma de los primeros n enteros positivos:
// suma = 1 + 2 + 3 + … + norte
// Ejemplos:
// n = 5 suma = 15
// n = 19 suma = 190