var button = document.getElementsByTagName("button")[0]
var nome = document.getElementById("nome") 
var altura = document.getElementById("altura") 
var peso = document.getElementById("peso")
var resultado = document.getElementById("resultado")
button.addEventListener("click", e => funcaoclick(e))

function funcaoclick(e) {
    // e.preventDefault()
    imc = peso.value/(altura.value*altura.value)
    resultado.innerHTML = nome.value + imc






}