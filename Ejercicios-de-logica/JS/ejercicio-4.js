let number;
//isNan para saber si el valor es numero
do {
  number = prompt("Introduce un número entero positivo");
} while (isNaN(number) || number < 1);

//La serie de Fibonacci comienza con 0 y 1, por lo que se asigna a las variables a y b, respectivamente. la variable fibonacci contiene el arreglo de las dos variables anteriores
let a = 0;
let b = 1;
let fibonacci = [a, b];

//para calcular el siguiente número de la secuencia, declaré c como la suma de a y b, lo agregué a la serie con el metodo push, luego se actualizan los valores de a y b, todo dentro del bucle for para que el calculo se repita.
for (let i = 2; i < number; i++) {
  let c = a + b;
  fibonacci.push(c);
  a = b;
  b = c;
}

console.log("La serie de Fibonacci con" + number + "números es: " + fibSeries);