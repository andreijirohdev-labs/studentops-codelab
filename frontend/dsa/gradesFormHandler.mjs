import { PDFDocument, rgb, StandardFonts, PageSizes } from 'https://cdn.skypack.dev/pdf-lib';
let grades = document.getElementById("gradesForm");
let sortedOutput = document.getElementById("sortedResult");
let yearSemesterSelect = document.getElementById("yearSemesterPreset");
let quarterSelect = document.getElementById("quarterPreset");
let subjectInputs = document.querySelectorAll('#gradesGrid input[name="subject"]');

function escapeHtml(str) {
  return String(str)
    .replace(/&/g, "&amp;")
    .replace(/</g, "&lt;")
    .replace(/>/g, "&gt;")
    .replace(/"/g, "&quot;")
    .replace(/'/g, "&#039;");
}

const YEAR_SEMESTER_SUBJECTS = {
  y1s1: [
    "Introduction to Computing",
    "Computer Programming 1",
    "Mathematics in the Modern World",
    "Purposive Communication",
    "Understanding the Self",
    "Art Appreciation",
    "PATHFIT 1: Movement Competency Training",
    "National Service Training Program 1",
  ],
  y1s2: [
    "Computer Programming 2",
    "Data Analysis",
    "Discrete Structures",
    "Ethics",
    "Science, Technology, and Society",
    "The Contemporary World",
    "PATHFIT 2: Fitness Training",
    "National Service Training Program 2",
  ],
  y2s1: [
    "Data Structures and Algorithms",
    "Human-Computer Interaction",
    "Life and Works of Rizal",
    "Object-Oriented Programming",
    "P.E./PATHFIT 3: Individual-Dual Sports",
    "Platform Technology (Operating Systems)",
    "Principles of Communication",
    "Readings in Philippine History",
  ],
  y2s2: [
    "Information Management",
    "Web Systems and Technologies",
    "Quantitative Methods",
    "Networks and Communications",
    "Technical Communication",
    "PATHFIT 4: Sports / Team Sports",
  ],
  y3s1: [
    "Systems Analysis and Design",
    "Software Engineering",
    "Mobile Programming",
    "Information Assurance and Security",
    "Philippine Popular Culture",
  ],
  y3s2: [
    "Capstone Project 1",
    "Advanced Database Systems",
    "Cloud Computing",
    "Web Development 2",
  ],
  y4s1: [
    "Capstone Project 2",
    "Systems Administration and Maintenance",
    "Professional Issues in Information Systems",
  ],
  y4s2: [
    "Practicum / Internship",
  ],
};

const QUARTERS = ["Prelims", "Midterms", "Prefinals", "Finals", "Final Grade"];

function applyPresets() {
  const selectedYearSem = yearSemesterSelect?.value;
  const selectedQuarter = quarterSelect?.value;

  if (selectedQuarter === "allQuarters") {
    subjectInputs.forEach((input, index) => {
      input.value = QUARTERS[index] || "";
    });
    return;
  }

  if (selectedYearSem && YEAR_SEMESTER_SUBJECTS[selectedYearSem]) {
    const subjects = YEAR_SEMESTER_SUBJECTS[selectedYearSem];
    subjectInputs.forEach((input, index) => {
      input.value = subjects[index] || "";
    });
    return;
  }

  if (!selectedYearSem && !selectedQuarter) {
    subjectInputs.forEach((input) => {
      input.value = "";
    });
  }
}

yearSemesterSelect?.addEventListener("change", () => {
  if (quarterSelect?.value === "allQuarters") {
    quarterSelect.value = "";
  }
  applyPresets();
});

quarterSelect?.addEventListener("change", () => {
  if (quarterSelect.value === "allQuarters" && yearSemesterSelect) {
    yearSemesterSelect.value = "";
  }
  applyPresets();
});

function sortGrades(formData) {
  let result = [];
  let sortedResult = [];

  // loop through the subject and grade fields and push them to the result array as objects
  for (let i = 0; i < formData.getAll("subject").length; i++) {
    let subject = formData.getAll("subject")[i];
    let grade = formData.getAll("grade")[i];
    
    // only push to result if both subject and grade are present
    if (subject && grade) {
      result.push({ subject, grade });
    }
  }

  // sort the result array by grade in descending order
  return result.sort((a, b) => b.grade - a.grade);
}

async function printToPdf(sortedResult) {
  const pdfDoc = await PDFDocument.create();
  const page = pdfDoc.addPage(PageSizes.Letter);
  const { width, height } = page.getSize();

  const heading1Font = await pdfDoc.embedFont(StandardFonts.HelveticaBold);
  const bodyFont = await pdfDoc.embedFont(StandardFonts.Helvetica);
  const bodyBoldFont = await pdfDoc.embedFont(StandardFonts.HelveticaBold);

  // Determine metadata
  const selectedYearSemText = yearSemesterSelect?.value ? yearSemesterSelect.selectedOptions[0]?.text : null;
  const selectedQuarter = quarterSelect?.value || null;

  // Title
  let title = 'Grade Report';
  let subtitle = '';

  if (selectedYearSemText && selectedQuarter && selectedQuarter !== 'allQuarters') {
    title = 'Grade Report';
    subtitle = `${selectedYearSemText} — ${selectedQuarter}`;
  } else if (selectedYearSemText) {
    title = 'Grade Report';
    subtitle = selectedYearSemText;
  } else if (selectedQuarter && selectedQuarter !== 'allQuarters') {
    title = 'Grade Report';
    subtitle = selectedQuarter;
  } else if (selectedQuarter === 'allQuarters') {
    title = 'Grade Report - Quarters Breakdown';
  }

  let currentY = height - 50;

  // Draw Title
  page.drawText(title, {
    x: 50,
    y: currentY,
    size: 20,
    font: heading1Font,
    color: rgb(0.1, 0.1, 0.1),
  });

  if (subtitle) {
    currentY -= 20;
    page.drawText(subtitle, {
      x: 50,
      y: currentY,
      size: 12,
      font: bodyBoldFont,
      color: rgb(0.35, 0.35, 0.35),
    });
  }

  currentY -= 25;

  // Table Configuration
  const tableX = 50;
  const tableWidth = width - 100; // 512 pt on Letter
  const colSubjectWidth = tableWidth - 100;
  const colGradeWidth = 100;
  const rowHeight = 24;

  // Draw Table Header
  page.drawRectangle({
    x: tableX,
    y: currentY - rowHeight,
    width: tableWidth,
    height: rowHeight,
    color: rgb(0.92, 0.94, 0.97),
    borderColor: rgb(0.7, 0.75, 0.8),
    borderWidth: 1,
  });

  const headerSubjectLabel = selectedQuarter === 'allQuarters' ? 'Quarter / Period' : 'Subject / Course';
  const headerGradeLabel = selectedQuarter && selectedQuarter !== 'allQuarters' ? `${selectedQuarter} Grade` : 'Grade';

  page.drawText(headerSubjectLabel, {
    x: tableX + 10,
    y: currentY - 16,
    size: 11,
    font: bodyBoldFont,
    color: rgb(0.1, 0.1, 0.1),
  });

  page.drawText(headerGradeLabel, {
    x: tableX + colSubjectWidth + 10,
    y: currentY - 16,
    size: 11,
    font: bodyBoldFont,
    color: rgb(0.1, 0.1, 0.1),
  });

  currentY -= rowHeight;

  // Draw Table Rows
  sortedResult.forEach((item, index) => {
    const isEven = index % 2 === 0;
    const rowColor = isEven ? rgb(1, 1, 1) : rgb(0.97, 0.98, 0.99);

    // Row Background & border
    page.drawRectangle({
      x: tableX,
      y: currentY - rowHeight,
      width: tableWidth,
      height: rowHeight,
      color: rowColor,
      borderColor: rgb(0.85, 0.85, 0.85),
      borderWidth: 0.5,
    });

    // Subject text
    page.drawText(String(item.subject), {
      x: tableX + 10,
      y: currentY - 16,
      size: 10,
      font: bodyFont,
      color: rgb(0.15, 0.15, 0.15),
    });

    // Grade text
    page.drawText(String(item.grade), {
      x: tableX + colSubjectWidth + 10,
      y: currentY - 16,
      size: 10,
      font: bodyBoldFont,
      color: rgb(0.1, 0.1, 0.1),
    });

    currentY -= rowHeight;
  });

  const pdfBytesResult = await pdfDoc.save();
  const pdfFileBlob = new Blob([pdfBytesResult], { type: "application/pdf" });

  // Open in new tab or trigger download
  const url = URL.createObjectURL(pdfFileBlob);
  window.open(url);
}

async function gradeHandler(event) {
  event.preventDefault();

  const clickedButton = event.submitter;
  const formData = new FormData(grades);
  const sortedResult = sortGrades(formData)

  // display the sorted result in the sortedOutput div
  sortedOutput.innerHTML = "";
  
  if (!sortedResult.length) {
    let div = document.createElement("p");
    div.innerHTML = `No results available`;
    sortedOutput.appendChild(div);
  } else {
    const selectedYearSemText = yearSemesterSelect?.value ? yearSemesterSelect.selectedOptions[0]?.text : null;
    const selectedQuarter = quarterSelect?.value || null;

    let subtitle = "";
    if (selectedYearSemText && selectedQuarter && selectedQuarter !== "allQuarters") {
      subtitle = `${selectedYearSemText} — ${selectedQuarter}`;
    } else if (selectedYearSemText) {
      subtitle = selectedYearSemText;
    } else if (selectedQuarter && selectedQuarter !== "allQuarters") {
      subtitle = selectedQuarter;
    } else if (selectedQuarter === "allQuarters") {
      subtitle = "Quarters Breakdown";
    }

    const headerSubjectLabel = selectedQuarter === "allQuarters" ? "Quarter / Period" : "Subject / Course";
    const headerGradeLabel = selectedQuarter && selectedQuarter !== "allQuarters" ? `${selectedQuarter} Grade` : "Grade";

    const tableContainer = document.createElement("div");
    tableContainer.className = "reportTableContainer";

    let subtitleHtml = subtitle ? `<h4 class="reportSubtitle">${subtitle}</h4>` : "";

    let rowsHtml = sortedResult.map((item) => `
      <tr>
        <td>${escapeHtml(item.subject)}</td>
        <td class="gradeCol">${escapeHtml(item.grade)}</td>
      </tr>
    `).join("");

    tableContainer.innerHTML = `
      <h3 class="reportTitle">Grade Report</h3>
      ${subtitleHtml}
      <table class="reportTable">
        <thead>
          <tr>
            <th>${headerSubjectLabel}</th>
            <th class="gradeCol">${headerGradeLabel}</th>
          </tr>
        </thead>
        <tbody>
          ${rowsHtml}
        </tbody>
      </table>
    `;

    sortedOutput.appendChild(tableContainer);
  }

  if (clickedButton.id == "printToPdf") {
    if (sortedResult.length > 0) {
      printToPdf(sortedResult);
    } else {
      window.alert("You didn't record at least one subject with grades to generate your PDF export");
    }
  }
}

grades.addEventListener("submit", gradeHandler)