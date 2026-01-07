// Book collection array
let bookCollection = [];

// Book object template
function Book(id, title, author, genre, year) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.year = year;
}

// Add Book button event
document.getElementById("addBtn").addEventListener("click", function() {
    let id = document.getElementById("id").value;
    let title = document.getElementById("title").value.trim();
    let author = document.getElementById("author").value.trim();
    let genre = document.getElementById("genre").value;
    let year = document.getElementById("year").value;

    // Validation
    if (title === "" || author === "") {
        alert("Title and Author are required!");
        return;
    }

    let book = new Book(id, title, author, genre, year);
    bookCollection.push(book);
    updateTable(book);
    clearForm();
});

// Clear form button
document.getElementById("clearBtn").addEventListener("click", clearForm);
function clearForm() {
    document.getElementById("bookForm").reset();
}

// Update table dynamically
function updateTable(book) {
    let tbody = document.getElementById("bookTable").querySelector("tbody");
    let row = document.createElement("tr");

    row.innerHTML = `<td>${book.id}</td>
                     <td>${book.title}</td>
                     <td>${book.author}</td>
                     <td>${book.genre}</td>
                     <td>${book.year}</td>`;
    tbody.appendChild(row);
}

// Export to XML file
document.getElementById("exportBtn").addEventListener("click", function() {
    let xmlContent = `<?xml version="1.0" encoding="UTF-8"?>\n<books>\n`;
    bookCollection.forEach(b => {
        xmlContent += `  <book>\n`;
        xmlContent += `    <id>${b.id}</id>\n`;
        xmlContent += `    <title>${b.title}</title>\n`;
        xmlContent += `    <author>${b.author}</author>\n`;
        xmlContent += `    <genre>${b.genre}</genre>\n`;
        xmlContent += `    <year>${b.year}</year>\n`;
        xmlContent += `  </book>\n`;
    });
    xmlContent += `</books>`;

    // Download as books.xml
    let blob = new Blob([xmlContent], {type: "application/xml"});
    let link = document.createElement("a");
    link.href = URL.createObjectURL(blob);
    link.download = "books.xml";
    link.click();
});
