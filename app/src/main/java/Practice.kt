// DIseñar algoritmo que dado un número inicial y un numero final encuentre la suma de los numeros
// pares y los impares (pares e impares)
// y haga una resta del resultado de los pares con lo de los impares

fun main () {
    var numI: Int = 1;
    var numF: Int = 10;
    var numPar: Int = 0;
    var numImPar: Int = 0;


    for (i in numI .. numF){

        if (i % 2 == 0) {
            numPar += i;
        } else {
            numImPar += i;
        }
    }

    var resta =  numImPar - numPar;
    println("La suma de los pares es: $numPar");
    println("La suma de los nos impares: $numImPar");
    println("La resta del resultado es $resta");
}