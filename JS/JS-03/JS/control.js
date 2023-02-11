// EEstructura base:

//if (condition) {
//     Bloque código
// } else

let edad = parseInt(prompt("Escribe tu edad"));

if (edad <= 17){
    document.write("<h2>tas chiquitin</h2>");
}else if(edad ===18){
    document.write("<h2>Eres mayor de edad</h2>")

} else if (edad > 18) {
    document.write("<h2>tas ruco</h2>");
}else {
    document.write("<h2>este no es un valor valido</h2>");
}

// (5 = "5") designación
// (5 == "5") true ---------igualdad poco estricta
// (5 ==="5") false ----------igualdad estricta