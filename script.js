var button = document.getElementsByTagName("Button")[0]

var nome = document.getElementById("nome")
var cargo = document.getElementById("cargo")
var estadoCivil = document.getElementById("estadoCivil")

let checkTermos = document.getElementById("checkTermos")

var texto = document.getElementById("texto");

button.addEventListener("click", e => funcaoClick(e))

function validarCamposVazios() {
  let hasFailure = false //temFalha? FALSE -> formulário certo; TRUE -> Formulário ta errado;

  if(nome.value == "") hasFailure = true
  if(cargo.value == "") hasFailure = true
  if(estadoCivil.value == "") hasFailure = true
  if(!checkTermos.checked) hasFailure = true

  return hasFailure
}

function funcaoClick(e) {
  e.preventDefault()
  
  if(validarCamposVazios()) {
    alert("Revise os campos novamente!")
  } else {
    window.location.href = "http://www.devmedia.com.br"
  }
}
