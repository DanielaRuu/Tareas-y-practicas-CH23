let miVariable = 5;
// Variable solo guarda un valor

let miArray = [2, 3, 4, 5, 6, 7];
// Este es un arreglo de forma literal, por prototipo
// Arreglo:puede guardar varios valores, tiene que ser dentro de corchetes y cadaa daato va separado por comaas, que representan la división de casilleros. El primer dato corresponde al casillero cero, el segundo valor al casillero 1, y asi sucesivamente: casillero 0 = valor 2 casillero 1 = valor 3...
// Arreglo de tamaño 6 (el tamaño corresponde al numero de datos: tenemos 6 datos), pero con indice 5 (el indice corresponde a los casilleros, como empieza en casillero 0, el ultimo casillero es 5)

let miArray0 = new Array();
// Este es un arreglo por objeto

console.log(miArray[0]);

let miArray1 = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];
// Esta es una matriz, es decir un arreglo dentro de otro arreglo, un arreglo multidimensional
// Para este arreglo los indices parten igual desde 0, y cada subarreglo estaria ubicado en una casilla, es decir que [1,2,3] estarian en la primer casilla/indice 0, [4,5,6] en la segunda casilla/indice 1, y así sucesivamente. Para poder ubicar los valores dentro de cada subarreglo hay que entender que los indices se repiten, es decir en el arreglo [1,2,3] los casilleros/indices son 0,1,2 que se acomodan respectivamente a los valores 1,2,3 y aplican igual con los demas arreglos, entonces indice 0 corresponde también a los valores 4 y 7 de la segunda y tercer columna; indice 1 corresponde también a los valores 5 y 8 de la segunda y tercer columna respectivamente, y así sucesivamente.

console.log("miArray1" + miArray1[0][1]);
console.log("miArray1" + miArray1[0][2]);
console.log("miArray1" + miArray1[2][1]);
console.log("miArray1" + miArray1[1][2]);
console.log("miArray1" + miArray1[1][0]);
console.log("todo el indice" + miArray1[0]);
// Asi muestra todo el indice de casillero 0 [1,2,3]
console.log("todo el indice" + miArray1[1]);
// Asi muestra todo el indice de casillero 1 [4,5,6]
console.log("todo el indice" + miArray1[2]);
// Asi muestra todo el indice de casillero 2 [7,8,9]


/********CICLO FOR********/
// Es un ciclo o iterador que repite una sentencia tantas veces como se le especifique. Se usa cuando yo sé en dónde va a iniciar(i=0) y donde va a terminar(i<10)
// NOTA: ++ ó --  es un operador de incremento o decremento, significa posincremento/preincremento, va sumandole 1 al valor anterior, y repite la acción hasta llegar al tope de la prueba logica.
for (let i = 0; i < 10; i++) {
    console.log("imprimiendo i ->" + i)
}

for (let i = 10; i >= 0; i--) {
    console.log("imprimiendo i ->" + i)
}


for (let i = 0; i <=5; i++) {
    console.log("imprimiendo miArray ->" + miArray[i])
}

// 3 parametros:
// Primer parametro: para saber estado de Inicio, valor inicial let i = 0
// Segundo parametro: prueba logica para saber hasta dónde llegar siempre en base al indice, o sea  i <=5; ¡Importante recordar! el 5 hace referencia al indice(posición) no a un valor.
// Tercer parametro: el incremento i++

// let miArray1 = [
//     [1, 2, 3],
//     [4, 5, 6],
//     [7, 8, 9]
// ];

for(let i = 0; i < 3; i++){
    for(let j = 0; j < 3; j++){
        console.log("Imprimiendo la matriz1 (miArray1) ->" + miArray1[i][j]);
    }
    console.log("******************");
}

let matrizR= [
    [],[],[]
// Aqui los corchetes quedan vacios porque ahi se contendrá la informacion de la matriz
]

for(let i = 0; i < 3; i++){
    for(let j = 0; j < 3; j++){
        matrizR[i][j] = miArray1 [i][j] * miArray1[i][j];
    }
    console.log("MatrizR->" + matrizR);
}

/******************CICLO WHILE*****************/

/* Solo se ejecuta si se tiene una condicion o prueba logica. 
Tiene que tener una variable externa, y al final de while poner el incremento.
Esta es su estructura:

let variable Inicio

while (condicion) {
++;
} */

let contador = 0;
while (contador < 10) {
    console.log(contador);
    contador++;
}