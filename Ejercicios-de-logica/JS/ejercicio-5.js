let numSecreto = Math.floor(Math.random() * 100) + 1; // Genera un número aleatorio del 1 al 100
let totalIntentos = []; // Arreglo para almacenar los números que el usuario ingrese

function adivinaNum() {
  let intento = parseInt(prompt("Ingresa un número del 1 al 100 para adivinar el número secreto:"));

  // Verifica si el número ingresado es válido
  if (isNaN(intento) || intento < 1 || intento > 100) {
    alert("Error: debes ingresar un número del 1 al 100");
    adivinaNum(); // Vuelve a llamar a la función para solicitar un nuevo número
  } else {
    totalIntentos.push(intento); // Agrega el número ingresado al arreglo de números intentados

    // Verifica si el número ingresado es igual al número secreto
    if (intento === numSecreto) {
      alert("¡YEI! ¡adivinaste el número secreto! Números intentados: " + totalIntentos);
      console.log("Números intentados: "+ totalIntentos); // Imprime en la consola la lista de números intentados
    } else {
      alert("Ups, el número secreto es incorrecto :( vuelve a intentarlo.");
      adivinaNum(); // Vuelve a llamar a la función para solicitar un nuevo número
    }
  }
}

adivinaNum(); // Inicia el juego llamando a la función