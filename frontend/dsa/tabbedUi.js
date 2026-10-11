// Adapted from https://www.w3schools.com/w3css/w3css_tabulators.asp
function openCity(tabName) {
  document.querySelectorAll(".tab").forEach(tab => {
    tab.style.display = "none";
  });
  document.getElementById(tabName).style.display = "block"; }