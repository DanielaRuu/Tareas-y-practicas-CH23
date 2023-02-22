//Clase Object, es la clase mayor en la que se encuentran contenidas todas las clases, está implicito, aunque no lo tengamos graficamente en las lineas de código
// Object.

// Aqui definimos la clase
class Persona{
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;

// Métodos de acceso para objetos
// SET: Sirve para acceder al atributo nombre y asignarle un valor
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
//GET: Sirve para acceder y recuperar el valor del atributo
    get nombre(){
        return this._nombre;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }
    get apellido(){
        return this._apellido;
    }
    nombreCompleto(){
        return this._nombre + ' ' + this._apellido;
    }
//Aquí sobreescribimos el método de la clase padre Object
    toString(){
        return this.nombreCompleto();
    }
}

// Aquí creamos el objeto
let persona1 = new Persona('Juan', 'Perez');
console.log(persona1.nombreCompleto());
console.log(persona1.toString());

let persona2 = new Persona('Maria', 'Jimenez');
console.log(persona2)

let persona3 = new Persona('Jhonny', 'Deep');
persona3.nombre = 'Fulanito'  //-----> Aquí se le pude reasignar el nombre gracias a que antes configuramos el método set
console.log(persona3.nombre);
persona3.apellido = 'De tal'
console.log(persona3.apellido);


class Empleado extends Persona{
    //Palabra reservada extends sirve para hacer herencia: clase Persona, por ejemplo hereda el metodo -nombreCompleto- a la clase Empleado
    constructor(nombre, apellido, departampento){
        super(nombre, apellido);
    //Metodo super me permite acceder a la clase padre para heredar atributos
        this._departamento = departampento;
    }
    set departampento(departampento){
        this._departamento = departampento;
    }
    get departampento(){
        return this._departamento;
    }
    //Aqui estoy sobreescribiendo el método -nombreCompleto- que está en la clase Persona
    nombreCompleto(){
        return super.nombreCompleto() + ' , ' + this._departamento;
    }
}

let persona4 = new Persona('Arturo', 'Lopez');
console.log(persona4);

let empleado1 = new Empleado('Fulanito', 'De tal', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombreCompleto());
console.log(empleado1.toString());
