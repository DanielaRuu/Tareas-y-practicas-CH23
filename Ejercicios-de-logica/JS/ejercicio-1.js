// Solicitar los tres números y guardarlos en variables
let num1 = parseInt(prompt("Ingresa el primer número"));
let num2 = parseInt(prompt("Ingresa el segundo número"));
let num3 = parseInt(prompt("Ingresa el tercer número"));

// Identificar cuál es el número mayor, el número del centro y el número menor
let max = Math.max(num1, num2, num3);
let min = Math.min(num1, num2, num3);
let mid = num1 + num2 + num3 - max - min;

// Imprimir los números ordenados de mayor a menor y de menor a mayor
console.log("Ordenado de mayor a menor:", max, mid, min);
console.log("Ordenado de menor a mayor:", min, mid, max);

// Identificar si los números son iguales y mostrar un mensaje si lo son
if (num1 === num2 && num2 === num3) {
    console.log("Los tres números son iguales");
}