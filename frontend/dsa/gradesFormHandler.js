let grades = document.getElementById("gradesForm");
let sortedOutput = document.getElementById("sortedResult");

function sortGrades(event) {
  event.preventDefault();
  let result = [];
  let sortedResult = [];

  const formData = new FormData(grades);
  console.log(formData.getAll("subject"));
  console.log(formData.getAll("grade"));

  // loop through the subject and grade fields and push them to the result array as objects
  for (let i = 0; i < formData.getAll("subject").length; i++) {
    let subject = formData.getAll("subject")[i];
    let grade = formData.getAll("grade")[i];
    
    // only push to result if both subject and grade are present
    if (subject && grade) {
      result.push({ subject, grade });
    }
  }
  console.log(result);

  // sort the result array by grade in descending order
  sortedResult = result.sort((a, b) => b.grade - a.grade);
  console.log(sortedResult);

  // display the sorted result in the sortedOutput div
  sortedOutput.innerHTML = "";
  sortedResult.forEach((item) => {
    let div = document.createElement("p");
    div.innerHTML = `${item.subject}: ${item.grade}`;
    sortedOutput.appendChild(div);
  });
}

grades.addEventListener("submit", sortGrades)