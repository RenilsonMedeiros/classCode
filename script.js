var button = document.getElementsByTagName("Button")[0]

var nome = document.getElementById("nome")
var cargo = document.getElementById("cargo")
var estadoCivil = document.getElementById("estadoCivil")

let checkTermos = document.getElementById("checkTermos")

var texto = document.getElementById("texto");

button.addEventListener("click", e => funcaoClick(e))

function funcaoClick(e) {
  e.preventDefault()

  if(checkTermos.checked) {
    texto.innerHTML = ""
    window.location.href = "http://www.devmedia.com.br";
  } else {
    texto.innerHTML = "Marque nossos termos de cadastro!"
  }
}

