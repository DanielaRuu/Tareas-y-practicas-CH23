// Ejercicio 1
// Tienes una lista de nombres: var nombres = ["Maria", "Antony", "Joy", "Juan"]

// Parte 1
// Escriba una función para insertar un nombre al final de la lista. Agregue su propio nombre al final de la lista.

// Parte 2
// Escribe una función que tome un nombre y verifique si la lista tiene ese nombre. Debería devolver un booleano - verdadero/falso.

// parte 3
// Escribe una función que tome una lista de nombres. Esta función debería comparar la lista tomada en la lista de nombres que tiene actualmente. La función debe devolver una matriz con los nombres que están en ambas listas.

// parte 4
// Escriba una función que tome una lista de nombres y devuelva una lista de números enteros con la longitud de los nombres en el mismo orden en que se recibieron. Sugerencia para usar la funcion push

let listaoriginal = ["Maria", "Antony", "Joy", "Juan"]

// Parte 1
function agregar(nombre){
    listaoriginal.push("Daniela")
}
agregar("Daniela");
console.log(listaoriginal);

// listaoriginal.push("Daniela")
// console.log(listaoriginal)

// Parte 2

function revisar(){
}
console.log(listaoriginal.includes("Juan"));

// Parte 3

var lista2 = ["Daniela", "Juan", "Antony", "Rosa"]
var lista3 = []

function comparar() {
  for (var i = 0; i < 4; i++) {
      for (var j = 0; j < 4; j++) {
          if(listaoriginal[i]==lista2[j]){
              lista3.push(listaoriginal[i]);
          }
      }
  }
  }
comparar();
console.log(lista3);



// Parte 4
longitudes=[]

function largodelN(){
    for(let i=0; i<listaoriginal.length;i++){
        longitudes.push(listaoriginal[i].length);
    }
}

largodelN();

console.log(longitudes);


// Ejercicio 2

// ¿A qué se refieren las siguientes expresiones?

false || (true && false); false
true || (11 + 12); true
(31 + 22) || true; true
true && (1 + 7); true
false && (3 + 4); false
(1 + 2) && true; true
(32 * 4) >= 129; false
false !== !true; true
true === 4; false
false === (847 === '847'); true
false === (887 == '887'); false
(!true || (!(100 / 5) === 20) || ((328 / 4) === 82)) || false; true

// Ejercicio 3

// Escribe una función que registre si un número está entre 0 y 25 (inclusive), entre 26 y 100 (inclusive), mayor que 100 o menor que 0.

// rango de números (25); // '25 está entre 0 y 25'
// rango de números (75); // '75 está entre 26 y 100'
// rango de números (125); // '125 es mayor que 100'
// rango de números (-25); // '-25 es menor que 0'

function rango(num) {
    if (num >= 0 && num <= 25) {
      console.log(`${num} está entre 0 y 25`);
    } else if (num >= 26 && num <= 100) {
      console.log(`${num} está entre 26 y 100`);
    } else if (num > 100) {
      console.log(`${num} es mayor que 100`);
    } else {
      console.log(`${num} es menor que 0`);
    }
  }

console.log(rango(4))
console.log(rango(-10))
console.log(rango(300))
console.log(rango(70))