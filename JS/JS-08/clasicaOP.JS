//Abstracción como una clase:
class OperacionesAritmeticas{
    //constructor
    numero0 = 5;
    numero1 = 0;

    constructor(valor0, valor1){
        this.numero0 = valor0;
        this.numero1 = valor1;
    }

    sumar(){
        return this.numero0 + this.numero1;
    }
}
// En nomenclatura las clases inician con letra mayuscula. Dentro de la claase van caracteristicas, proppiedades y metodos del objeto.

//la instancia consta de los siguientes 3 pasos (lineas 15,18,21):
//1. Aqui está la declaración del objeto:
let obj1;

//2. Aquí la creación del objeto, la palabra reservada new reserva un espacio de memoria para el objeto que declaramos en la linea anterior
obj1 = new OperacionesAritmeticas()

//3. Aqui la petición, llamada o invocación
console.log(obj1.numero0);
//con el operador punto puedo llamar atributos


//Segundo objeto
let obj2 = new OperacionesAritmeticas();
console.log(obj2.sumar(5,6));

//Tercer objeto
let obj3 = new OperacionesAritmeticas();
obj3.numero0 = 3;
obj3.numero1 = 9;
console.log(obj3.sumar(obj3.numero0, obj3.numero1));

//Cuarto objeto (con llamada o peticion directa al constructor que acabamos de declarar)
let obj4 = new OperacionesAritmeticas(8, 9); 
console.log("----> " +obj4.sumar())