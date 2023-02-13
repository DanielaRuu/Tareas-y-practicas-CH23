//Arreglo como un objeto.
//  Propiedades y metodos. length indica el largo/tamaño del arreglo

let lista = [12,5,80,34,7];
console.log(lista.length);

for (let i = 0; i< lista.length; i++){
    console.log("-->"+lista [i]);
}
console.log(lista);

let listaNueva= lista.slice(1,3)
console.log(listaNueva);

let msj = lista.join("-");
console.log(msj);

lista.push(100);
console.log(lista);

let masElements= lista.concat(100,200,300);
console.log(masElements)

lista.pop();
console.log(lista);

lista.shift();
console.log(lista);


let remover = lista.splice(1,2);
console.log(remover);
console.log(lista);
lista.splice(2,0, 100,200,300); //primer numero indica la posicion en que se insertan los nuevos numeros (2) y el segundo indica cuantos se remueven (0)
console.log(lista);

lista.reverse();
console.log(lista);

lista.sort();
console.log(lista);

lista.sort(
    function(valor1,valor2){
        return valor1 > valor2;
    }

);
console.log(lista);
