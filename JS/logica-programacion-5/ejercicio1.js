let numero1 = prompt("Dame el primer numero");
let numero2 = prompt("Dame el segundo numero");
let numero3 = prompt("Dame el tercer numero");

document.getElementById("numero1").innerHTML= numero1;
document.getElementById("numero2").innerHTML= numero2;
document.getElementById("numero3").innerHTML= numero3;

array1 = [numero1, numero2, numero3];
array1.sort(function(a,b){
    return a-b;
});
document.write(array1);
document.write("este es el numero menor" + array1[0]);
document.write("este es el numero intermedio" + array1[1]);
document.write("este es el numero mayor" + array1[2]);

array1.reverse(function (a,b) {
    return a-b;
})

document.write("este es el numero mayor" + array1[0]);
document.write("este es el numero intermedio" + array1[1]);
document.write("este es el numero menor" + array1[2]);

if(array1[0]=== array1[1] || array1[1]=== array1[2] || array1[0] === array1[2]
    ){
        document.write(" Hay dos iguales")
    }