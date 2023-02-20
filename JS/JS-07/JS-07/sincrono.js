// Javascript sincrono
alert("dia del michi");
console.log("Hola, buen día");
alert("dia del gatito");
console.log("adios");

// Javascript es secuencial, de procesos sincronos, bloqueantes, es decir hasta que no se ejecute la primer tarea, no puede ejecutar la segunda.

// Mecanismos callback: son asincronos, no bloqueates, permiten que las tareas puedan empezar a ejecutarse antes de que las tareas precedentes acaben de ejecutarse, casi como si fueran procesos paralelos, solo tienen una diferencia de segundos o milisegundos.

setTimeout(
    function(){
        console.log("HOLA MUNDO, CON RETRASO");
    }, 1000 )
    console.log("SORPRESA");

    // Funcion row

    const myCallback = () => console.log("Hola mundo con retraso");
    setTimeout(myCallback);

    console.log("sorpresa");
