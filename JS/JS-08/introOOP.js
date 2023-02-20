//ESTRUCTURA DE DEFINICIÓN DE OBJETOS POR PROTOTIPOS. Un objeto también es una estructura de daatos, como los arreglos,tiene propiedades o atributos y también puede tener funciones o metodos:

let persona = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto: function () {
        return 'el nombre es ' + this.nombre + ' ' + this.apellido;
    }
}

// Palabra reservada -this- permite acceder a propiedades de objetos.

console.log(persona);
console.log(persona.nombre);
// Primero se llama al objeto (persona) y despues a su propiedad (nombre)
console.log(persona.nombreCompleto());