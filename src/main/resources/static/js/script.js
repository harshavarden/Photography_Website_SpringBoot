document.addEventListener("DOMContentLoaded", function() {
    const form = document.querySelector("form");
    form.addEventListener("submit", async function(event) {
        event.preventDefault();
        const formData = new FormData(form);
        const response = await fetch(form.action, {
            method: "POST",
            body: formData,
        });
        const message = await response.text();
        document.querySelector("p").innerText = message;
    });
});

