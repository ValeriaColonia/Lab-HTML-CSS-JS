let contador = 0;

const numero = document.getElementById("contador");
const incrementar = document.getElementById("incrementar");
const decrementar = document.getElementById("decrementar");
const imagenConfeti = document.getElementById("confeti"); 

function actualizarContador() {
  numero.textContent = contador;

  if (contador === 10) {
    numero.style.color = "red";           
    imagenConfeti.style.display = "block";           
  } else {
    numero.style.color = "black";          
    imagenConfeti.style.display = "none";            
  }
}

incrementar.addEventListener("click", () => {
  contador++;
  actualizarContador();
});

decrementar.addEventListener("click", () => {
  contador--;
  actualizarContador();
});