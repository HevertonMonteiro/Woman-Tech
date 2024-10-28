document.getElementById("feedbackForm").addEventListener("submit", function(event) {
    event.preventDefault();
    alert("Obrigado pelo seu feedback!");
    this.reset();
});
