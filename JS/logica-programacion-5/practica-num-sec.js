// Instrucciones:

// Crear un programa en Javascript que realice lo siguiente:
// Debe pedirle al usuario que intente adivinar el número secreto por prompt o por input, dicho número será del 1 al 100.
// Si el usuario no adivina el número secreto, debe mostrar un mensaje por consola o DOM diciendo: “Ups, el número secreto es incorrecto, vuelve a intentarlo. ” y volver a solicitarle que ingrese un número.
// Si el usuario adivina el número secreto debe de mostrar un mensaje por consola o DOM diciendo: “Felicidades, adivinaste el número secreto”. Además debe imprimir por consola o DOM la lista de números introducidos antes de adivinar el número secreto.
// El número secreto puede ser introducido manualmente o generar un número aleatorio, pero recuerda que debe ser del 1 al 100.
// Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar el dato.

// let numeroIngresado = prompt("Ingresa un numero del 1 al 100");


// class numeroSecreto {
//     numeroSecreto = 72;

//     constructor(numeroIngresado) {
//         this.numeroSecreto = numeroSecreto;
//     }

//     comparar() {
//         if numeroIngresado === numeroSecreto{
//             Document.write(<h1>“Felicidades, adivinaste el número secreto”</h1>);
//         }
//     } else {
//         Document.write(<h1>"Ups, el número secreto es incorrecto, vuelve a intentarlo."</h1>);
// }
// }

//Otro intento
class JuegoAdivinanza {
    constructor(numeroSecreto) {
        this.numeroSecreto = numeroSecreto;
        this.numerosIngresados = [];
    }

    jugar() {
        while (true) {
            let numeroIngresado = prompt("Ingresa un número del 1 al 100 para adivinar el número secreto");
            if (!this.validarNumero(numeroIngresado)) {
                console.log("El valor ingresado no es un número válido. Inténtalo de nuevo.");
                continue;
            }
            numeroIngresado = Number(numeroIngresado);

            this.numerosIngresados.push(numeroIngresado);

            if (numeroIngresado === this.numeroSecreto) {
                console.log("Felicidades, adivinaste el número secreto.");
                console.log("Lista de números ingresados: ", this.numerosIngresados);
                break;
            } else {
                console.log("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
            }
        }
    }

    validarNumero(numero) {
        return !isNaN(numero) && numero >= 1 && numero <= 100;
    }
}

// Ejemplo de uso
const numeroSecreto = 72;
const juego = new JuegoAdivinanza(numeroSecreto);
juego.jugar();
