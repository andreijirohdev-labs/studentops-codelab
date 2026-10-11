let profile = document.getElementById("profileForm");
let output = document.getElementById("result");

/**
 * @param {SubmitEvent} event 
 */
function handleFormSubmit(event) {
  // avoid the nightmare of page reloads
  event.preventDefault();

  const formData = new FormData(profile);

  output.textContent = `${formData.get("surname")}, ${formData.get("firstName")} ${formData.get("middleInitial")}`
}

profile.addEventListener("submit", handleFormSubmit)