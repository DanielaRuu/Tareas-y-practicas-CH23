//Ejercicio:
// Crea un traductor para un día de la semana.
// Tu programa debe leer una variable llamada "diaNumero" e 
// imprimir (console.log) el día correspondiente de la semana,
//  donde 0 es domingo y 6 es sábado.

// Para cualesquiera otros valores, tu programa debe imprimir "Numero de día invalido".
// Prueba tu programa para todos los valores de días de la semana.

let diaNumero = parseInt(prompt("Escribe un numero del 0 al 6"));


if (diaNumero === 0){
    console.log ("Domingo");
} else if (diaNumero === 1){
    console.log ("Lunes");
} else if (diaNumero === 2){
    console.log ("Martes");
} else if (diaNumero === 3){
    console.log ("Miercoles");
} else if (diaNumero === 4){
    console.log ("Jueves");
} else if (diaNumero === 5){
    console.log ("Viernes");
} else if (diaNumero === 6){
    console.log ("sabado");
} else{
    console.log ("Numero de día invalido");
}

// Operadores logicos 
// and &&
// or ||
// not !

// If se puede usar con estructuras simples, sin llaves, Ejem:
// let q = true;
// let p = true;
// if (q && p) console.log ("true");