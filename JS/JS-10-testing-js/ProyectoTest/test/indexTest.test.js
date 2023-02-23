//prueba efectiva
// Aqui se enlaza/importa el artefacto de prueba (calculadora) y lo coloca en la const indexTest:
/**
const indexTest = require("../calculadora"); //ecma 5
test('test suma', () => {
    //Aquí se le indica que parte probar
    const r = indexTest.suma(3,2);
    //Aqui se le indica que es lo que espero a traves de la función toBe
    expect (r).toBe(5);
});
 * 
 */


//Otra forma de enlazar/importar artefactos
import {indexTest } from "../calculadora"; //ecma6
test('test suma', () => {
    //Aquí se le indica que parte probar
    const r = indexTest.suma(3,2);
    //Aqui se le indica que es lo que espero a traves de la función toBe
    expect (r).toBe(5);
});

test.todo('test resta');
test.todo('test multip');
test.todo('test division');
