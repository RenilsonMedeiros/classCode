console.log("Hello World");

var foto = document.getElementById("foto");
var fotoText = document.getElementById("fotoText");

foto.addEventListener("change", fotoAdd);

function fotoAdd() {
  fotoText.innerHTML = "Foto Adicionada";
}