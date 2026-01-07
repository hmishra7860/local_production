// Task Array
let tasks = [];

// References
const taskInput = document.getElementById("taskInput");
const taskList = document.getElementById("taskList");
const addBtn = document.getElementById("addBtn");

// Add Task Function
function addTask() {
  const taskText = taskInput.value.trim();
  console.log("Attempting to add task:", taskText);

  if (taskText === "") {
    alert("Task cannot be empty!");
    return;
  }

  // Push to array
  tasks.push(taskText);
  console.log("Current Tasks Array:", tasks);

  // Create LI
  const li = document.createElement("li");
  li.className = "taskItem";
  li.innerHTML = `${taskText} <button class="deleteBtn">Delete</button>`;

  // Add delete functionality
  li.querySelector(".deleteBtn").addEventListener("click", function() {
    taskList.removeChild(li);
    tasks = tasks.filter(t => t !== taskText);
    console.log("Task deleted. Updated Tasks:", tasks);
  });

  // Append to UL
  taskList.appendChild(li);

  // Clear Input
  taskInput.value = "";
}

// Event Listener
addBtn.addEventListener("click", addTask);
