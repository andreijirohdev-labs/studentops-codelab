// Adapted from https://www.w3schools.com/w3css/w3css_tabulators.asp
function openCity(tabName, selectedButton) {
  document.querySelectorAll(".tab").forEach(tab => {
    tab.style.display = "none";
  });
  document.getElementById(tabName).style.display = "block";

  document.querySelectorAll(".tabButton").forEach(button => {
    button.classList.remove("active");
    button.setAttribute("aria-selected", "false");
  });
  selectedButton.classList.add("active");
  selectedButton.setAttribute("aria-selected", "true");
}